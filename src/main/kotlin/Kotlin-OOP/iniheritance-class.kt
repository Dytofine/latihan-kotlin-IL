package `Kotlin-OOP`

open class Manusia(val nama:String, val beratBadan:Double, val umur:Int, val jenisKelamin: Boolean){

    open fun belajar(){
     println("$nama sedang belajar")
    }

    open fun makan(){
        println("$nama sedang makan")
    }
}

class Mahasiswa(pNama:String,pBeratBadan:Double,pUmur:Int,pJenisKelamin:Boolean, val NIM: String)
    :Manusia(pNama,pBeratBadan,pUmur,pJenisKelamin){

    override fun belajar() {
        println("$nama belajar dengan dosen")
    }

    override fun makan() {
        println("$nama sedang memakan ayam")
    }

    fun tidur(){
        println("$nama sedang tidur")
    }
}

fun main(){
    val sekar = Mahasiswa("Sekar",2.5,20,true,"12134")
    sekar.belajar()
    sekar.makan()
    sekar.tidur()
}