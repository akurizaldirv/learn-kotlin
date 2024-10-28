package xyz.zaldev.model.data

class House {
    var totalAreaM2: Long = 1400

    class Room {
        var totalRoom: Int = 4

        fun getRoomAreaM2 (): Int {
            // println(totalAreaM2) // error, default nested class cannot access the outer class properties or methods
            return 0
        }
    }

    inner class FloorTile {
        var tileAreaM2: Long = 16

        fun getTotalTile() : Int {
            return (totalAreaM2/tileAreaM2).toInt()
        }
    }
}