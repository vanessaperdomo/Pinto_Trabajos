package exercise;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        double primerNumero;
        double segundoNumero;
        double suma;
        double promedio;

        System.out.print("ingrese el primer numero: ");
        primerNumero = scanner.nextDouble();
        System.out.print("ingrese el segundo numero: ");
        segundoNumero = scanner.nextDouble();

        suma = primerNumero + segundoNumero;
        promedio = suma / 2;
        System.out.println("el promedio de los dos numeros es: " + promedio);

        scanner.close();
    }
}
