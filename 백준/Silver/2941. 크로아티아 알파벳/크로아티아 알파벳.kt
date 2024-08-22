import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    var input = br.readLine()
    val arr = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    for (i in arr) {
        input = input.replace(i, "!")
    }

    println(input.length)

}