//package `Kotlin-OOP`
//
//import javax.lang.model.type.ArrayType
//
////abstract class
//abstract class Human(val name:String){
//
//    // Abstract Property (Must be Overridden by Subclasses)
//    abstract var age: Int
//
//    // Non-Abstract Method
//    fun humanDetails(){
//        println("Name of the human: $name")
//        println("Age : $age")
//    }
//}
//
//class Student(name: String) : Human(name){
//    override var age = 23
//}
//
//fun main(args: Array<String>){
//    val eng = Student("Dito")
//    eng.humanDetails()
//}