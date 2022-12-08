package com.example.m3tanetscontacts.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.m3tanetscontacts.MainViewModel
import com.example.m3tanetscontacts.R
import com.example.m3tanetscontacts.adapter.ItemAdapter
import com.example.m3tanetscontacts.adapter.MessageAdapter
import com.example.m3tanetscontacts.data.Repository
import com.example.m3tanetscontacts.databinding.FragmentStartBinding
import com.example.m3tanetscontacts.data.model.Contacts
import com.example.m3tanetscontacts.databinding.ActivityMainBinding.inflate
import com.example.m3tanetscontacts.databinding.FragmentChatmainBinding.inflate
import com.example.m3tanetscontacts.databinding.FragmentStartBinding.inflate
import com.example.m3tanetscontacts.databinding.MessageListItemBinding.inflate

class StartFragment : Fragment() {

    private val viewModel: MainViewModel by activityViewModels()
    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Die RecyclerView bekommt den ContactAdapter zugewiesen
        binding.rv.adapter = ItemAdapter(viewModel.contactList.value!!)




       // binding.addFab.setOnClickListener {
           //viewModel.addNumber()
        }
    }






        //binding.addButton.setOnClickListener {
            //val name = binding.nameText.text.toString()
            //val number = binding.phoneNrText.text.toString()
            //val email = binding.emailText.text.toString()

            //if (name == "" || number == "" || email == "") {
                //Toast.makeText(requireContext(), "PL3AS3 3NT3R INF0RMAT10N", Toast.LENGTH_SHORT)
                    //.show()

            //} else {
                //val newContact = Contacts(R.drawable.contact8, R.drawable.contact8full, name, number, email)
                //contacts.add(newContact)
                //adapter.notifyItemInserted(contacts.size - 1)
                //binding.nameText.text?.clear()
                //binding.phoneNrText.text?.clear()
                //binding.emailText.text?.clear()


