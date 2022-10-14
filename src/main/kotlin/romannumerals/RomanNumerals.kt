package romannumerals

fun decode(str: String): Int {
    var decoded = 0
    str.forEach { character ->
        decoded += characterDecode(character)
    }
    return decoded
}

private fun characterDecode(c: Char): Int =
    when(c) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> throw RuntimeException("Invalid value [$c]")
    }