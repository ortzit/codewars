package romannumerals

import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

internal class RomanNumeralsKtTest {
    @Test
    fun basic() {
        assertEquals(0, decode(""))
        assertEquals(1, decode("I"))
        assertEquals(21, decode("XXI"))
        assertEquals(2008, decode("MMVIII"))
        assertEquals(1666, decode("MDCLXVI"))
    }
}