package rgb2hex

private const val MIN = 0
private const val MAX = 255
private const val BASE = 16
private val VALUES = arrayOf("0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F")

fun rgb(r: Int, g: Int, b: Int): String = "${r.toHex()}${g.toHex()}${b.toHex()}"

private fun Int.toHex(): String = this.coerceAtLeast(MIN).coerceAtMost(MAX).let { normalizedValue ->
    "${VALUES[normalizedValue / BASE]}${VALUES[normalizedValue % BASE]}"
}