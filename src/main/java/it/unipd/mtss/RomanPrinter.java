////////////////////////////////////////////////////////////////////
// DIEGO CAZZOLA 2116444
// FABIO COSTA BANO 2137983
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    private static final String[][] LETTERS = {
        // I
        {
            "  _  ",
            " | | ",
            " | | ",
            " | | ",
            " |_| ",
            "     "
        },
        // V
        {
            "__   __",
            "\\ \\ / /",
            " \\ \\/ /",
            "  \\  / ",
            "   \\/ ",
            "       "
        },
        // X
        {
            "__  __",
            "\\ \\/ /",
            " \\  / ",
            " /  \\ ",
            "/ /\\ \\",
            "\\_\\  \\_\\"
        },
        // L
        {
            " _     ",
            "| |    ",
            "| |    ",
            "| |    ",
            "| |____",
            "|______"
        },
        // C
        {
            "  ____ ",
            " / ___|",
            "| |    ",
            "| |    ",
            "| |___.",
            " \\____|"
        },
        // D
        {
            " ____  ",
            "|  _ \\ ",
            "| | | |",
            "| | | |",
            "| |_| |",
            "|____/ "
        },
        // M
        {
            " __  __ ",
            "|  \\/  |",
            "| |\\/| |",
            "| |  | |",
            "| |  | |",
            "|_|  |_|"
        }
    };

    private static final char[] SYMBOLS = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String roman) {
        String result = "";
        for (int row = 0; row < 6; row++) {
            for (int i = 0; i < roman.length(); i++) {
                result += getRow(roman.charAt(i), row) + " ";
            }
            result += "\n";
        }
        return result;
    }

    private static String getRow(char c, int row) {
        for (int i = 0; i < SYMBOLS.length; i++) {
            if (SYMBOLS[i] == c) {
                return LETTERS[i][row];
            }
        }
        throw new IllegalArgumentException("Carattere non valido: " + c);
    }
}
