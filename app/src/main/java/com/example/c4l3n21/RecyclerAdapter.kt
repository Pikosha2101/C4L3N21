package com.example.c4l3n21

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.c4l3n21.databinding.RecyclerViewItemBinding

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.Holder>() {
    private lateinit var items : List<RecyclerModel>

    class Holder(item: View) : RecyclerView.ViewHolder(item)
    {
        private val binding = RecyclerViewItemBinding.bind(item)
        fun bind(recyclerModel: RecyclerModel) = with(binding){
            imageView.setImageResource(recyclerModel.image)
            textView.text = recyclerModel.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        return Holder(
            inflater.inflate(R.layout.recycler_view_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(
            items[position]
        )
    }
    fun createList(list1 : ArrayList<String>, list2: ArrayList<Int>) {
        val items1: ArrayList<RecyclerModel> = ArrayList<RecyclerModel>()
        for (i in 1..<list1.size){
            items1.add(RecyclerModel(list1[i], list2[i]))
        }
        items = items1
    }
}