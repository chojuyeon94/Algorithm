import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {

    val br = BufferedReader(System.`in`.reader())
    val bw = BufferedWriter(System.`out`.writer())

    val matrix = Array(5) {""}

    for(i in 0..4){
        matrix[i] = br.readLine()
    }

    val maxLength = matrix.maxOf { it.length }

    for(col in 0 until maxLength){
        for(row in 0..4){
            if(col < matrix[row].length){
                bw.write("${matrix[row][col]}")
            }
        }
    }


        bw.flush()
        bw.close()
        br.close()
}