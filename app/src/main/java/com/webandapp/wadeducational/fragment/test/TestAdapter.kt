package com.webandapp.wadeducational.fragment.test

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.webandapp.wadeducational.R


class TestAdapter(var context: Context) : RecyclerView.Adapter<TestAdapter.CourseHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseHolder {
        val view = CourseHolder(LayoutInflater.from(context).inflate(R.layout.row_test, parent, false))

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
