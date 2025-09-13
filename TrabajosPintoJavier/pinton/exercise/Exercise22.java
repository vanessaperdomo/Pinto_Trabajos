package exercise;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primerNumero;
        int segundoNumero;
        int contador = 1;
        int producto = 0;
        
        System.out.println("ingrese el primer numero entero: ");
        primerNumero = scanner.nextInt();
        System.out.println("ingrese el segundo numero entero: ");
        segundoNumero = scanner.nextInt();

        for (contador = 1 ; contador <= segundoNumero ; contador++) { 
            producto = producto + primerNumero;
        }

        System.out.println("el producto del primer y segundo numero es : " + producto);

        scanner.close();

    }
}
