package xyz.zaldev.utils.enum

enum class Color(val intCode: Int, val hexCode: String) {

    RED(0xFF0000, "0xFF0000") {
        override fun printValue() {
            println("${this.name} value is $hexCode")
        }
    },
    GREEN(0x00FF00, "0x00FF00") {
        override fun printValue() {
            println("${this.name} value is $hexCode")
        }
    },
    BLUE(0x0000FF, "0x0000FF") {
        override fun printValue() {
            println("${this.name} value is $hexCode")
        }
    };

    // abstract value should be implemented by every enum data
    abstract fun printValue()
}