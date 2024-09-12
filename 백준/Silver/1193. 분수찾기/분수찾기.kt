import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    // 몇 번째 대각선인지
    var count = 1

    // 지금까지 센 숫자 갯수
    var range = 1

    while(n > range) {
        count++ // 다음 대각선으로
        range += count // 대각선에서 센 숫자 추가 (k번째 대각선에 k개의 숫자 존재)
    }

    // 대각선의 숫자 시작점
    val start = range - count + 1

    // 대각선에서 n이 몇번째에 있는지
    val offset = n - start

    var numerator = 0 // 분자
    var denominator = 0 // 분모

    // 대각선이 짝수번째면 분자가 1부터 
    if(count % 2 == 0) {
        numerator = offset + 1
        denominator = count - offset
    }
    // 대각선이 홀수번째면 분모가 1부터
    else {
        numerator = count - offset
        denominator= offset + 1
    }



    bw.write("$numerator/$denominator")
    bw.flush()

    br.close()
    bw.close()

}