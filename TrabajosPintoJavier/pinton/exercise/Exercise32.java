package exercise;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int numero;
        int cociente;
        int producto;
        int residuo;

        System.out.print("ingrese un numero entero diferente a cero: ");
        numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("el numero no puede ser cero.");
        } else {
            System.out.println("los divisores de " + numero + " son:");
           
            for (int divisor = 1; divisor <= Math.abs(numero); divisor++) {
                cociente = numero / divisor;
                producto = cociente * divisor;
                residuo = numero - producto;

                if (residuo == 0) {
                    System.out.println(divisor);
                }
            }
        }
        scanner.close();
    }
}
