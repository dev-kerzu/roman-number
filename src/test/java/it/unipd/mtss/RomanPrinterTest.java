////////////////////////////////////////////////////////////////////
// DIEGO CAZZOLA 2116444
// FABIO COSTA BANO 2137983
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class RomanPrinterTest {

    // Verifica che l'output abbia sempre esattamente 6 righe
    @Test
    public void printNumberOneShouldProduceSixLines() {
        String result = RomanPrinter.print(1);
        assertEquals(6, result.split("\n").length);
    }

    @Test
    public void printNumberFourShouldProduceSixLines() {
        String result = RomanPrinter.print(4); // IV
        assertEquals(6, result.split("\n").length);
    }

    @Test
    public void printNumberFiveShouldProduceSixLines() {
        String result = RomanPrinter.print(5); // V
        assertEquals(6, result.split("\n").length);
    }

    @Test
    public void printNumberNineShouldProduceSixLines() {
        String result = RomanPrinter.print(9); // IX
        assertEquals(6, result.split("\n").length);
    }

    @Test
    public void printNumberTenShouldProduceSixLines() {
        String result = RomanPrinter.print(10); // X
        assertEquals(6, result.split("\n").length);
    }

    // Verifica simboli base L, C, D, M
    @Test
    public void printNumberFiftyShouldProduceSixLines() {
        String result = RomanPrinter.print(50); // L
        assertEquals(6, result.split("\n").length);
    }

    @Test
    public void printNumberOneHundredShouldProduceSixLines() {
        String result = RomanPrinter.print(100); // C
        assertEquals(6, result.split("\n").length);
    }

    @Test
    public void printNumberFiveHundredShouldProduceSixLines() {
        String result = RomanPrinter.print(500); // D
        assertEquals(6, result.split("\n").length);
    }

    @Test
    public void printNumberOneThousandShouldProduceSixLines() {
        String result = RomanPrinter.print(1000); // M
        assertEquals(6, result.split("\n").length);
    }

    // Verifica che il risultato non sia null
    @Test
    public void printShouldNeverReturnNull() {
        assertNotNull(RomanPrinter.print(7)); // VII
    }

    // Test costruttore per coverage
    @Test
    public void constructorShouldBeInstantiable() {
        assertNotNull(new RomanPrinter());
    }

    // Verifica eccezione su numero fuori range (delegata a IntegerToRoman)
    @Test(expected = IllegalArgumentException.class)
    public void printZeroShouldThrowException() {
        RomanPrinter.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printOverThousandShouldThrowException() {
        RomanPrinter.print(1001);
    }
}
