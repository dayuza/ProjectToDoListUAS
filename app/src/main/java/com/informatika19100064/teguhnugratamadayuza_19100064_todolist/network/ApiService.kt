package com.informatika19100064.teguhnugratamadayuza_19100064_todolist.network

import com.informatika19100064.teguhnugratamadayuza_19100064_todolist.model.ResponseActionBarang
import com.informatika19100064.teguhnugratamadayuza_19100064_todolist.model.ResponseAdmin
import com.informatika19100064.teguhnugratamadayuza_19100064_todolist.model.ResponseBarang
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiService {
    @GET("read.php")
    fun getBarang(): Call<ResponseBarang>

    @FormUrlEncoded
    @POST("create.php")
    fun insertBarang(
        @Field("waktu") namaBarang: String?,
        @Field("tanggal") jmlBarang: String?,
        @Field("kegiatan") kodeBarang: String?,
        @Field("prioritas") hargaBarang: String?
    ): Call<ResponseActionBarang>

    @FormUrlEncoded
    @POST("update.php")
    fun updateBarang(
        @Field("id") id: String?,
        @Field("waktu") namaBarang: String?,
        @Field("tanggal") jmlBarang: String?,
        @Field("kegiatan") kodeBarang: String?,
        @Field("prioritas") hargaBarang: String?
    ): Call<ResponseActionBarang>

    @FormUrlEncoded
    @POST("delete.php")
    fun deleteBarang(
        @Field("id") id: String?
    ): Call<ResponseActionBarang>

    @FormUrlEncoded
    @POST("login.php")
    fun login(
        @Field("username") username: String?,
        @Field("password") password: String?
    ): Call<ResponseAdmin>

    @FormUrlEncoded
    @POST("register.php")
    fun register(
        @Field("username") username: String?,
        @Field("password") password: String?
    ): Call<ResponseAdmin>


}