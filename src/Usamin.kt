val USA = "ウサ"
val MIN = "ミン"

fun main(args: Array<String>) {
    4 * {
        println("${ if (it < 3) Array(2) { MIN * 3 }.joinToString(" ") else USA * 3 } $USA$MIN!")
    }
}

operator fun String.times(i: Int) = Array(i) { this }.joinToString("")

operator fun Int.times(f: (Int) -> Unit) = (0..(this - 1)).forEach(f)