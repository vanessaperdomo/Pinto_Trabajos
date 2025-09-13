
package exercise;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String semaforo = "V"; 
        char letra; 

        while (semaforo.equals("V")) {
            System.out.print("ingrese una letra: ");
            letra = scanner.next().charAt(0);

            switch (letra) {
                case 'A': case 'a':
                    semaforo= "R";
                    break;
                case 'E': case 'e':
                    semaforo= "R";
                    break;
                case 'I': case 'i':
                    semaforo= "R";
                    break;
                case 'O': case 'o':
                    semaforo= "R";
                    break;
                case 'U': case 'u':
                    semaforo = "R";
                    break;
                default:
                    semaforo= "V";
                    break;
            }
        }

        System.out.println("Se ingreso una vocal, fin del programa.");
        scanner.close();
    }
}
