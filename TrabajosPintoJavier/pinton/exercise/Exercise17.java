package exercise;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int twoDigitNumber; // numero dos digitos
        int integerQuotient; // cociente entero
        int residue;   // residuo
        int tens; // decenas
        int units; // unidades 

        System.out.print("ingrese un numero entero de 2 digitos: ");
        twoDigitNumber = scanner.nextInt();

        integerQuotient = (twoDigitNumber / 10);
        residue = twoDigitNumber - (integerQuotient * 10);            
        tens = integerQuotient;
        units = residue;

        System.out.println("numero de decenas: " + tens);
        System.out.println("numero de unidades: " + units);

        scanner.close();
    }
}
