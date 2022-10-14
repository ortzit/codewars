package rgb2hex

private const val MIN = 0
private const val MAX = 255
private const val BASE = 16
private val VALUES = IntRange(0, 15).map { it.hexAsciiChar() }

fun rgb(r: Int, g: Int, b: Int): String = "${r.toHex()}${g.toHex()}${b.toHex()}"

fun rgbOptimized(r: Int, g: Int, b: Int): String =
    String.format("%02X%02X%02X", r.coerceIn(0..255), g.coerceIn(0..255), b.coerceIn(0..255))

private fun Int.hexAsciiChar() = (this.takeIf { it < 10 }?.let { this + 48 } ?: (this + 55)).toChar()

private fun Int.toHex(): String = this.coerceAtLeast(MIN).coerceAtMost(MAX).let { normalizedValue ->
    "${VALUES[normalizedValue / BASE]}${VALUES[normalizedValue % BASE]}"
}