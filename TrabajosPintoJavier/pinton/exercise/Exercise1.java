package exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        
        int speed;  //velocidad , tiempo y distncia
        int time;  
        int distance; 

        System.out.println("ingrese la velocidad: ");
        speed = scanner.nextInt();

        System.out.println("ingrese el tiempo: ");
        time = scanner.nextInt();

        distance = speed * time;
        System.out.println("el resultado es: " + distance);

        scanner.close();
    }
}
