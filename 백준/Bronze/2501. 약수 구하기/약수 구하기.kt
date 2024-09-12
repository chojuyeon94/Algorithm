import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val number = StringTokenizer(br.readLine())
    val n = number.nextToken().toInt()
    val k = number.nextToken().toInt()

    var count = 0
    var result = 0

    for(i in 1..n) {
        if(n % i == 0) count++
        if(count == k) {
            result = i
            break
        }

    }

    bw.write(result.toString())

    bw.flush()
    br.close()
    bw.close()

}