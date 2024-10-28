package xyz.zaldev.model.oop

class Car (var name: String, var price: Double = 0.0, var fuel: String) {
    // menuliskan block body property ketika menggunakan primary constructor
    init {
        this.name = name
        this.price = if (this.price > 0.0) this.price else 0.0
        this.fuel = fuel
    }

    fun start() {
        println("$name is starting...")
    }

    fun stop() {
        println("$name is stopping...")
    }

    override fun toString(): String {
        return "Car(name='$name', price=$price, fuel='$fuel')"
    }
}