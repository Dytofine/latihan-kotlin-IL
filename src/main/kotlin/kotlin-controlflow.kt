//fun main() {
//    val timeOpen= 4
//    val timeClose = 12
//    val timeNow = 14
//
//
//    val statusToko = if (timeNow <= timeClose) {
//        "Toko Ditutup"
//    } else if (timeNow < timeOpen) {
//        "Toko Sedang Dibuka"
//    } else {
//        "Toko Sedang Dalam Perbaikan"
//    }
//    println(statusToko)}

//fun main(){
//    val day = 6
//
//    when (day){
//        1,2,3,4 -> println("Hari Kerja")
//        else -> println("Hari Libur")
//    }
//}

fun main() {

    val negara = 2

    val hasil = when (negara) {
        1 -> println("Sweden")
        2 -> println("Rusia")
        3 -> println("Indonesia")
        4 -> println("Malaysia")

        else -> println("Invalid Number")
    }
    println(hasil)
}

//}fun main(args: Array<String>) {
////  when expression code 1
//    val negara = 3
//
//    when (negara) {
//        1 -> println("Sweden")
//        2 -> println("Rusia")
//        3 -> println("Indonesia")
//        4 -> println("Malaysia")
//
//        else -> println("Invalid Number")
//    }
//}

//fun main() {
////    Using ..
//    val rangeNilai = 10..20
//    println(rangeNilai.toList())
//
////    Using .rangeTo()
//    val range = 10.rangeTo(20)
//    println(range.toList())
//}

//fun main() {
////    Range step
//    val nilai = 1.rangeTo(20) step 2 //default step is 1
//    println("Step : " + nilai.step)
//    println(nilai.toList())
//
////    rangeTo() & downTo()
//    val a = 10
//    if (a !in 1.rangeTo(20)) {
//        println("Remedial")
//    }
//
//    val b = 30
//    val hasilB = if (b in 1.downTo(20)) {
//        println("Berhasil")
//    } else {
//        "Coba Kembali :)"
//    }
//    println("Hasil Ujian : $hasilB")
//}

//fun main() {
////    Using range expression
//    for (a in 1..5) {
//        println(a)
//    }
//    println("---------------------------------------")
//
////    Iterate array
//    val benua = arrayOf("Afrika", "Amerika",
//        "Australia", "Asia")
//
//    for (showBenua in benua ) {
//        println(showBenua)
//    }}
//

//fun main(){
//    // with index
//    val afrika = arrayOf("Cameroon","Mesir","Nigeria")
//    for ((index,value)in afrika.withIndex()){
//        println("value $value with index $index")
//    }
//    println("*-------------------------------------------------*")
//    // for each
//    val amerika = arrayOf("Canada","Mexico","USA")
//   amerika.forEach { value->
//       println("Negara $value") }
//    println("*-------------------------------------------------*")
//   // for each indexed
//    val asia = arrayOf("Indonesia","Malaysia","Korea")
//    asia.forEachIndexed {index, value->
//        println("Negara $value with index: $index") }
//    }

////while & do while
//fun main() {
//    var a = 0
//
//    while (a < 4) {
//        println(a + 4)
//        a++
//    }
//    println("*-------------------------------------------------*")
//    var y = 1
//    do {
//        println("$y. Hasil kuadrat $y = " + y * y)
//        y++
//    } while (y <=3)
//}


//break
//fun main() {
//    var x = 10
//    while (true) {
//        println("index $x")
//        x++
//        if (x % 2 == 0) {
//            break
//        }
//    }
//    println("*-------------------------------------------------*")
//    val y = 4
//    for (z in 3..8) {
//        println("Mancity!")
//        if (z - y >= 0) {
//            println("Champion")
//            break
//        }
//    }
//}

