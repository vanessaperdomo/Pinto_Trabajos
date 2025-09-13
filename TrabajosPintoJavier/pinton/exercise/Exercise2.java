package exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noteOne;  //nota uno , dos, tres y promedio
        int noteTwo; 
        int noteThree;
        int average;

        System.out.println("ingrese la nota1: ");
        noteOne = scanner.nextInt();
        
        System.out.println("ingrese la nota2: ");
        noteTwo = scanner.nextInt();

        System.out.println("ingrese la nota3: ");
        noteThree = scanner.nextInt();

        average = (noteOne + noteTwo + noteThree) / 3;
        System.out.println("el resultado es: " + average);

        scanner.close();
    
    }
}
