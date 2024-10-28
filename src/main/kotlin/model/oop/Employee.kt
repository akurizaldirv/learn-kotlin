package xyz.zaldev.model.oop

import xyz.zaldev.interfaces.IWork

abstract class Employee(protected var name: String, protected var salary: Long) : IWork {
//    fun getName(): String = this.name
//    fun setName(name: String) {
//        this.name = name
//    }
//
//    fun getSalary(): Long = this.salary
//    fun setSalary(salary: Long) {
//        this.salary = salary
//    }
    override var workingHour: Int = 8

    var employeeName: String
        get() = name
        set(value) {
            name = value
        }

    var employeeSalary: Long
        get() = salary
        set(value) {
            salary = value
        }

    override fun work() {
        println("${this.name} is working ...")
    }

    open fun meritInc(inc: Long) {
        this.salary += inc
    }

    override fun toString(): String {
        return "Employee(name = $name, employeeSalary = $salary, working = $workingHour)"
    }
}