package exercise;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integerNumber; // numero entero y vocal
        String vocal;

        System.out.println("ingrese un numero entero de 1 a 5: ");
        integerNumber = scanner.nextInt();

        switch (integerNumber) {
            case 1:
                vocal = "A";
                break;
            case 2:
                vocal = "E";
                break;
            case 3:    
                vocal = "I";
                break;
            case 4:    
                vocal = "O";
                break;
            case 5:    
                vocal = "U";
                break;
            default:
                vocal = "valor incorrecto";
                break;
        }

        System.out.println("el valor correspondiente del numero es: " + vocal);
        scanner.close();
    } 
}