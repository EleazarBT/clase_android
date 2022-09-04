package com.ele.agenda.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ele.agenda.ContactAdapter
import com.ele.agenda.R
import com.ele.agenda.data.Contact

class ContactActivity : AppCompatActivity() {
    lateinit var rvContact: RecyclerView
    lateinit var contacts: ArrayList<Contact>
    lateinit var contactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvContact = findViewById(R.id.rvContact)
        loadContacts()
        contactAdapter = ContactAdapter(contacts)
        rvContact.adapter = contactAdapter
        rvContact.layoutManager = LinearLayoutManager(this)
    }

    private fun loadContacts() {
        contacts = ArrayList()
        contacts.add(Contact("Ele", "123456789"))
        contacts.add(Contact("Ppe", "123456789"))
        contacts.add(Contact("Lle", "123456789"))

    }
}