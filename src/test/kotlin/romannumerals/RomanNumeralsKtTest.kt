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

    @Test
    fun one_digit_composed() {
        assertEquals(4, decode("IV"))
        assertEquals(9, decode("IX"))
    }

    @Test
    fun two_digits_composed() {
        assertEquals(40, decode("XL"))
        assertEquals(90, decode("XC"))
    }

    @Test
    fun three_digits_composed() {
        assertEquals(400, decode("CD"))
        assertEquals(900, decode("CM"))
    }

    @Test
    fun four_digits_composed() {
        assertEquals(9999, decode("MMMMMMMMMCMXCIX"))
    }
}