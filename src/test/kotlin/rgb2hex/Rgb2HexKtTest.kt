package rgb2hex

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Rgb2HexKtTest {
    @Test
    fun testFixed_rgb() {
        assertEquals("000000", rgb(0, 0, 0))
        assertEquals("000000", rgb(0, 0, -20))
        assertEquals("FFFFFF", rgb(300,255,255))
        assertEquals("ADFF2F", rgb(173,255,47))
        assertEquals("9400D3", rgb(148, 0, 211))
    }

    @Test
    fun testFixed_rgbOptimized() {
        assertEquals("000000", rgbOptimized(0, 0, 0))
        assertEquals("000000", rgbOptimized(0, 0, -20))
        assertEquals("FFFFFF", rgbOptimized(300,255,255))
        assertEquals("ADFF2F", rgbOptimized(173,255,47))
        assertEquals("9400D3", rgbOptimized(148, 0, 211))
    }
}