import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val n = reader.readLine().toInt()

    for (i in 1..n) {
        for (j in 1..n - i) {
            sb.append(' ')
        }
        for (k in 1..2 * i - 1) {
            sb.append('*')
        }
        sb.append('\n')
    }

    for (i in n - 1 downTo 1) {
        for (j in 1..n - i) {
            sb.append(' ')
        }
        for (k in 1..2 * i - 1) {
            sb.append('*')
        }
        sb.append('\n')
    }

    println(sb.toString())
}