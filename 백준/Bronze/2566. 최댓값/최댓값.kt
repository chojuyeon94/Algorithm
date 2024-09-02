import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {

    val br = BufferedReader(System.`in`.reader())
    val bw = BufferedWriter(System.`out`.writer())

    val matrix = Array(9) { IntArray(9) }
    var max: Int = 0
    var maxCol: Int = 0
    var maxRow: Int = 0

   for(row in 0 until 9){
       val currentRow = br.readLine().split(" ").map { it.toInt() }
       matrix[row] = currentRow.toIntArray()

       for(col in 0 until 9){
           if(currentRow[col] > max){
               max = currentRow[col]
               maxCol = col
               maxRow = row
           }
       }

   }
    println(max)
    println("${maxRow + 1} ${maxCol + 1}")
}