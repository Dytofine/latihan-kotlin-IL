//fun main(){
//    val ColorList = listOf(1,2,3)
//    println(ColorList)
//}

//fun main(){
//    val militaryList = mutableListOf("Army","Air Force","Navy")
//    println(militaryList)
//}

//fun main(){
//    val phoneList = mutableListOf("Samsung","Iphone","Xiomi")
//    println(phoneList)
//
//    phoneList[2] = "Realme"
//    println(phoneList)
//}

//fun main(){
//    val militaryList = mutableListOf(false,"Air Force",2,3.5)
//    println(militaryList)
//
//    militaryList.remove(false)
//    militaryList.set(0, "Military")
//    militaryList[2]="Air Jet"
//    militaryList.add(3,4)
//
//    println(militaryList)
//}

//fun main(){
//    val setColorA = setOf("Green","Blue","Pink","Green","Blue","Green")
//    val setColorB = setOf("Green","Pink","Blue")
//    println(setColorA == setColorB)
//}
//fun main(){
//    val setColorA = setOf("Green","Blue","Pink","Green","Blue","Green")
//    println("Blue" in setColorA)
//}

//fun main(){
//    val list1 = listOf("Kuning","Kuning",2,4,-1)
//    val list2 = setOf("Kuning","Kuning",2,3,5)
//    val list3 = mutableSetOf(6,7)
//
//    val intersect = list1 intersect list2
//    val union = list1 union list2 union list3
//
//    println(intersect)// will display the same data
//    println(union)// merge data and eliminate duplicates
//}

//fun main(){
//    val setColorA = mutableSetOf("Green","Blue","Pink","Green","Blue","Green")
//    setColorA.add("Ocean Blue")
//    setColorA.remove("Pink")
//
//    println(setColorA)
//}

//fun main(){
//    val colorMap = mapOf(
//        1 to "Yellow",
//        2 to "Green",
//        3 to "White",
//        4 to "Red",
//        5 to "Blue",
//        6 to "Red"
//    )
//    println(colorMap)
//    println(colorMap[3])
//    println(colorMap.getValue(3))
//    println(colorMap.values)
//    println(colorMap.keys)
//}

//fun main(){
//    val colorMap = mapOf(
//        1 to "Yellow",
//        2 to "Green",
//        3 to "White",
//        4 to "Red",
//        5 to "Blue",
//        6 to "Red"
//    )
//    println(colorMap)
//     val mutablecolorMap = colorMap.toMutableMap()
//    println(mutablecolorMap)
//
//    mutablecolorMap[1]="Cyan"
//    mutablecolorMap.put(7,"Black")
//
//    println(mutablecolorMap)
//}

//fun main(){
//    val numberList = listOf(1,2,3,4,5,6,7,8)
//
//    val Genap = numberList.filter { it % 2 == 0 }
//
//    val Ganjil = numberList.filterNot { it % 2 == 0 }
//
//    println(Genap)
//    println(Ganjil)
//}

//fun main(){
//    val numberList = listOf(2,4,6,8,10)
//
//    val perkalian = numberList.map { it * 3}
//    print(perkalian)
//}

//fun main(){
//    val elements = arrayOf("Earth","Wind","Water","Fire")
//
//    val totalElements = elements.count()
//    print(totalElements)
//}

//fun main() {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8)
//    val angka = numberList.find { it % 2 == 1}
//    print(angka)
//}

//fun main(){
//    val numberList = listOf(1,2,3,4,5,6,7,8)
//    val genap = numberList.find{it % 2 == 1}
//    val firstOrNullNumber = numberList.firstOrNull {it % 2 == 1}
//    val lastOrNullNumber = numberList.lastOrNull {it % 2 == 1}
//
//    println(genap)
//    println(firstOrNullNumber)
//    println(lastOrNullNumber)
//}

//fun main() {
//    val number = arrayOf(21,31,41,51,70)
//    val firstData = number.first()
//    val lastData = number.last()
//
//    println(firstData)
//    println(lastData)
//}

//fun main() {
//    val number = arrayOf(21,31,41,51,70)
//    val total = number.sum()
//
//    print(total)
//}

//fun main(){
//    val angka = listOf(1,4,2,3,5)
//    val huruf = listOf('b','d','k','a')
//
//    val ascendingSort1 = angka.sorted()
//    val ascendingSort2 = huruf.sorted()
//
//    println(ascendingSort1)
//    println(ascendingSort2)
//}

//fun main(){
//    val angka = listOf(1,4,2,3,5)
//    val huruf = listOf('b','d','k','a')
//
//    val ascendingSort1 = angka.sortedDescending()
//    val ascendingSort2 = huruf.sortedDescending()
//
//    println(ascendingSort1)
//    println(ascendingSort2)
//}