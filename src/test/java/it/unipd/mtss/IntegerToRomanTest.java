////////////////////////////////////////////////////////////////////
// DIEGO CAZZOLA 2116444
// FABIO COSTA BANO 2137983
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class IntegerToRomanTest {
    @Test
    public void testConvertNumberOne() {
        // Arrange (Preparazione dei dati)
        int number = 1;
        String expected = "I";
        // Act (Esecuzione del metodo che stiamo testando)
        String actual = IntegerToRoman.convert(number);
        // Assert (Verifica del risultato)
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNumberThree() {
        // Arrange
        int number = 3;
        String expected = "III";
        // Act
        String actual = IntegerToRoman.convert(number);
        // Assert
        assertEquals(expected, actual);
    }
}
