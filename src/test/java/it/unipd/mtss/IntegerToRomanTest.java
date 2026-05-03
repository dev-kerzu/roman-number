////////////////////////////////////////////////////////////////////
// DIEGO CAZZOLA 2116444
// FABIO COSTA BANO 2137983
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConstructor() {
        IntegerToRoman converter = new IntegerToRoman();
        assertEquals(converter.getClass(), IntegerToRoman.class);
    }

    @Test
    public void testConvertNumberOne() {
        // Arrange
        int number = 1;
        String expected = "I";
        // Act
        String actual = IntegerToRoman.convert(number);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNumberTwo() {
        int number = 2;
        String expected = "II";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNumberThree() {
        int number = 3;
        String expected = "III";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNumberFour() {
        int number = 4;
        String expected = "IV";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNumberFive() {
        int number = 5;
        String expected = "V";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNumberSix() {
        int number = 6;
        String expected = "VI";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }
        @Test
    public void testConvertNumberSeven() {
        int number = 7;
        String expected = "VII";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNumberEight() {
        int number = 8;
        String expected = "VIII";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNumberNine() {
        int number = 9;
        String expected = "IX";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNumberTen() {
        int number = 10;
        String expected = "X";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }
}
