package com.example.m3tanetscontacts.adapter

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
import com.example.m3tanetscontacts.data.Repository
import com.example.m3tanetscontacts.data.model.Contacts
import com.example.m3tanetscontacts.ui.StartFragmentDirections

class ItemAdapter(
    private val dataset: MutableList<Contacts>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /**
     * der ViewHolder umfasst die View uns stellt einen Listeneintrag dar
     */
    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var image = itemView.findViewById<ImageView>(R.id.profile_pic)
        var email = itemView.findViewById<TextView>(R.id.text_view_email)
        var phone = itemView.findViewById<TextView>(R.id.text_view_number)
        var name = itemView.findViewById<TextView>(R.id.text_view_name)
        var msg = itemView.findViewById<Button>(R.id.msg_btn)
        var materialCard = itemView.findViewById<CardView>(R.id.material_card)


    }

    /**
     * hier werden neue ViewHolder erstellt
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(itemLayout)
    }

    /**
     * hier findet der Recyclingprozess statt
     * die vom ViewHolder bereitgestellten Parameter erhalten die Information des Listeneintrags
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val contacts = dataset[position]
        val repository = Repository().loadContacts()
        holder.image.setImageResource(contacts.imageResource)
        holder.name.text = contacts.name
        holder.msg.setOnClickListener {
            holder.itemView.findNavController()
                .navigate(StartFragmentDirections.actionStartFragmentToChatMainFragment(position)


                )
        }
    }


    override fun getItemCount(): Int {
        return dataset.size
    }
}








