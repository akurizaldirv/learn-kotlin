package xyz.zaldev

import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    var character: Char = 'A'
//    println(character)
//    println(++character) // incrementing character unicode and print
//
//    println("\n")
//
//    // string indexing
//    val i = 2
//    val text = "Hello World!"
//    val third = text[3]
//
//    println("The third letter of $text is $third")
//    for (i in text) {
//        println(i)
//    }
//
//    // escaped string
//    println("This is how to write \"Hello World!\" with string")
//
//    println()
//    println("""
//        this is raw string
//        the indentation
//        is still here
//    """)
//
//    println("""
//        this is raw string
//        without
//        the indentation
//    """.trimIndent())

    val workingHour = Random.nextInt(1, 10)
    println("You have ${if (workingHour > 8) "overtime" else "normal"} working hour -> $workingHour")
}