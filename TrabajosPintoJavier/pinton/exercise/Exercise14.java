package exercise;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integerNumber; // numero entero
        String romanEquivalent; // equivalente romano

        System.out.println("ingrese un numero entero del (1 a 10): ");
        integerNumber = scanner.nextInt();

        switch (integerNumber) {
            case 1:
                romanEquivalent = "I";
                break;
            case 2:
                romanEquivalent = "II";
                break;
            case 3:
                romanEquivalent = "III";
                break;
            case 4:
                romanEquivalent = "IV";
                break;
            case 5:
                romanEquivalent = "V";
                break;
            case 6:
                romanEquivalent = "VI";
                break;
            case 7:
                romanEquivalent = "VII";
                break;
            case 8:
                romanEquivalent = "VIII";
                break;
            case 9:
                romanEquivalent = "IX";
                break;
            case 10:
                romanEquivalent = "X";
                break;
            default:
                romanEquivalent = "numero incorrecto";
                break;
        }

        System.out.println("el numero es Equivalente en romano a : " + romanEquivalent);
        scanner.close();
    }
}