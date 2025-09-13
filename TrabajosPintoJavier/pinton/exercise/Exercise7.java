package exercise;

import java.util.Scanner;

public class Exercise7 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        double gigabyte;
        double megabyte;
        double cd;

        System.out.println("ingrese el numero de Gigabytes del disco duro: ");
        gigabyte = scanner.nextDouble();
        
        megabyte = gigabyte * 1024;
        cd = ((megabyte / 700) + 1);
        System.out.println("Se necesitan " + cd + " CDs para la copia de seguridad");

        scanner.close();
    }
}   