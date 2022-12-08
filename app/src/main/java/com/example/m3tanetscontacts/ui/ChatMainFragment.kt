package com.example.m3tanetscontacts.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.m3tanetscontacts.MainViewModel
import com.example.m3tanetscontacts.adapter.MessageAdapter
import com.example.m3tanetscontacts.data.model.Contacts
import com.example.m3tanetscontacts.databinding.FragmentChatmainBinding


class ChatMainFragment : Fragment() {

    private lateinit var binding: FragmentChatmainBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatmainBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val contactsindex = requireArguments().getInt("contact",0)

        viewModel.initialChat(contactsindex)

        binding.toolbarUp.title = viewModel.currentContact.name

        binding.backBtn.setOnClickListener {
            findNavController().navigate(ChatMainFragmentDirections.actionChatMainFragmentToStartFragment())


        }

        binding.addFab.setOnClickListener {
            val text = binding.editText.text.toString()
            viewModel.sendMessage(text)
            binding.editText.setText("")
        }



       binding.toolbarUp.title = viewModel._currentContact.name
        binding.toolbarUp.setNavigationOnClickListener {
            findNavController().navigateUp()
        }


       val messageAdapter = MessageAdapter(viewModel._currentContact.chatHistory)
        binding.recycler.adapter = messageAdapter




    }


}