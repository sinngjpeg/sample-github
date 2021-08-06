package com.example.samplegithub.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.samplegithub.databinding.CardRepositoryBinding
import com.example.samplegithub.model.data.Repository

class RepositoryAdapter(
    private val repositoryList: ArrayList<Repository>
) : RecyclerView.Adapter<RepositoryHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryHolder {
        val binding = CardRepositoryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return RepositoryHolder(binding)
    }

    override fun onBindViewHolder(holder: RepositoryHolder, position: Int) {
        holder.bindRepository(repositoryList[position])
    }

    override fun getItemCount() = repositoryList.size
}

class RepositoryHolder(
    private val binding: CardRepositoryBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindRepository(listItem: Repository) = with(binding) {
        listItem.run {
            binding.nameRepository.text = nameRepository
            binding.descriptionRepository.text = descriptionRepository

        }
    }
}
