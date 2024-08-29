import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = br.readLine()

    val n = str.length
    for (i in 0 ..< n / 2) {
        if (str[i] != str[n - i - 1]) {
            return println(0)
        }
    }
    println(1)
}