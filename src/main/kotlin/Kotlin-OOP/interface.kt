package `Kotlin-OOP`

//interface pertama
interface Apel{
    fun cetakNamaApel()
    fun caraMakanApel(){
        println("Langsung Gigit")
    }
}

interface Jeruk{
  fun  cetakNamaJeruk()
   fun caraMakanJeruk(){
        println("Di kupas dulu, Baru makan")
    }
}

class Buah: Apel,Jeruk{
    override fun cetakNamaApel() {
        println("Ini apel")
    }

    override fun cetakNamaJeruk() {
        println("Ini Jeruk")
    }
}

fun main(){
    var buah = Buah()
    buah.cetakNamaApel()
    buah.caraMakanApel()

    buah.cetakNamaJeruk()
    buah.caraMakanJeruk()
}