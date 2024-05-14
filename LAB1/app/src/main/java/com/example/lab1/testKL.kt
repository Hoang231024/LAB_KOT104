package com.example.lab1
//
//class testKL {
//}
fun main () {
    val a = 1
    var b = 2
    b=3
    val c=(a+b)
    val d : String = "Tổng 2 số $a và $b :$c"
    println(d)
}

fun phepChia(soA: Int, soB : Float): String{
    if (soB == 0f){
        return "Số B phải khác 0!"
    }
    val c = soA / soB
    return  "Thương hai số "
}