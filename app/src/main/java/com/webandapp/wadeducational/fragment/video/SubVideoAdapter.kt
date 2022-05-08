package com.webandapp.wadeducational.fragment.video

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.webandapp.wadeducational.R


class SubVideoAdapter(var context: Context) : RecyclerView.Adapter<SubVideoAdapter.CourseHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseHolder {
        val view = CourseHolder(LayoutInflater.from(context).inflate(R.layout.row_sub_video, parent, false))

        return view
    }

    @SuppressLint("InflateParams")
    override fun onBindViewHolder(holder: CourseHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3;
    }

    inner class CourseHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}
