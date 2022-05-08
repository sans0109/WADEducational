package com.webandapp.wadeducational.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.sample.utils.InternetConnection
import com.webandapp.wadeducational.R
import com.webandapp.wadeducational.fragment.test.TestAdapter
import org.json.JSONException
import org.json.JSONObject

class TestFragment : Fragment() {

    lateinit var courseRV: RecyclerView
    lateinit var icd: InternetConnection
    lateinit var noInteret: RelativeLayout
    lateinit var adapter: TestAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_test, container, false)

        icd = InternetConnection(requireContext())
        noInteret = view.findViewById(R.id.noInternet)
        courseRV = view.findViewById(R.id.test_Rv)
        courseRV.setHasFixedSize(true)
        courseRV.layoutManager = LinearLayoutManager(context)

        getEventsList()
        return view
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
                            adapter = TestAdapter(requireContext())
                            adapter.notifyDataSetChanged()
                            courseRV.setAdapter(adapter)
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                },
                Response.ErrorListener { }) {

            }
            val requestQueue: RequestQueue = Volley.newRequestQueue(context)
            requestQueue.getCache().clear()
            requestQueue.add(stringRequest)

        } else {
            courseRV.adapter = null
            noInteret.visibility = View.VISIBLE
        }

    }


}