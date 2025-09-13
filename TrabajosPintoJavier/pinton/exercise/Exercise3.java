package exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCorrectAnswers;  //numero de respuestas correctas
        int numIncorrectAnswers; //numero de respuestas incorrectas
        int numBlankAnswers; //numero de respuestas en blanco
        int correctScores; // puntaje correcto
        int incorrectScores;  //puntaje incorrecto
        int finalScore; //puntaje final

        System.out.println("Ingrese el Numero de Respuestas Correctas: ");
        numCorrectAnswers = scanner.nextInt();

        System.out.println("Ingrese el Numero de Respuestas Incorrectas: ");
        numIncorrectAnswers = scanner.nextInt();

        System.out.println("Ingrese el Numero de Respuestas en Blanco: ");
        numBlankAnswers = scanner.nextInt();

        correctScores = numCorrectAnswers * 4;
        incorrectScores = numIncorrectAnswers * -1;
        finalScore = correctScores + incorrectScores;

        System.out.println("El puntaje final es: " + finalScore);

        if (finalScore >= 50) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }

        scanner.close();
    }
}
