////////////////////////////////////////////////////////////////////
// DIEGO CAZZOLA 2116444
// FABIO COSTA BANO 2137983
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Numero non valido: " + number);
        }

        String result = "";
        
        // Gestione del simbolo 100
        while (number >= 100) {
            result += "C";
            number -= 100;
        }
        
        // Gestione del simbolo 90
        while (number >= 90) {
            result += "XC";
            number -= 90;

        // Gestione del simbolo 50
        while (number >= 50) {
            result += "L";
            number -= 50;
        }

        // Gestione del simbolo 40
        while (number >= 40) {
            result += "XL";
            number -= 40;
        }

        // Gestione del simbolo 10
        while (number >= 10) {
            result += "X";
            number -= 10;
        }

        // Gestione del simbolo 9
        while (number >= 9) {
            result += "IX";
            number -= 9;
        }

        // Gestione del simbolo 5
        while (number >= 5) {
            result += "V";
            number -= 5;
        }

        // Gestione del simbolo 4
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
}    
