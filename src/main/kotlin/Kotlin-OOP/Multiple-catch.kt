package `Kotlin-OOP`

import java.lang.NumberFormatException

//try{
//    // Block try, contains code that raises an exception
//} catch (e: NullPointerException){
//    // Block catch will be called when a NullPointerException occurs
//} catch (e: NumberFormatException){
//    // Block catch will be called when a NumberFormatException occurs
//} catch (e: Exception){
//    // Block catch will be called when an exception occurs other than the two
//} finlly{
//    // Block finally will be called after exiting the try or catch bloch
//}

// Exception handling using try-catch

fun main(){
    val strValue: String? = null
    var intValue: Int = 0

    try {
        intValue = strValue!!.toInt()
    }catch (e: NullPointerException){
        intValue = 0
    }catch (e: NumberFormatException) {
        intValue = -1
    }finally {
        when(intValue){
            0 -> println("Catch block NullPointerException is called !")
            -1 -> println("Catch block NumberFormatException is called !")
            else -> println(intValue)
        }
    }
}