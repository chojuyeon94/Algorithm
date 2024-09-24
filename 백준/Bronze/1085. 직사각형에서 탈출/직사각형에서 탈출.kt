import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = StringTokenizer(br.readLine())
    val x = n.nextToken().toInt()
    val y = n.nextToken().toInt()
    val w = n.nextToken().toInt()
    val h = n.nextToken().toInt()

    val wMin = if(w - x > x) x else w - x
    val hMin = if(h - y > y) y else h - y
    
    print(if(wMin > hMin) hMin else wMin)

}