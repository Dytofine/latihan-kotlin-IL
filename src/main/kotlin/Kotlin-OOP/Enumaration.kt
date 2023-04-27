package `Kotlin-OOP`

// fitur yg memungkinkan kumpulan object yg telah didefinisikan kedalam data konstan/sudah ditetapin untuk meminimalisir data error

enum class roles{
    HUSTLER, HIPSTER,HACKER
}
fun main(){
    val groupRole = roles.HACKER
    println("Your role in group is $groupRole")
}
