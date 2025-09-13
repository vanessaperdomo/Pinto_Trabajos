package exercise;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letra;
        int contador;
        int numeroVocales = 0;
        int numeroConsonantes = 0;

        for (contador = 1; contador <= 10; contador++) {
            System.out.print("ingrese una letra (" + contador + "/10): ");
            letra = scanner.next().charAt(0);

            switch (letra) {
                case 'A': case 'a':
                    numeroVocales = numeroVocales + 1;
                    break;
                case 'E': case 'e':
                    numeroVocales = numeroVocales + 1;
                    break;
                case 'I': case 'i':
                    numeroVocales = numeroVocales + 1;
                    break;
                case 'O': case 'o':
                    numeroVocales = numeroVocales + 1;
                    break;
                case 'U': case 'u':
                    numeroVocales = numeroVocales + 1;
                    break;
                default:
                    numeroConsonantes = numeroConsonantes + 1;
                    break;
            }
        }

        System.out.println("numero de vocales: " + numeroVocales);
        System.out.println("numero de consonantes: " + numeroConsonantes);

        scanner.close();
    }
}
