package exercise;

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primerNumero;
        int segundoNumero;
        int resultado = 0;
        char operador;

        System.out.print("ingrese el primer numero: ");
        primerNumero = scanner.nextInt();
        System.out.print("ingrese el segundo numero: ");
        segundoNumero = scanner.nextInt();
        System.out.print("ingrese el operador (+, -, *, ^): ");
        operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = primerNumero + segundoNumero;
                break;
            case '-':
                resultado = primerNumero - segundoNumero;
                break;
            case '*':
                resultado = primerNumero * segundoNumero;
                break;
            case '^':
                resultado = (int) Math.pow(primerNumero, segundoNumero);
                break;
            default:
                resultado = 0; 
                break;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
