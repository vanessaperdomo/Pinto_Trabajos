package exercise;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double abcisaA; 
        double abcisaB; 
        double ordenadaA; 
        double ordenadaB; 
        double distance;  

        System.out.print("ingrese la Abscisa del punto A: ");
        abcisaA = scanner.nextDouble();
        System.out.print("ingrese la Abscisa del punto B: ");
        abcisaB = scanner.nextDouble();
        System.out.print("ingrese la Ordenada del punto A: ");
        ordenadaA = scanner.nextDouble();
        System.out.print("Ingrese la Ordenada del punto B: ");
        ordenadaB = scanner.nextDouble();

        distance = Math.sqrt(Math.pow(abcisaB - abcisaA, 2) + Math.pow(ordenadaB - ordenadaA, 2));
        System.out.println("la distancia entre los puntos A y B es: " + distance);

        scanner.close();
    }
}
