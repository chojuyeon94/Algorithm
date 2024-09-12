import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toDouble()

    val result = (2.0.pow(n) + 1.0).pow(2.0).toInt()
    
    bw.write(result.toString())
    
    bw.flush()
    bw.close()
    br.close()

}