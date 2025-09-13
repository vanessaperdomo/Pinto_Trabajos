package exercise;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInteger; // primer entero , segundo y tercero
        int secondInteger;
        int threeInteger;
        int largestNumber; // numero mayor

        System.out.println("ingrese el Primer Numero Entero: ");
        firstInteger = scanner.nextInt();
        System.out.println("ingrese el Segundo Numero Entero: ");
        secondInteger = scanner.nextInt();
        System.out.println("ingrese el Tercer Numero Entero: ");
        threeInteger = scanner.nextInt();

        if (firstInteger > secondInteger && firstInteger > threeInteger) {
            largestNumber = firstInteger;
        }else if (secondInteger > threeInteger) {
            largestNumber = secondInteger;
        }else{
            largestNumber = threeInteger;
        }

        System.out.println("el numero mayor de los tres es el: " + largestNumber);
        scanner.close();
    }
}