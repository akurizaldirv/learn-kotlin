package xyz.zaldev

open class Employee(protected var name: String, protected var salary: Long) {
    fun getName(): String = this.name
    fun setName(name: String) {
        this.name = name
    }

    fun getSalary(): Long = this.salary
    fun setSalary(salary: Long) {
        this.salary = salary
    }
//    var employeeName: String
//        get() = name
//        set(value) {
//            name = value
//        }
//
//    var employeeSalary: Long
//        get() = salary
//        set(value) {
//            salary = value
//        }

    open fun work() {
        println("${this.name} is working ...")
    }

    open fun meritInc(inc: Long) {
        this.salary += inc
    }

    override fun toString(): String {
        return "Employee(name='$name', salary=$salary)"
    }


}