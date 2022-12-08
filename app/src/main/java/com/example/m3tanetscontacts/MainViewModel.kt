package com.example.m3tanetscontacts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.m3tanetscontacts.data.Repository
import com.example.m3tanetscontacts.data.model.Contacts

class MainViewModel : ViewModel() {

    private val repository = Repository()


    //

    private var _contactList = MutableLiveData(repository.loadContacts())
    val contactList: LiveData<MutableList<Contacts>>
        get() = _contactList
    //
    internal lateinit var _currentContact: Contacts
    val currentContact: Contacts
        get() = _currentContact

    fun initialChat(contactIndex: Int) {

        if (contactList.value != null){
            _currentContact = contactList.value!![contactIndex]
        }

    }fun sendMessage(text: String){
        _currentContact.chatHistory.add(0,text)

    }
}