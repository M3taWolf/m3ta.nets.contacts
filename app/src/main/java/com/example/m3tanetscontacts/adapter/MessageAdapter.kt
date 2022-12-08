package com.example.m3tanetscontacts.adapter

import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.m3tanetscontacts.R
import com.example.m3tanetscontacts.data.model.Contacts

class MessageAdapter(private var dataset: List<String>)
    : RecyclerView.Adapter<MessageAdapter.ItemViewHolder>(){


        class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

            var text: TextView = view.findViewById(R.id.msg_text)


        }
        fun submitList(list: List<String>) {
            dataset = list
           notifyDataSetChanged()
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            val itemLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.message_list_item, parent, false)

            return ItemViewHolder(itemLayout)
        }

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val message = dataset[position]

            holder.text.text = message

            //holder.msg.text = item.toString()
            //holder.name.text = item.toString()

            //holder.materialCard.setOnClickListener {
            //holder.itemView.findNavController()
            //.navigate(HomeFragmentDirection.actionHomeFragmentToDetailFragment(item.name))
            //}

            //}
        }
            override fun getItemCount(): Int {
        return dataset.size
    }
}
