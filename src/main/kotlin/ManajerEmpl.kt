package xyz.zaldev

class ManajerEmpl(pName: String, pSalary: Long): Employee(salary = pSalary, name = pName) {
    override fun work() {
        println("${super.name} ask the staff to work hard")
    }

    fun fireStaff(staff: StaffEmpl, reason: String) {
        println("${super.name} is firing ${staff.getName()} with the reason:\n\t$reason")
    }
}