package com.webandapp.wadeducational.ui.myCourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.sample.utils.InternetConnection
import com.webandapp.wadeducational.R
import com.webandapp.wadeducational.fragment.home.HomeFragmentAdapter
import org.json.JSONException
import org.json.JSONObject

class MyCourseActivity : AppCompatActivity() {

    lateinit var courseRV: RecyclerView
    lateinit var icd: InternetConnection
    lateinit var noInteret: RelativeLayout
    lateinit var adapter: MyCourseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_course)

        findViewById<ImageView>(R.id.backicon).setOnClickListener { finish() }

        icd = InternetConnection(this)
        noInteret = findViewById(R.id.noInternet)
        courseRV = findViewById(R.id.course_RV)
        courseRV.setHasFixedSize(true)
        courseRV.layoutManager = LinearLayoutManager(this)

        getEventsList()
    }

    private fun getEventsList() {
        if(icd.isConnected) {
            val url =
                "https://stage.swiftcampus.com/UnniversalAppAPI.php?parameter=getAllclass&school_id=1"
            val stringRequest: StringRequest = object : StringRequest(
                Request.Method.POST,
                url,
                Response.Listener<String?> { response ->
                    try {
                        val jsonObject2 = JSONObject(response)
                        val status = jsonObject2.getString("status")
                        if (status == "200") {
                            adapter = MyCourseAdapter(this)
                            adapter.notifyDataSetChanged()
                            courseRV.setAdapter(adapter)
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                },
                Response.ErrorListener { }) {

            }
            val requestQueue: RequestQueue = Volley.newRequestQueue(this)
            requestQueue.getCache().clear()
            requestQueue.add(stringRequest)

        } else {
            courseRV.adapter = null
            noInteret.visibility = View.VISIBLE
        }

    }
}