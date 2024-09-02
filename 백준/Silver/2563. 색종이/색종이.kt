import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {

    val br = BufferedReader(System.`in`.reader())
    val bw = BufferedWriter(System.`out`.writer())

    val matrix = Array(100) { BooleanArray(100) }
    val n = br.readLine().toInt()
    var area = 0

    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        for (i in x until x + 10) {
            for (j in y until y + 10) {
                if (!matrix[i][j]) {
                    matrix[i][j] = true
                    area++
                }
            }
        }
    }

    bw.write(area.toString())
    bw.flush()
    bw.close()
    br.close()
}