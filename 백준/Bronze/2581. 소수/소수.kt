import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val m = br.readLine().toInt()
    val n = br.readLine().toInt()
    var sum = 0
    var min = 10001

    for(i in m..n) {
        if (isPrime(i)) {
            sum += i
            if ( i < min) {
                min = i
            }
        }
    }
    
    if (sum == 0) {
        println(-1)
    } else {
        println(sum)
        println(min)
    }


}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false

    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }

    return true
}