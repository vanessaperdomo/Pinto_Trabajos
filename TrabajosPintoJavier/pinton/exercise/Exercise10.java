package exercise;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstBrotherAge; // primer hermano edad
        int secondBrotherAge; // segundo hermano edad
        int ageDifference; // diferencia edad

        System.out.println("ingrese la edad del primer hermano: ");
        firstBrotherAge = scanner.nextInt();
        System.out.println("ingrese la edad del segundo hermano: ");
        secondBrotherAge = scanner.nextInt();

        if (firstBrotherAge > secondBrotherAge) {
            System.out.println("el primer hermano es el mayor , por");
            ageDifference = firstBrotherAge - secondBrotherAge;
        }else{
            System.out.println("el segundo hermano es el mayor , por");
            ageDifference = secondBrotherAge - firstBrotherAge;
        }

        System.out.println(ageDifference + " años");

        scanner.close();
        
    }
    
}
