val USA = "ウサ"
val MIN = "ミン"

fun main(args: Array<String>) {
    3 * {
        println("${MIN * 3} ${MIN * 3}")
        println("$USA$MIN!")
    }
    println("${USA * 3} $USA$MIN!")
}

operator fun String.times(i: Int) = Array(i) { this }.joinToString("")

operator fun Int.times(f: (Int) -> Unit) = (0..(this - 1)).forEach(f)