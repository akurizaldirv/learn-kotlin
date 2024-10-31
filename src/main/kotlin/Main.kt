package xyz.zaldev

// typealias is a custom type for function
// contains parameter type and return type

// with return type
typealias Arithmetic = (Int, Int) -> Int
// without return type
typealias DebugData = () -> Unit

fun main() {
    // without typealias
    val divide = {a: Int, b: Int -> a / b}

    // with typealias
    val sum: Arithmetic = { a, b -> a + b }
    val multiply: Arithmetic = {a, b -> a * b}

    val log: DebugData = {-> println("PRINT LOG DATA HERE")}
    val errorLog: DebugData = {-> println("PRINT ERROR LOG DATA HERE") }

    // invoke function type
    println(divide.invoke(1, 2))
    println(sum.invoke(1, 2))
    println(multiply.invoke(1, 2))

    log.invoke()
    errorLog.invoke()
}
