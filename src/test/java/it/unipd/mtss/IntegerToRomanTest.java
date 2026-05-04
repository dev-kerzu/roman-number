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

    @Test
    public void convertElevenReturnsXI() {
        int number = 11;
        String expected = "XI";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertFourteenReturnsXIV() {
        int number = 14;
        String expected = "XIV";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertNineteenReturnsXIX() {
        int number = 19;
        String expected = "XIX";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertTwentyReturnsXX() {
        int number = 20;
        String expected = "XX";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertThirtyReturnsXXX() {
        int number = 30;
        String expected = "XXX";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertFortyReturnsXL() {
        int number = 40;
        String expected = "XL";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertFortyNineReturnsXLIX() {
        int number = 49;
        String expected = "XLIX";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertFiftyReturnsL() {
        int number = 50;
        String expected = "L";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertSixtyReturnsLX() {
        int number = 60;
        String expected = "LX";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertNinetyReturnsXC() {
        int number = 90;
        String expected = "XC";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertNinetyNineReturnsXCIX() {
        int number = 99;
        String expected = "XCIX";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertOneHundredReturnsC() {
        int number = 100;
        String expected = "C";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertOneHundredOneReturnsCI() {
        int number = 101;
        String expected = "CI";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertOneHundredFiftyReturnsCL() {
        int number = 150;
        String expected = "CL";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertOneHundredNinetyNineReturnsCXCIX() {
        int number = 199;
        String expected = "CXCIX";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    public void convertTwoHundredReturnsCC() {
        int number = 200;
        String expected = "CC";
        String actual = IntegerToRoman.convert(number);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertZeroShouldThrowException() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertOverThousandShouldThrowException() {
        IntegerToRoman.convert(1001);
    }
}
