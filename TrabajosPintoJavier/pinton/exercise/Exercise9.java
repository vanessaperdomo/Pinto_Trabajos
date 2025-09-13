package exercise;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int yearOfBirth;  // año de nacimiento
        int currentYear; // año actual 
        int age; // edad

        System.out.println("ingrese el año de nacimiento: ");
        yearOfBirth = scanner.nextInt();
        System.out.println("ingrese el año actual: ");
        currentYear = scanner.nextInt();

        age = currentYear - yearOfBirth;
        System.out.println("tienes " + age + " años");
        
        if(age>17){
            System.out.println("debe solicitar su CUIL");
        }else{
            System.out.println("no debes solicitar su CUIL aun");
        }

        scanner.close();
    }
}
