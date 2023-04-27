package `Kotlin-OOP`

// T = Template, GENERIC membuat code kita menjadi lebih magic

//class Rank<T>(var rank: T){
//    fun printRank(name:String){
//        println("the rank of $name is $rank")
//    }
//}
//
//fun main(){
//    val rank = Rank<Int>(11)
//    rank.printRank("Ninja")
//
//    val rankNew = Rank<String>("First")
//    rankNew.printRank("New Ninja")
//}

fun <T>printMessage(message:T){
    println("Message is: $message")
}
fun main(){
    printMessage("Hello World")
    printMessage(123)
    val map =mapOf("Maths" to 1,"Science" to 2, "English" to 3 )
    printMessage(map)
}