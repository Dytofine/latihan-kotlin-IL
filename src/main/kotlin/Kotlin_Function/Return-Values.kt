package Kotlin_Function

fun main(){
    val color =  "grey"
    val onLight = turnOnLight(color)
    println(onLight)
}

fun turnOnLight(color:String):String{
    return "$color light is my lamp"
}

