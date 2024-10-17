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

//    // string template
//    val workingHour = Random.nextInt(1, 10)
////    println("You have ${if (workingHour > 8) "overtime" else "normal"} working hour -> $workingHour")
//
//    // control flow
//    if (workingHour in 5 .. 8) {
//        println("You have ideal working hour -> $workingHour")
//    } else if (workingHour < 5) {
//        println("You are part time employee -> $workingHour")
//    } else {
//        println("You are over timed employee -> $workingHour")
//    }
//
//    // number data types
//    val intNumber: Int = 120 // 32 bit
//    val shortNumber: Short = 321 // 16 bit
//    val byteNumber: Byte = 127 // 8 bit
//    val longNumber: Long = 127000000L // 64 bit
//
//    println(intNumber.dec()) // decrement (-1) without assign it to it's variable
//    println(shortNumber.inc()) // decrement (+1) without assign it to it's variable
//    println(shortNumber)
//    println(longNumber.inv())  // invert /  multiply by -1
//    println(byteNumber.div(2)) // divide and throw the number after comma away
//    println(intNumber.compareTo(10)) // result 1 if intNumber is higher than 10
//    println(intNumber.compareTo(120)) // result 0 if intNumber is equal with 120
//    println(intNumber.compareTo(130)) // result -1 if intNumber is lower than 130
//    println(Int.MAX_VALUE)
//    println(Int.MIN_VALUE)
//
//    // decimal data types
//    val floatNumber: Float = 127F // decimal with 32 bit - with suffix F
//    val floatNumber2: Float = 127.1234567890F // only 5 digits after comma
//    val doubleNumber: Double = 19999999.0 // decimal with 64 bit - can accept 16 digits after comma
//    println(floatNumber.minus(2))
//    println(floatNumber)
//    println(floatNumber2) // 127.12346
//    println(floatNumber.plus(2.0))
//    println(doubleNumber.rem(2))
//    println(doubleNumber.times(3))
//
//    // array
//    val mixArrays = arrayOf(0, 2, 3, 4, 5.001F, 6.1239, "asd", true, null)
//    for (num in mixArrays) {
//        print("$num ")
//    }
//    println(mixArrays) //  printing hashcode (reference)
//
//    val numbers = intArrayOf(1,2,3,4,5)
//    for (num in numbers) {
//        print("${num.times(2)} ")
//    }
//    println(numbers) // printing hashcode (reference)
//
//    // this way only copy the reference
//    val ondNumbers = numbers
//    println(numbers)
//    println(ondNumbers)
//
//    ondNumbers[0] = 2 // this way assign array numbers also cause they have the same reference
//
//
//    println("numbers length: $numbers.size")
//    println("numbers[2]: ${numbers.get(2)}")
//
//    // copy by value
//    val newNumbers = numbers.clone()
//    newNumbers.set(2, 100)
//
//    for (num in numbers) {
//        print("$num ")
//    }
//    println()
//
//    for (num in ondNumbers) {
//        print("$num ")
//    }
//    println()
//
//    for (num in newNumbers) {
//        print("$num ")
//    }
//    println()

    // nullable
//    val notNullType: String = null // null pointer exception
//    val nullType: String? = ""
//    val nullType2: String? = "     " // the spaces string will return false if checked using .isNullOrEmpty
//    println(nullType.isNullOrBlank())
//    println(nullType2.isNullOrBlank())
//    println(nullType.isNullOrEmpty()) // true
//    println(nullType2.isNullOrEmpty()) // false

    // safe call
    val nullString: String? = null
    val nullNumber: Int? = nullString?.length // null, cause nullString is null .length is not executed
    println(nullNumber)

    // itenerary
    val textLength = nullString?.length ?: 0
    println(textLength)
}