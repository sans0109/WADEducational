package com.webandapp.wadeducational.fragment.home

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.webandapp.wadeducational.R
import com.webandapp.wadeducational.ui.homeCoure.HomeCourseActivity
import com.webandapp.wadeducational.ui.search.CourseDetailsActivity


class HomeFragmentAdapter(var context: Context) : RecyclerView.Adapter<HomeFragmentAdapter.CourseHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseHolder {
        val view = CourseHolder(LayoutInflater.from(context).inflate(R.layout.item_homecourse, parent, false))

        return view
    }


    override fun onBindViewHolder(holder: CourseHolder, position: Int) {
        holder.myLayout.setOnClickListener {
            val i = Intent(context, CourseDetailsActivity::class.java)
            context.startActivity(i)
        }
    }

    override fun getItemCount(): Int {
        return 10;
    }

    inner class CourseHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.tv_date)
        var share : ImageView = itemView.findViewById(R.id.imageView)
        var myLayout: RelativeLayout = itemView.findViewById(R.id.mainlayout)


    }

}
