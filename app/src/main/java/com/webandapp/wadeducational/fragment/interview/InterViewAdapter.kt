package com.webandapp.wadeducational.fragment.interview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.webandapp.wadeducational.R


class InterViewAdapter(var context: Context) : RecyclerView.Adapter<InterViewAdapter.CourseHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseHolder {
        val view = CourseHolder(LayoutInflater.from(context).inflate(R.layout.row_interview_que, parent, false))

        return view
    }

    @SuppressLint("InflateParams")
    override fun onBindViewHolder(holder: CourseHolder, position: Int) {
        holder.down.setOnClickListener {
            holder.answerView.visibility = View.VISIBLE
            holder.up.visibility = View.VISIBLE
            holder.down.visibility = View.GONE
        }

        holder.up.setOnClickListener {
            holder.answerView.visibility = View.GONE
            holder.up.visibility = View.GONE
            holder.down.visibility = View.VISIBLE
        }

    }

    override fun getItemCount(): Int {
        return 5;
    }

    inner class CourseHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var up = itemView.findViewById<ImageView>(R.id.iv_up)
        var down = itemView.findViewById<ImageView>(R.id.iv_down)
        var answerView = itemView.findViewById<CardView>(R.id.answerView)

    }

}
