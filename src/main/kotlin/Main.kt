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
    var kucing = Animal()
    kucing.eat()
    println(kucing.name)
    kucing.name = "Bono"
    println(kucing.name)
    println(kucing.age)
    kucing.age = 20
    println(kucing.age)
    kucing.motherName = "Sumiati"
    println(kucing.motherName)
    println(kucing)


//    if (::nama.isInitialized) {
//        println(nama)
//    } else {
////        // not initialized yet and get the error
////        // println(nama) // .Uninitialized Property Access Exception
//        println("Not Initialized")
//    }
}
