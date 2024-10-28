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
    // immutable
    val mixList = listOf(1, "Hello", 'W', true, 2.4F, Car(
        name = "Hyundai",
        fuel = "Gasoline"
    ))
    val charList: List<Char> = listOf('A', 'B', 'C', 'D', 'E', 'F', 'G')

//     mixList[1] = "World" // error
    println(mixList)
    println(charList)
    println(mixList[3])
    println(charList[2])
    // mixList.add("Error") // throw error -- unresolved reference add

    // mutable
    println("\n\nMutable List")
    val gradeList = mutableListOf<Int>(90, 70, 60)
    println(gradeList)
    gradeList.add(95)
    gradeList.add(75)
    gradeList.add(1, 88)
    gradeList.remove(60)
    gradeList.removeAt(gradeList.size -1)
    gradeList.add(77)
    gradeList[0] = 99
    println(gradeList)

}