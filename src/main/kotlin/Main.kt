package xyz.zaldev

import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // object
    var kucing = Animal()
    kucing.eat()
    println(kucing.name)
    kucing.name = "Bono"
    println(kucing.name)
    println(kucing.age)
    kucing.age = 20
    println(kucing.age)
    println(kucing)
}
