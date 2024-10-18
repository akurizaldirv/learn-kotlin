package xyz.zaldev

import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // control flow
    val clock = Random.nextInt(1, 10)

    // statement control flow
    if (clock < 8) {
        println("Still on working hour")
    } else {
        println("Off working hour")
    }

    // expression control flow
    var msg = if (clock < 8) "Still on working hour" else "Off working hour"
    println("$clock : $msg")

    // when condition (switch case)
    val grade = 'A'
    when(grade){
        'A' -> println("Excellent")
        'B' -> println("Good")
        'C' -> println("Go f urself")
    }

//    // while loop
//    var counter = 1
//    while (counter < 5) {
//        println("Hello, World")
//        println(++counter)
//    }
//
//    // do loop
//    var next = 1
//    do {
//        println("Hello Again, random: $next")
//        next = Random.nextInt(0, 10)
//    } while (next != 1)

    // range
    val intRange = 1..5
    println(intRange) // 1..5
    println(intRange.step)

    val intRange2 = 1.rangeTo(10)
    println(intRange2) // 1..10

    val intRange3 = 10.downTo(1)
    println(intRange3) // 10..1

    val charRange = 'A'.rangeTo('G')
    println(5 in intRange3) // true // checking the value is in range
    println('C' !in charRange)  // false // checking the value is not in range

    // loop
    val ranges = 1 .. 5 // only accept char range and int range
    for (i in ranges) {
        print(i)
        for (c in (if (i % 2== 0) charRange else charRange.reversed())) {
            print(" $c")
        }
        println()
    }

    println()

    for (i in ranges) {
        if (i % 2 == 0) {
            continue
        }
        print("$i ")
    }

    println()
    for (i in ranges) {
        when (i) {
            in 4 .. 5 -> break
            1, 2, 3 -> println("$i")
        }
    }
}
