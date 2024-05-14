package com.example.lab1.LAB

fun main (){
    val soA: Int? = 1
    val soB: Int? =2
    val tong = tinhtong(soA!!, soB!!)
    println("Tổng 2 số $soA và $soB = $tong")
    println("Hiệu 2 số $soA và $soB = ${tinhhieu(soA, soB)}")
    println("Bình phương 2 số $soA và $soB = ${binhPhuong(soA)}")
    println("Thương 2 số $soA và $soB = ${tinhThuong(soA.toFloat(), soB.toFloat()) ()}")
}
val tinhtong: (Int, Int)-> Int
    = {soA: Int, soB: Int -> (soA + soB)}

val  tinhhieu: (Int, Int)-> Int
        = {soA: Int, soB: Int -> (soA - soB)}

val binhPhuong: (Int)-> Int = {it *it}
val tinhThuong ={soA: Float, soB: Float ->{
    if (soB == 0f){
        "Số bị chia phải khác 0!"
    }else{
        val c = soA/soB
        c
    }
    soA / soB
        }
    }