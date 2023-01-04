class Employee(
    val name: String, var position: String
) {
    var label: String = "$name ($position)"
}

fun main() {
    val employee1 = Employee("Alex", "Manager")
    val employee2: Employee = Employee("Bob", "Waiter")

    println(employee1.name) // Alex
    println(employee1.position) // Manager
    println(employee2.name) // Bob
    println(employee2.position) // Waiter
    employee2.position = "Manager"
    println(employee2.position) // Manager
    println(employee1.label) // Alex (Manager)
}