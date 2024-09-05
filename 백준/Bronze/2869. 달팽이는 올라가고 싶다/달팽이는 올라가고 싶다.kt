import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = StringTokenizer(br.readLine(), " ")

    val up = input.nextToken().toInt()
    val down = input.nextToken().toInt()
    val tree = input.nextToken().toInt()

    var day = (tree - down) / (up - down)

    if((tree - down) % (up - down) != 0) day++

//    var day = 0
//
//    if (up == tree) day = 1
//    else {
//        val dif = up - down
//        tree -= up
//        day++
//        day += if(tree % dif == 0) tree / dif
//        else (tree / dif) + 1
//
//    }

    bw.write(day.toString())
    bw.flush()

    bw.close()
    br.close()

}