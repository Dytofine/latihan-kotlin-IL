package `Kotlin-OOP`

import java.lang.Exception

// try catch = ketika error ada pemberitauan

//fun main(){
//    val nullValue: String? = null
//    lateinit var mustNotNullValue: String // lateinit sebuah keyword yg bisa ngisi variable tanpa value
//
//    try{ // jika ini error
//        //Block try, contains code that raises an exception
//
//        mustNotNullValue = nullValue!!
//        println(mustNotNullValue)
//    } catch (e:Exception){// maka ini akan digunakan
//        //Block catch will be called when the exception is raised
//
//        mustNotNullValue = "String value is null"
//        println(mustNotNullValue)
//    }
//}

// EXCEPTION UNTUK MENGHANDLE HAL-HAL YANG TIDAK DIINGINKAN
// Arithmaetic Exception : perhitungan mtk

//fun main(){
//    val score = 6
//    println(score/0) /*Exception in thread "main" java.lang.ArithmeticException: / by zero */
//}

// NumberFormat Exception : angka
//fun main(){
//    val score = "80.0"
//    println(score.toInt()) /*Exception in thread "main" java.lang.NumberFormatException: For input string: "80.0" */
//}

// NullPointer Exception : yang bersifat null

//fun main() {
//    val strNullValue:String? = null // tanda tanya boelh null
//    val strMustNotNullValue:String = strNullValue!!
//    println(strMustNotNullValue) /*Exception in thread "main" java.lang.NullPointerException */
//}