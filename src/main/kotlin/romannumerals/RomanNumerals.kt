package romannumerals

fun decode(romanNumber: String): Int {
    var decoded = 0
    romanNumber.forEach { romanDigit ->
        decoded += characterDecode(romanDigit)
    }
    return decoded
}

private fun characterDecode(romanDigit: Char): Int =
    when(romanDigit) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> throw RuntimeException("Invalid value [$romanDigit]")
    }