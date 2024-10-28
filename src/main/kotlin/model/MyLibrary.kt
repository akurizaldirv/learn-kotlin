package xyz.zaldev.model

class MyLibrary {
    companion object {
        private const val LIBRARY_NAME: String = "zaldi_lib"
        private var totalBook: Int = 0
    }

    fun printTotalBook() {
        println("Total Book in $LIBRARY_NAME is ${totalBook}")
    }

    fun addBook(n: Int) {
        totalBook += n
    }
}