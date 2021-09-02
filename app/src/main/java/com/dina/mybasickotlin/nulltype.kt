package com.dina.mybasickotlin

fun main() {
    // ? (null- safety) artinya boleh null / data boleh kosong
    val nama : String?
    val umur : String?
    nama = "Dina"
    umur = null

    println(nama)
    println(umur)
    //
    var kosong  : String? = null
    val kosongan : Int? = null
    val kekosongan : Array<String>? = null

    kosong =" Dina angelina"
    println(kosong)

        val name : String? = null
    if (name != null){
        println(name.length)
    }else {
        println("no name")
    }
}