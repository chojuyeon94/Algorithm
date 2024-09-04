import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val target = br.readLine().toInt()
    var count = 1

    while(true) {
        if(calculate(count, target)) count++
        else break
    }

    bw.write(count.toString())

    bw.flush()
    bw.close()
    br.close()

}

fun calculate(count: Int, target: Int): Boolean {

    val calNum = 3 * (count.toDouble().pow(2.0) - count) + 1
    return target > calNum
}