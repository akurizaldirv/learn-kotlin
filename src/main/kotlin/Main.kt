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
    val toyota: Car = Car("Toyota Supra", 12000.0, "Gasoline")
    val mazda: Car = Car("Mazda RX8", fuel = "Electric", price = -12000.0) // named init

    println(toyota)
    toyota.name = "Toyota Supra 2024"
    toyota.start()
    toyota.stop()
    println(toyota)

    println(mazda)




//    if (::nama.isInitialized) {
//        println(nama)
//    } else {
////        // not initialized yet and get the error
////        // println(nama) // .Uninitialized Property Access Exception
//        println("Not Initialized")
//    }
}
