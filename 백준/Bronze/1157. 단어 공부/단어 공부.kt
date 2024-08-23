fun main() {

    val word = readln()
    val upperWord = word.uppercase()
    val charMap = mutableMapOf<Char, Int>()

    for (c in upperWord) {

        if(charMap.contains(c)) {
            charMap[c] = charMap[c]!!.plus(1)
        }

        else {
            charMap[c] = 1
        }

    }

    val max = charMap.maxBy { it.value }

    if (charMap.filter { it.value == max.value }.count() > 1) {
        println("?")
    }

    else {
        println(max.key)
    }
    
}