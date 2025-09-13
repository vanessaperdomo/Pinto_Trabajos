package exercise;

import java.util.Scanner;

public class Exercise5 {
        public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int hoursWorked; // horas trabajadas
        int hourlyRate; // tarifa por hora
        int employeePayroll; // planilla del empleado

        System.out.println("ingrese el Numero de Horas laboradas en el mes: ");
        hoursWorked = scanner.nextInt();
        System.out.println("ingrese su Tarifa por Hora: ");
        hourlyRate = scanner.nextInt();

        employeePayroll = hoursWorked * hourlyRate ;
        System.out.println("La planilla total del empleado es: $ " + employeePayroll);

        scanner.close();
    }
}