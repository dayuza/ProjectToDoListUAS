package com.informatika19100064.teguhnugratamadayuza_19100064_todolist.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class koneksi {
    companion object{
        var retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.98.145/todolist/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var service: ApiService = retrofit.create(ApiService::class.java)
    }
}