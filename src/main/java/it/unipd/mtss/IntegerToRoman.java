////////////////////////////////////////////////////////////////////
// DIEGO CAZZOLA 2116444
// FABIO COSTA BANO 2137983
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
        String result = "";

        // Gestione del simbolo 5 e successivi
        while (number >= 5) {
            result += "V";
            number -= 5;
        }

        while (number >= 4) {
            result += "IV";
            number -= 4;
        }

        // Gestione dei numeri 1, 2, 3
        while (number >= 1) {
            result += "I";
            number -= 1;
        }

        return result;
    }
}
