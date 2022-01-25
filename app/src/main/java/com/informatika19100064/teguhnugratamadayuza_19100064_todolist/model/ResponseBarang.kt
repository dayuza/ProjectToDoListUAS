package com.informatika19100064.teguhnugratamadayuza_19100064_todolist.model

import com.google.gson.annotations.SerializedName

data class ResponseBarang(

    @field:SerializedName( "pesan")
    val pesan: String? = null,

    @field:SerializedName("data")
    val data: List<DataItem?>? = null,

    @field:SerializedName("status")
    val status: Boolean? = null
)

data class DataItem(

    @field:SerializedName("waktu")
    val namaBarang: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("tanggal")
    val jumlahBarang: String? =null,

    @field:SerializedName("kegiatan")
    val kodeBarang: String? =null,

    @field:SerializedName("prioritas")
    val hargaBarang: String? =null
)