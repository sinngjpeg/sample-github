package com.example.samplegithub.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.samplegithub.adapter.RepositoryAdapter
import com.example.samplegithub.databinding.FragmentRepositoryJavaBinding
import com.example.samplegithub.model.data.Repository

class RepositoryJavaFragment : Fragment() {

    private lateinit var binding: FragmentRepositoryJavaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRepositoryJavaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.cardRepository.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = RepositoryAdapter(
                arrayListOf( )
            )
        }
    }


}