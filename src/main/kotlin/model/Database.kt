package xyz.zaldev.model

// use the object instead of class --- just like static in Java
// so, in whole application, only one object will created (singleton)
object Database {
    private val DB_NAME = "db_koneksi"

    fun connect() {
        println("Connecting to $DB_NAME ..")
    }
}