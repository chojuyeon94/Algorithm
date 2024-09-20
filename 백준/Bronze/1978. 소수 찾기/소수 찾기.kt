import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val nums = br.readLine().split(" ").map { it.toInt() }
    var count = 0

    for (num in nums) {
        if (isPrime(num)) count++
    }

    println(count)

}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false

    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }

    return true
}