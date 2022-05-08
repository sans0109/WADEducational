package com.webandapp.wadeducational.fragment.assignment

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.webandapp.wadeducational.R
import com.webandapp.wadeducational.ui.search.CourseDetailsActivity


class AssignmentAdapter(var context: Context) : RecyclerView.Adapter<AssignmentAdapter.CourseHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseHolder {
        val view = CourseHolder(LayoutInflater.from(context).inflate(R.layout.row_assignments, parent, false))

        return view
    }

    @SuppressLint("InflateParams")
    override fun onBindViewHolder(holder: CourseHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 2;
    }

    inner class CourseHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}
