//fun main(){
//    var element:String = "Fire"
//    element = "Water"
//    println(element)
//}

//fun main(){
//    val element:String = "Fire"
//    element = "Water"
//    println(element)
//} Data type


//fun main() {
//    //Data type:character
//
//    var angka = 1
//
//    println("Komunitas " + angka++)
//    println("Komunitas " + angka++)
//    println("Komunitas " + angka++)
//    println("************")
//    println("Komunitas " + angka--)
//    println("Komunitas " + angka--)
//    println("Komunitas " + angka--)
//}

//fun main() {
//    //Primitive type Arrays
//    val kalimat = "Aku Mau Kamu"
//    val satu = kalimat[0]
//    println("karakter pertama $kalimat yaitu $satu")
//}

//fun main(){
//    val kalimat = "Budi belajar sepeda\nRama membaca buku"
//    println(kalimat)
//}
//
//fun main(){
//    val kalimat = """Ibu Budi membeli ayam,Ayah Budi membaca koran""""
//    println(kalimat)
//
//}
//fun main() {
//    var c = false
//    var d = false
//
//    println("******************************")
//    println("k && q = " + (c && d)) //false
//    println("k || q = " + (c || d)) //false
//    println("!k = " + (!c)) //true
//    println("******************************")
//}

//fun main(){
//    val a: Int = 20
//    val b: Int = 29
//    println("a > b = " + (a > b))
//    println("a < b = " + (a < b))
//    println("a >= b = " + (a >= b))
//    println("a <= b = " + (a <= b))
//    println("a == b = " + (a == b))
//    println("a != b = " + (a != b))
//}

//fun main(){
//    val k: Boolean = false
//    val l: Boolean = true
//    val m: Boolean = false
//
//    println("k.or(l) = " + k.or(l))
//    println("k.and(l) = " + k.and(l))
//    println("l.and(m) = " + k.and(m))
//}


//fun main() {
//    val a: Int = 100
//    val z: Double = 100.00
//    val f: Float = 100.00f
//    val l: Long = 1000000004L
//    val s: Short = 10
//    val b: Byte = Byte.MAX_VALUE
//    val c: Byte = Byte.MIN_VALUE
//
//    println("Int Value is " + a)
//    println("Double Value is " + z)
//    println("Float Value is " + f)
//    println("Long Value is " + l)
//    println("Short Value is " + s)
//    println("Max Value of Byte is " + b)
//    println("Min Value of Byte is " + c)
//}

//fun main() {
//
//    //Get and Set the Elements of Array
//    val komunitas = arrayOf<String>("Komunitas 1", "Komunitas 2", "Komunitas 3", "Komunitas 4")
//
//    println(komunitas.get(3))
//    println(komunitas[2])
//    println("********************")
//
//   komunitas.set(0, "Komunitas Pertama")
//    komunitas[2] = "Komunitas Ketiga"
//
//    println(komunitas[2])
//    println(komunitas.get(0))
//    println("********************")
//
//}

//Primitive type Arrays
//fun main(){
//val char = charArrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I')
//char.set(5, 'P')
//char[1] = 'D'
//
//println(char)}

//fun main() {
//    val segitiga = luasSegitiga(5, 4)
//    println("Hasilnya adalah")
//    println(segitiga)
//}
//
//fun luasSegitiga(alas: Int, tinggi: Int): Int{
//    return  alas * tinggi / 2
//}

//fun main() {
//    val kondisi = false
//    if (kondisi) {
//        println("Hasilnya adalah benar")
//    } else {
//        println("Hasilnya adalah salah")
//    }
//}
//

//fun main() {
//    //format waktu 24 jam
//    val timeOpen= 4
//    val timeClose = 12
//    val timeNow = 14
//
//
//    val statusToko = if (timeNow >= timeClose) {
//        "Toko Ditutup"
//    } else if (timeNow < timeOpen) {
//        "Toko Sedang Dibuka"
//    } else {
//        "Toko Sedang Dalam Perbaikan"
//    }
//
//    println(statusToko)
//    println("*-------------------------------------------------------*")
//
//    val x = 45
//    val y = 30
//    val hasil = if (x * 2 < y) "2x lebih kecil daripada y"
//    else "2x lebih besar atau sama dengan y"
//    println("Hasil $hasil")
//}

//fun main() {
//    //Safe calls & Elvis Operator
//    var total: String? = null
//    val safeTextLength = safeText?.length?:0
//}

//fun main(){
//    var dateOut: String? = null
//    var status = "Booked"
//
//    status = "Checkout"
//
//    if (status.equals("Checkout")){
//        dateOut = "01/10/2023 12:06:00"
//    }
//    println("Tanggal")
//    println( dateOut)
//}

//fun main() {
//    var element = "Fire Ball"
//    val s = "abc" +  "+"
//    print("Jurus $element \n")
//    println(s + "def")
//}
//

//fun main(){
//    val score = 70
//    print("Hasil: ${if(score>70) " kamu menang" else "kamu kalah"}")
//}


