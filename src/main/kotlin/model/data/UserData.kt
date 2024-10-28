package xyz.zaldev.model.data

// data class is a simple class to store data
// automatically, data class has built in method .copy(), .toString(), .hashCode(), .equal()
// should have a constructor with at least 1 parameter
data class UserData(var name: String, var age: Int) {
    fun intro() {
        println("Hello, my name is $name, and i am $age years old")
    }
}