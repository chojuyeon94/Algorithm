import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    var n = br.readLine().toInt()
    val result = StringBuilder()
    var i = 2

    while(i*i <= n) {
        while(n % i == 0) {
            result.append(i).append('\n')
            n /= i
            }
        i++
    }

    if(n > 1) result.append(n)

    br.close()
    print(result.toString())
    
}
