package romannumerals

import org.junit.jupiter.api.Disabled
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

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

    @Disabled
    @Test
    fun not_valid() {
        assertThrows<RuntimeException> { decode("IC") }
        assertThrows<RuntimeException> { decode("VC") }
        assertThrows<RuntimeException> { decode("ID") }
        assertThrows<RuntimeException> { decode("VD") }
        assertThrows<RuntimeException> { decode("IM") }
        assertThrows<RuntimeException> { decode("DM") }
    }
}