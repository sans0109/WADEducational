package com.webandapp.wadeducational.ui.search

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.webandapp.wadeducational.R


class SearchAdapter(var context: Context) : RecyclerView.Adapter<SearchAdapter.CourseHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseHolder {
        val view = CourseHolder(LayoutInflater.from(context).inflate(R.layout.row_search_course, parent, false))

        return view
    }

    @SuppressLint("InflateParams")
    override fun onBindViewHolder(holder: CourseHolder, position: Int) {
        holder.courseLayout.setOnClickListener {
            val i = Intent(context, CourseDetailsActivity::class.java)
            context.startActivity(i)
        }
    }

    override fun getItemCount(): Int {
        return 10;
    }

    inner class CourseHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var courseLayout = itemView.findViewById<LinearLayout>(R.id.ll_course)

    }

}
