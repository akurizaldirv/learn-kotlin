package xyz.zaldev.model.oop

class ManajerEmpl(pName: String, pSalary: Long, workingHour: Int = 8): Employee(salary = pSalary, name = pName) {
    override fun work() {
        println("${super.name} ask the staff to work hard")
    }

    fun fireStaff(staff: StaffEmpl, reason: String) {
        println("${super.name} is firing ${staff.employeeName} with the reason:\n\t$reason")
    }
}