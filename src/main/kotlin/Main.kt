package xyz.zaldev

import xyz.zaldev.model.data.Item
import xyz.zaldev.model.oop.Car
import xyz.zaldev.model.oop.Employee
import kotlin.math.pow

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//


lateinit var nama: String
// lateinit is a keyword to pending variable initialization
// lateinit should be out of class and using 'var'


val umur: Int by lazy {
    21
}
// lazy is a keyword to pending variable initialization
// the lazy init variable will not initialized until it's necessary to use
// lazy should be out of class and using 'val'

// extension
// function extension --- add method to class without instantiate the real class
fun Employee.die() {
    println("${this.employeeName} is dying ...")
}

// properties extension --- add new properties to class without instantiate the real class
val Employee.bill: Double
    get() = this.employeeSalary * 0.1

// infix extension
// Namun, ada beberapa syarat untuk menggunakan infix function.
// - Infix function harus merupakan sebuah member function atau extension function.
// - Harus memiliki satu parameter saja.
// - Parameter tidak boleh berupa generic dan tidak memiliki nilai default.
infix fun Int.sumTenDeret(num: Int): Int {
    var total = 0
    for (i in 1..10) {
        total += num * i
    }
    return total
}

fun main() {
//    // immutable
//    // List<*> is Immutable
//    // MutableList<*> is Mutable

    val mixList = listOf(1, "Hello", 'W', true, 2.4F, Car(
        name = "Hyundai",
        fuel = "Gasoline"
    ))
    val charList: List<Char> = listOf('A', 'B', 'C', 'D', 'E', 'F', 'G')

     // mixList[1] = "World" // error
    println(mixList)
    println(charList)
    println(mixList[3])
    println(charList[2])
    // mixList.add("Error") // throw error -- unresolved reference add

    // mutable
    println("\n\nMutable List")
    val gradeList: MutableList<Int> = mutableListOf<Int>(90, 70, 60)
    println(gradeList)
    gradeList.add(95)
    gradeList.add(75)
    gradeList.add(1, 88)
    gradeList.remove(60)
    gradeList.removeAt(gradeList.size -1)
    gradeList.add(77)
    gradeList[0] = 99
    println(gradeList)

    // Collection Operation
    println()
    println("Collection")
    println("-- Filter")
    val evenGradeList: MutableList<Int> = gradeList.filter { it % 2 == 0 }.toMutableList()
    val oddGradeList: MutableList<Int> = gradeList.filterNot { it % 2 == 0 }.toMutableList()
    println("Even: $evenGradeList")
    println("Odd: $oddGradeList")

    println("-- Map")
    val squaredGradeList: MutableList<Int> = gradeList.map { it.toDouble().pow(2).toInt() }.toMutableList()
    println("Squared: $squaredGradeList")

    println("-- Count")
    val totalHighGrade: Int = gradeList.count {it >= 80}
    println("Many High Grade: $totalHighGrade")

    println("-- Find, First Or Null, Last Or Null")
    val firstOddNumber: Int? = gradeList.find { it % 2 == 1 }
    val firstEvenNumber: Int? = gradeList.firstOrNull { it % 2 == 0 }
    val lastOddNumber: Int? = gradeList.lastOrNull {it % 2 == 1}
    println("First Even Number: $firstEvenNumber")
    println("First Odd Number: $firstOddNumber")
    println("Last Odd Number: $lastOddNumber")

    println("-- First, Last") // .first() and .last() throw exception when not found
    val firstOddNumberNotNull: Int = gradeList.first { it % 2 == 1 }
    println("First Even Number: $firstOddNumberNotNull")
    try {
        val lastOddNumberNotNUll: Int = gradeList.last {it % 2 == 3}
        println("Last Odd Number: $lastOddNumberNotNUll")
    } catch (e: Exception) {
        println(e)
    }

    println("-- Sum")
    val totalGrade: Int = gradeList.sum()
    println("Total: $totalGrade")

    println("-- Sorted")
    val sortedGradeList: List<Int> = gradeList.sorted()
    val sortedGradeListDesc: List<Int> = gradeList.sortedDescending()
    println("Sorted: $sortedGradeList")
    println("Sorted Descending: $sortedGradeListDesc")

    // loop and calculate value to current parameter
    println("-- Fold")
    val sumSquaredGrade: Int = gradeList.fold(0) { current, item ->
        println("Current $current")
        println("Item $item")
        current + (item * item)
    }
    println("Folded Result: $sumSquaredGrade")

    // just like fold, but iterate items from last index
    println("-- Fold Right")
    val sumSquaredGrade2: Int = gradeList.foldRight(0) { item, current ->
        println("Current $current")
        println("Item $item")
        current + (item * item)
    }
    println("Folded Result: $sumSquaredGrade2")

    // drop n items from first index and return new list
    println("-- drop")
    val droppedGrade = gradeList.drop(3)
    println("Dropped Grade: $droppedGrade")

    // just like drop, but from last index
    println("-- drop last")
    val droppedGrade2 = gradeList.dropLast(3)
    println("Dropped Grade 2: $droppedGrade2")

    // take n items from first index
    println("-- Take")
    val takenGrade = gradeList.take(3)
    println("Taken Grade: $takenGrade")

    // just like take, but from last index
    println("-- Take Last")
    val takenGrade2 = gradeList.takeLast(3)
    println("Taken Grade 2: $takenGrade2")



    // take specified index from list
    println("-- Slice")
    val slicedGrade = gradeList.slice(1 .. 2) // slice index 1 to before index 2
    println("Sliced Grade: $slicedGrade")

    // remove duplicate value
    println("-- Distinct")
    val mutableGrade =  gradeList.toMutableList()
    mutableGrade.addAll(listOf(22, 22, 22, 33, 44, 55, 44))
    println("Duplicated Grade: $mutableGrade")
    var distinctGrade = mutableGrade.distinct()
    println("Distinct Grade: $distinctGrade")

    // distinct by
    println("Distinct By")
    val itemList = listOf(
        Item("1", "Budi"),
        Item("1", "Buddha"),
        Item("1", "Bubu"),
        Item("2", "Chana"),
        Item("2", "Coll"),
        Item("3", "Doni"),
        Item("1", "Budi")
    )
    val distinctItemList = itemList.distinctBy { it.key }
    println("Distincted By: $distinctItemList")

    // just like split, but took Int param
    println("-- Chunked")
    var studentName = "CADIS ETRAMA DI RAIZEL"
    val splittedName = studentName.split(" ")
    val chunkedName = studentName.replace(" ", "").chunked(3)
    println("Splitted: $splittedName")
    println("Chunked: $chunkedName")

    println()
    val sequence = (1..10).asSequence()


    // eager evaluation
    // operate all items in the list (slice, distinct, chunked)
    // list: (1,2,3)
    // operations: map().filter().map()
    // flow:
    // (1, 2, 3).map()
    // (1, 2, 3).filter( it >= 2) // (2, 3)
    // (2, 3).map()



    // lazy evaluation
    // operate needed item in the list (convert to sequence first)
    // suitable for large dataset
    // sequence: (1,2,3)
    // operations: map().filter().map()

    // 1. map()
    // 1. filter( it >= 2) // false -> will not continue to next chain

    // 2. map()
    // 2. filter( it >= 2 ) true
    // 2. map()

    // 3. map()
    // 3. filter( it >= 2 ) true
    // 3. map()

    // Menerapkan operasi pada Sequence dengan println untuk melihat alur
    val result = sequence
        .map {
            val result = it * 2
            println("Mengalikan $it menjadi $result")
            result
        }
        .filter {
            println("Memeriksa apakah $it > 5")
            it > 5
        }
        .map {
            println("$it Dibagi 2")
            it / 2
        } // this .map() will not executed in lazy  if the value does not match the filter
        .toList() // Mengonversi kembali ke List

    println("Hasil akhir: $result") // Output: [6, 8, 10]
    println()

    println()


//
//    // set
//    // Set<*> is Immutable
//    // MutableSet<*> is Mutable
//    // same as list, but every content in it must be unique
//    val car1 = Car(
//        name = "Hyundai",
//        fuel = "Gasoline"
//    )
//    val car2 = car1
//
//    // immutable
//    val mixedSet1 = setOf(1, "True", 2.3, true, car1, car2) // cause car1 and car2 have the same reference, only one will included
//    val intSet1: Set<Int> = setOf(1, 2, 3, 4, 5, 6, 1, 2, 3, 4) // 1, 2, 3, 4, 5, 6
//    val intSet2: Set<Int> = setOf(5, 6, 1, 2, 3, 4) // 1, 2, 3, 4, 5, 6
//    val intSet3: Set<Int> = setOf(5, 10, 20, 30, 40, 50)
//
//    println(mixedSet1)
//    println(intSet1)
//    println(intSet2)
//    println(intSet3)
//    println(intSet2 == intSet1) // true
//    println(intSet2 == intSet3) // true
//    println(car1 in mixedSet1)
//
//    println()
//    println("Set")
//
//    // mutable
//    var intSet4: MutableSet<Int> = mutableSetOf(2,4,6,8,10)
//    intSet4.add(12)
//    intSet3.forEach(fun(value: Int) {
//        if (value %2 == 0) {
//            intSet4.add(value)
//        }
//    })
//    intSet4.remove(50)
//    println(intSet4)
//
//    val union = intSet4.union(intSet2)
//    val intersection = intSet4.intersect(intSet2)
//    val substract = intSet4 - intSet2
//    val symDiff = (intSet2 - intSet4) union (intSet4 - intSet2)
//
//
//
//    println(union)
//    println(intersection)
//    println(symDiff.sorted())
//    println(substract)
//
//    // Map
//    // Map<*> is Immutable
//    // MutableMap<*> is Mutable
//    val capital: Map<String, String> = mapOf(
//        "Jakarta" to "Indonesia",
//        "London" to "New York",
//        "New Delhi" to "India",
//        "Kuala Lumpur" to "Malaysia"
//    )
//    // printing Map Value
//    println(capital)
//    println(capital["Jakarta"])
//    println(capital["ASDASGDHASD"]) // printing null when no data found
//
//    println(capital.getValue("Jakarta"))
//    try {
//        // throw Exception when no data found
//        println(capital.getValue("ASDASGDHASD"))
//    } catch (e: Exception) {
//        println(e)
//        println(e.message)
//    }
//    println()
//    println(capital.keys) // returning Set
//    println(capital.values) // returning Collection
//    println(capital.size) // returning Int
//    for((key, value) in capital) {
//        println("$key is the Capital of $value")
//    }
//
//    println()
//    println("Mutable Map")
//    val mutableCapitals: MutableMap<String, String> = capital.toMutableMap()
//    val mutableTempCapitals: MutableMap<String, String> = mutableMapOf()
//    for ((key, value) in capital) {
//        mutableTempCapitals.put(value, key)
//    }
//    mutableCapitals.putAll(mutableTempCapitals)
//    println(mutableCapitals)

}