import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var n = br.readLine().toInt()

    var count = 1
    var range = 1

    while( n > range) {
        count++
        range += count
    }

    val start = range - count + 1
    val offset = n - start

    var numerator = 0
    var denominator = 0

    if(count % 2 == 0) {
        numerator = offset + 1
        denominator = count - offset
    }
    else {
        numerator = count - offset
        denominator= offset + 1
    }



    bw.write("$numerator/$denominator")
    bw.flush()

    br.close()
    bw.close()

}