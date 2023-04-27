package Kotlin_Function

var balance = 10_000

fun main(){
    val playTheGame = {
        balance -= 1_000
        println("Playing The Game")
    }
    doTransaction(playTheGame)
}

inline fun doTransaction(doPlay:()->Unit){
    println("Balance before play $balance")
    doPlay()
    println("Belance after play $balance")
}