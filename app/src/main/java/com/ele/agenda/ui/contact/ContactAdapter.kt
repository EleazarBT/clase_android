package com.ele.agenda

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ele.agenda.data.Contact

class ContactAdapter(private val contacts: ArrayList<Contact>): RecyclerView.Adapter<ContactPrototype>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactPrototype {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.prototype__contact, parent, false)
        return ContactPrototype(view)
    }

    override fun onBindViewHolder(holder: ContactPrototype, position: Int) {
        holder.bindTo(contacts[position])
    }

    override fun getItemCount(): Int {
        return contacts.size
    }


}

class ContactPrototype(itemView: View):RecyclerView.ViewHolder(itemView){
    private lateinit var tvName: TextView
    private lateinit var tvPhone: TextView
    fun bindTo(s: Contact) {
        tvName =  itemView.findViewById(R.id.tvName)
        tvPhone = itemView.findViewById(R.id.tvTelephone)
        tvName.text = s.name
        tvPhone.text = s.phone
    }

}


