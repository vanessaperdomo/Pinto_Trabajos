package exercise;

import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votoElector;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int votoNulo = 0;
        int ganador;
        int contador = 1;

        for (contador = 1; contador <= 5; contador++) {
            System.out.print("ingrese el voto del elector" + contador + " (1, 2, 3 o voto nulo o blanco es 0: ");
            votoElector = scanner.nextInt();

            switch (votoElector) {
                case 1:
                    candidato1 = candidato1 + 1;
                    break;
                case 2:
                    candidato2 = candidato2 + 1;
                    break;
                case 3:
                    candidato3 = candidato3 + 1;
                    break;
                default:
                    votoNulo = votoNulo + 1;
                    break;
            }
        }

        if ((candidato1 > candidato2) && (candidato1 > candidato3) && (candidato1 > votoNulo)) {
            ganador = 1;
        } else if ((candidato2 > candidato3) && (candidato2 > votoNulo)) {
            ganador = 2;
        } else if (candidato3 > votoNulo) {
            ganador = 3;
        } else {
            ganador = 0; 
        }

        System.out.println("el candidato ganador es: " + ganador);
        scanner.close();
    }
}
