package xyz.zaldev.model.oop

class StaffEmpl(var pName: String, var pSalary: Long, workingHour: Int = 8) : Employee(pName, pSalary)  {
    fun overtime(time: Int) {
        println("${super.name} is overtime working by $time hours")
    }

    override fun work() {
        println("${super.name} is working really hard to get another job")
    }
}