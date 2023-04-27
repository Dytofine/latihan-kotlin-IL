package Kotlin_Function

fun main(){
    println(factorial(4))
}

fun factorial(n:Int):Int{
    return if (n==1){
        n
    }else{
        n * factorial(n-1)
    }
}
