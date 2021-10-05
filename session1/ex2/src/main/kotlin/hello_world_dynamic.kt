fun main () {
    println("Hello world")
    names()
    val students = arrayOf("Bent", "Kylian", "Niko", "kevser", "David")
    for (student in students) {
        greet(student)
    }

}

fun names () {
    val ar = arrayOf("Bent", "Kylian", "Niko", "kevser", "David")
    ar.forEach { println("Hello $it!")}

}

fun greet (name: String) {
    println("Hello $name!")
}
