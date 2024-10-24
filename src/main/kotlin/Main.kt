package xyz.zaldev

import kotlin.random.Random

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
//    // object
//    var kucing = Animal()
//    kucing.eat()
//    println(kucing.name)
//    kucing.name = "Bono"
//    println(kucing.name)
//    println(kucing.age)
//    kucing.age = 20
//    println(kucing.age)
//    kucing.motherName = "Sumiati"
//    println(kucing.motherName)
//    println(kucing)

    // primary constructor
//    val toyota: Car = Car("Toyota Supra", 12000.0, "Gasoline")
//    val mazda: Car = Car("Mazda RX8", fuel = "Electric", price = -12000.0) // named init
//
//    println(toyota)
//    toyota.name = "Toyota Supra 2024"
//    toyota.start()
//    toyota.stop()
//    println(toyota)
//
//    println(mazda)


//    // instantiate using 3 different constructors
//    val ganggang: Plant = Plant("Ganggang", "Algae", "Lorem ipsum", 1, false)
//    println(ganggang)
//
//    val mangga: Plant = Plant(family = "Tree", name = "Mango", isExtinct = true)
//    println(mangga)
//
//    val kamboja: Plant = Plant("Kamboja", "Algae", "Lorem ipsum", 1)
//    println(kamboja)
//    kamboja.setName("Kamboja X21")
//    println(kamboja.getName())
//
//    kamboja.grow()
//    kamboja.grow(5)
//
//    kamboja.cut("Bono", 4)
//    kamboja.cut(2, "Budi")

    // inheritance ---
    val manager = ManajerEmpl("Muklis", 30000000L)
    val staff = StaffEmpl("Aigo", 5000000L)

    // val animalError = Employee("asd", 1000L) // ---since it's abstract, the class cannot instantiated
    manager.workingHour = 20
    println(manager)
    println(staff)
    println(staff.die())
    println(staff.bill)

    // infix extension using
    println(5 sumTenDeret 3)

}
