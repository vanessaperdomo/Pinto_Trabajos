package exercise;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edadPersonas; 
        int mayores = 0;
        int menores = 0;   
        int counter = 1;

        for (counter = 1; counter <= 200; counter++) {
            System.out.print("ingrese la edad de la persona " + counter + ": ");
            edadPersonas = scanner.nextInt();

            if (edadPersonas < 18) {
                menores = menores + 1;
            } else {
                mayores = mayores + 1;
            }
        
        }

        System.out.println("la cantidad de personas mayores de edad son: " + mayores);
        System.out.println("la cantidad de personas menores de edad son: " + menores);

        scanner.close();

    }
        
}   
