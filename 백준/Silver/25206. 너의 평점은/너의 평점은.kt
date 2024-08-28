fun main() {

    var totalGrade: Double = 0.0
    var totalLearned: Double = 0.0
    var read: String
    var split: List<String>
    var result: Double = 0.0

    repeat(20) {
        read = readln()
        split = read.split(" ")

        when (split[2]) {
            "A+" -> {
                totalGrade += split[1].toDouble() * 4.5
                totalLearned += split[1].toDouble()
            }
            "A0" -> {
                totalGrade += split[1].toDouble() * 4.0
                totalLearned += split[1].toDouble()
            }
            "B+" -> {
                totalGrade += split[1].toDouble() * 3.5
                totalLearned += split[1].toDouble()
            }
            "B0" -> {
                totalGrade += split[1].toDouble() * 3.0
                totalLearned += split[1].toDouble()
            }
            "C+" -> {
                totalGrade += split[1].toDouble() * 2.5
                totalLearned += split[1].toDouble()
            }
            "C0" -> {
                totalGrade += split[1].toDouble() * 2.0
                totalLearned += split[1].toDouble()
            }
            "D+" -> {
                totalGrade += split[1].toDouble() * 1.5
                totalLearned += split[1].toDouble()
            }
            "D0" -> {
                totalGrade += split[1].toDouble() * 1.0
                totalLearned += split[1].toDouble()
            }
            "F" -> {
                totalLearned += split[1].toDouble()
            }
            "P" -> {}
        }
    }
    
    result = totalGrade / totalLearned
    println(result)
}