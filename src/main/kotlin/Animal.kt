package xyz.zaldev

class Animal {
    var name: String = "Kucing"
        get() = field
        set(value) {
            field = value
        }

    var weight: Double = 3.2
    var age: Int = 2
    var isMammal: Boolean = true

    fun eat() {
        println("$name is eating")
    }

    fun sleep() {
        println("$name is sleeping")
    }
}