package xyz.zaldev

import xyz.zaldev.model.oop.Car
import xyz.zaldev.model.oop.Employee

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
    // List<*> is Immutable
    // MutableList<*> is Mutable

//    val mixList = listOf(1, "Hello", 'W', true, 2.4F, Car(
//        name = "Hyundai",
//        fuel = "Gasoline"
//    ))
//    val charList: List<Char> = listOf('A', 'B', 'C', 'D', 'E', 'F', 'G')
//
//     // mixList[1] = "World" // error
//    println(mixList)
//    println(charList)
//    println(mixList[3])
//    println(charList[2])
//    // mixList.add("Error") // throw error -- unresolved reference add
//
//    // mutable
//    println("\n\nMutable List")
//    val gradeList: MutableList<Int> = mutableListOf<Int>(90, 70, 60)
//    println(gradeList)
//    gradeList.add(95)
//    gradeList.add(75)
//    gradeList.add(1, 88)
//    gradeList.remove(60)
//    gradeList.removeAt(gradeList.size -1)
//    gradeList.add(77)
//    gradeList[0] = 99
//    println(gradeList)

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

    // Map
    // Map<*> is Immutable
    // MutableMap<*> is Mutable
    val capital: Map<String, String> = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "New York",
        "New Delhi" to "India",
        "Kuala Lumpur" to "Malaysia"
    )
    // printing Map Value
    println(capital)
    println(capital["Jakarta"])
    println(capital["ASDASGDHASD"]) // printing null when no data found

    println(capital.getValue("Jakarta"))
    try {
        // throw Exception when no data found
        println(capital.getValue("ASDASGDHASD"))
    } catch (e: Exception) {
        println(e)
        println(e.message)
    }
    println()
    println(capital.keys) // returning Set
    println(capital.values) // returning Collection
    println(capital.size) // returning Int
    for((key, value) in capital) {
        println("$key is the Capital of $value")
    }

    println()
    println("Mutable Map")
    val mutableCapitals: MutableMap<String, String> = capital.toMutableMap()
    val mutableTempCapitals: MutableMap<String, String> = mutableMapOf()
    for ((key, value) in capital) {
        mutableTempCapitals.put(value, key)
    }
    mutableCapitals.putAll(mutableTempCapitals)
    println(mutableCapitals)

}