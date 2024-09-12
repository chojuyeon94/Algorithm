import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val number = StringTokenizer(br.readLine())
        val a = number.nextToken().toInt()
        val b = number.nextToken().toInt()

        // 두 값이 0이면 종료
        if (a == 0 && b == 0) break

        // multiple 조건
        if (a > b && a % b == 0) {
            bw.write("multiple")
        }
        // factor 조건
        else if (b > a && b % a == 0) {
            bw.write("factor")
        }
        // neither
        else {
            bw.write("neither")
        }
        bw.newLine() // 줄바꿈
    }

    bw.flush()
    br.close()
    bw.close()

}