package com.webandapp.wadeducational.ui.myCourse

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView
import com.webandapp.wadeducational.R
import com.webandapp.wadeducational.ui.homeCoure.HomeCourseActivity


class MyCourseAdapter(var context: Context) : RecyclerView.Adapter<MyCourseAdapter.CourseHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseHolder {
        val view = CourseHolder(LayoutInflater.from(context).inflate(R.layout.row_mycourse, parent, false))

        return view
    }

    @SuppressLint("InflateParams")
    override fun onBindViewHolder(holder: CourseHolder, position: Int) {
        holder.myLayout.setOnClickListener {
            val i = Intent(context, HomeCourseActivity::class.java)
            context.startActivity(i)
        }
    }

    override fun getItemCount(): Int {
        return 10;
    }

    inner class CourseHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var myLayout: RelativeLayout = itemView.findViewById(R.id.mainlayout)
    }

}
