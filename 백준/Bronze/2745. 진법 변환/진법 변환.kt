import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {

    val br = BufferedReader(System.`in`.reader())
    val bw = BufferedWriter(System.`out`.writer())


    val input = br.readLine().split(" ")
    val n = input[1].toInt()

    var sum = 0

    for(i in input[0].indices){
        if(input[0][i] in '0'..'9') {
            sum = sum * n + (input[0][i] - '0')
        } else {
            sum = sum * n + (input[0][i] - 'A' + 10)
        }
    }

    bw.write(sum.toString())

    bw.flush()
    bw.close()
    br.close()
}