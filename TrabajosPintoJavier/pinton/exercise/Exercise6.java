package exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideA; // lado A,B,C,  
        double sideB;
        double sideC;
        double semiperimeterLength; // longitud semiperimetro
        double totalArea; // area total

        System.out.println("ingrese la longitud del lado A: ");
        sideA = scanner.nextDouble();
        System.out.println("ingrese la longitud del lado B: ");
        sideB = scanner.nextDouble();
        System.out.println("ingrese la longitud del lado C: ");
        sideC = scanner.nextDouble();

        semiperimeterLength = (sideA + sideB + sideC) / 2;
        totalArea = Math.sqrt(semiperimeterLength * (semiperimeterLength - sideA) * (semiperimeterLength - sideB) * (semiperimeterLength - sideC));
        System.out.println("el area total del triangulo es: " + totalArea);
         
        scanner.close();
    }

}