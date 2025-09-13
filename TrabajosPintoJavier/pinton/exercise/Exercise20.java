package exercise;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEmployees;       
        double employeeSalary;               
        double addsSalaries = 0;    
        double averageSalary;       

        System.out.print("ingrese el numero de empleados: ");
        numberOfEmployees = scanner.nextInt();

        for (int counter = 1; counter <= numberOfEmployees; counter++) {
            System.out.print("ingrese el sueldo del empleado " + counter + ": ");
            employeeSalary = scanner.nextDouble();
            addsSalaries = addsSalaries + employeeSalary;
        }

        averageSalary = addsSalaries / numberOfEmployees;

        System.out.println("el sueldo promedio de los empleados es: " + averageSalary);

        scanner.close();
    }
}
