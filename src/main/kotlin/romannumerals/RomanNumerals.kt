package romannumerals

private val VALUES = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000
)

fun decode(romanNumber: String): Int {
    var result = 0
    romanNumber.forEachIndexed { index, romanDigit ->
        if(index > 0 && romanDigit.hasAsMinusDigit(romanNumber[index-1])){
            result = result.undoPreviousOperation(romanNumber, index)
            result = result.plus(arrayOf(romanNumber[index-1], romanDigit))
        } else {
            result = result.plus(romanDigit)
        }
    }
    return result
}

private fun Int.plus(romanDigit: Char): Int = this + romanDigit.decode()

private fun Int.minus(romanDigit: Char): Int = this - romanDigit.decode()

private fun Int.plus(romanDigits: Array<Char>): Int = this.plus(romanDigits[1].decode() - romanDigits[0].decode())

private fun Int.undoPreviousOperation(romanNumber: String, index: Int): Int = this.minus(romanNumber[index - 1])

private fun Char.decode(): Int =
    VALUES.containsKey(this).let { VALUES[this] } ?: throw RuntimeException("Invalid value [$this]")

private fun Char.hasAsMinusDigit(possibleMinusRomanDigit: Char): Boolean =
    when(possibleMinusRomanDigit) {
        'I' -> this == 'V' || this == 'X'
        'X' -> this == 'L' || this == 'C'
        'C' -> this == 'D' || this == 'M'
        else -> false
    }