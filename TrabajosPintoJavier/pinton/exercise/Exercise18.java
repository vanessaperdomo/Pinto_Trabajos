package exercise;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integerNumber; //numero Entero 
        int integerQuotient; //cociente entero
        int residue; //residuo
        String message; // mensaje 

        System.out.print("ingrese un numero entero diferente a cero: ");
        integerNumber = scanner.nextInt();

        integerQuotient = integerNumber / 2;
        residue = integerNumber - (integerQuotient * 2);

        if (residue == 0) {
            message = "Es par";
        } else {
            message = "Es impar";
        }

        System.out.println(message);

        scanner.close();
    }
}
