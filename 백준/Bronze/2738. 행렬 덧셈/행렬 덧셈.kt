import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val result = Array(n) { IntArray(m) }

    for (i in 0 until n) {
        val row = br.readLine().split(" ").map { it.toInt() }
        for (j in 0 until m) {
            result[i][j] = row[j]
        }
    }

    for (i in 0 until n) {
        val row = br.readLine().split(" ").map { it.toInt() }
        for (j in 0 until m) {
            result[i][j] += row[j]
        }
    }

    for (i in 0 until n) {
        bw.write(result[i].joinToString(" ") + "\n")
    }

    bw.flush()
    br.close()
    bw.close()
}

