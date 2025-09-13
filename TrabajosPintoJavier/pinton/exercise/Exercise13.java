package exercise;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstSide;  // primer lado 
        double secondSide; // segundo lado
        double thirdSide; // tercer lado
        String triangleType; // tipo triangulo 

        System.out.println("ingrese el numero del primer lado: ");
        firstSide = scanner.nextDouble();
        System.out.println("ingrese el numero del segundo lado: ");
        secondSide = scanner.nextDouble();
        System.out.println("ingrese el numero del tercer lado: ");
        thirdSide = scanner.nextDouble();

        if (firstSide != secondSide && secondSide != thirdSide && thirdSide != firstSide) {
            triangleType = "Escaleno";
        } else if (firstSide == secondSide && secondSide == thirdSide) {
            triangleType = "Equilatero";
        } else {
            triangleType = "Isosceles";
        }

        System.out.println("el tipo de triangulo es: " + triangleType);
        scanner.close();
    }
}