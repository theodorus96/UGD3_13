package com.example.coba.entity

class wisata(var name: String, var lokasi: String, var image:Int) {
    companion object{
        @JvmField
        var listOfWisata = arrayOf(
            wisata("Kepulauan Derawan","Kalimantan Timur",R.drawable.image_derawan),
            wisata("Taman Nasional Way Kambas","Lampung"),
            wisata("Pantai Parai Tenggiri","Bangka Belitung"),
            wisata("Nusa Dua","Bali"),
            wisata("Gunung Rinjani","Lombok, NTB"),
            wisata("Danau Toba","Sumatera Utara"),
            wisata("Nusa Penida","Bali"),
            wisata("Taman Laut Bunaken","Sulawesi Utara"),
            wisata("Wakatobi","Sulawesi Tenggara"),
            wisata("Kepulauan Raja Ampat","Papua Barat")
        )
    }
}