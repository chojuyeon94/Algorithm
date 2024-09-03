import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    var (n, m) = br.readLine().split(" ").map { it.toInt() }
    val result = StringBuilder()

    while( n > 0) {
        val temp = n % m
        if(temp < 10){
            result.append(temp)
        } else {
            result.append((temp + 55).toChar())
        }
        n /= m
    }

    bw.write(result.toString().reversed())

    bw.flush()
    bw.close()
    br.close()
}