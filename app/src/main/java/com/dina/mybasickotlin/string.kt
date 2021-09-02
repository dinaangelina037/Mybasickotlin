package com.dina.mybasickotlin

fun main() {
    val basmallah = "Bismillah"
    for (b in basmallah) {
        println(b)
    }

    val karakterPertama = basmallah[0]
    val karakterTerakhir = basmallah[8]
    val lastChar = basmallah.last()

    val supr = "Dina" + 19
    println(supr + "Dev")

    val s = "Angelina"
    println("$s.length is ${s.length}")
}
/** penggabungan 2 var string
  bisa mengunakan tanda plus */


    var name = "dina" + 19
    var lanjutan  = "Angelina"
