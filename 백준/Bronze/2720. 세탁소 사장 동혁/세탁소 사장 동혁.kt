import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    for(i in 1..n) {
        var money = br.readLine().toInt()

        if(money >= 25) {
            val quarter = money/25
            bw.write("$quarter ")
            money %= 25
        }

        else {
            bw.write("0 ")
        }

        if(money >= 10) {
            val quarter = money/10
            bw.write("$quarter ")
            money %= 10
        }

        else {
            bw.write("0 ")
        }

        if(money >= 5) {
            val quarter = money/5
            bw.write("$quarter ")
            money %= 5
        }

        else {
            bw.write("0 ")
        }

        bw.write("$money\n")

    }
    
    bw.flush()
    bw.close()

}