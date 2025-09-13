package exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matchesWon;  // partidos ganados
        int tiedMatches;  // partidos empatados
        int lostMatches;   // partidos perdidos
        int scoreMatchesWon;  // puntaje por partidos ganados
        int scoreTiedMatches; // puntaje por partidos empatados
        int totalScore;   // puntaje total

        System.out.println("Ingrese el Numero de Partidos Ganados: ");
        matchesWon = scanner.nextInt();

        System.out.println("Ingrese el Numero de Partidos Empatados: ");
        tiedMatches = scanner.nextInt();

        System.out.println("Ingrese el Numero de Partidos Perdidos: ");
        lostMatches = scanner.nextInt();

        scoreMatchesWon = matchesWon * 3;
        scoreTiedMatches = tiedMatches * 1;
        totalScore = scoreMatchesWon + scoreTiedMatches;

        System.out.println("El puntaje total del equipo es: " + totalScore);
        scanner.close();
    }
}
