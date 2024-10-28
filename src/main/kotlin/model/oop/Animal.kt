package xyz.zaldev.model.oop

class Animal {
    var name: String by DelegateGenericClass("Default")

    var weight: Double by DelegateGenericClass(0.0)
    var age: Int by DelegateGenericClass(0)
    var isMammal: Boolean by DelegateGenericClass(false)
    var motherName: String by DelegateGenericClass("Default")

    fun eat() {
        println("$name is eating")
    }

    fun sleep() {
        println("$name is sleeping")
    }
}