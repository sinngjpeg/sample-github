package com.example.samplegithub.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.samplegithub.model.data.ItemRepositoryJava
import com.example.samplegithub.model.data.Repository
import com.example.samplegithub.webservices.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryJavaViewModel : ViewModel() {

    val repositoryLiveData: MutableLiveData<List<Repository>> = MutableLiveData()

    fun getRepositories() {
        RetrofitService.serviceJava.getRepositories(2).enqueue(
            object : Callback<ItemRepositoryJava> {

                override fun onResponse(
                    call: Call<ItemRepositoryJava>,
                    response: Response<ItemRepositoryJava>
                ) {
                    if (response.isSuccessful) {
                        response.body()?.let { itemRepository ->
                            repositoryLiveData.value = itemRepository.itemsJava
                        }
                    }

                }

                override fun onFailure(call: Call<ItemRepositoryJava>, t: Throwable) {
                    Log.d("Erro de Chamada", t.message.toString())
                }
            })
    }
}