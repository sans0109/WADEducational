package com.webandapp.wadeducational.fragment.video

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.webandapp.wadeducational.R
import com.webandapp.wadeducational.fragment.interview.InterViewAdapter
import org.json.JSONException
import org.json.JSONObject


class VideoAdapter(var context: Context) : RecyclerView.Adapter<VideoAdapter.CourseHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseHolder {
        val view = CourseHolder(LayoutInflater.from(context).inflate(R.layout.row_video, parent, false))

        return view
    }

    @SuppressLint("InflateParams")
    override fun onBindViewHolder(holder: CourseHolder, position: Int) {
        holder.subVideoRv.setHasFixedSize(true)
        holder.subVideoRv.layoutManager = LinearLayoutManager(context)
        getEventList(holder.subVideoRv);

    }

    override fun getItemCount(): Int {
        return 5;
    }

    inner class CourseHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
          var subVideoRv = itemView.findViewById<RecyclerView>(R.id.subVideo_RV)

    }

    private fun getEventList(rv: RecyclerView) {
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
                        val HomeCourseAdapter = SubVideoAdapter(context)
                        HomeCourseAdapter.notifyDataSetChanged()
                        rv.adapter = HomeCourseAdapter
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
    }

}
