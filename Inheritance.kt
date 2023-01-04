open class Drone {
    open val look = "Black and white"

    open fun setOff() {
        move(0.0, 10.0, 0.0)
    }

    open fun move(front: Double, up: Double, rotate: Double) {
        println("Moving $front $up $rotate")
    }
}

class SuperDrone : Drone() {
    override val look: String = "Superhero look"
    override fun setOff() {
        move(0.0, 15.0, 0.0)
    }

    override fun move(front: Double, up: Double, rotate: Double) {
        println("Superhero is moving")
        super.move(front, up, rotate)
    }
}

fun main() {
    val drone: Drone = SuperDrone()
    println(drone.look)
    drone.setOff()
    drone.move(10.0, 0.0, 0.0)
}