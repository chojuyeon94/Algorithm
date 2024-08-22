fun main() {

    val n = readln().toInt()
    var result = n

    repeat(n) {

        val word = readln()
        var charSet = mutableSetOf<Char>()
        var check = true
        var lastChar = ' '

        word.forEach {

            if (lastChar != it) {
                lastChar = it
                if(!charSet.add(lastChar)) check = false
            }

        }

        if(!check) result--

    }

    print(result)

}