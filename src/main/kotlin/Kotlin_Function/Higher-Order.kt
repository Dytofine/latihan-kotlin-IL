package Kotlin_Function

fun main(){
    val result = calculate(4,5,::sum)
    println(result)
}

fun sum(a:Int,b:Int) = a + b

fun calculate(a:Int,b:Int,operation:(Int,Int)->Int):Int{
    return operation(a,b)
}