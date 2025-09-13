package exercise;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mondayProduction; // produccion lunes
        int tuesdayProduction; // martes
        int wednesdayProduction; // miercoles
        int thursdayProduction; // jueves
        int fridayProduction; // viernes
        int saturdayProduction;  // sabado
        int totalProduction; // produccion total
        int averageProduction; // produccion promedia

        System.out.println("ingrese la produccion del dia lunes:");
        mondayProduction = scanner.nextInt();
        System.out.println("ingrese la produccion del dia martes: ");
        tuesdayProduction = scanner.nextInt();
        System.out.println("ingrese la produccion del dia miercoles: ");
        wednesdayProduction = scanner.nextInt();
        System.out.println("ingrese la produccion del dia jueves: ");
        thursdayProduction = scanner.nextInt();
        System.out.println("ingrese la produccion del dia viernes: ");
        fridayProduction = scanner.nextInt();
        System.out.println("ingrese la produccion del dia sabado: ");
        saturdayProduction = scanner.nextInt();
        totalProduction = mondayProduction + tuesdayProduction + wednesdayProduction + thursdayProduction + fridayProduction + saturdayProduction;
        averageProduction = totalProduction / 6;

        if (averageProduction >= 100) {
            System.out.println("MSG = Recibira Incentivos");
        } else {
            System.out.println("MSG = No recibira Incentivos");
        }

        System.out.println("MSG = " + averageProduction);
        scanner.close();
    }
}