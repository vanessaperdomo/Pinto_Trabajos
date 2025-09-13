package ejercicio1;

import java.util.Scanner;

public class CicloFor {
    public static void main(String[] args) {
        int i = 0;
        int opcion;
        Scanner one = new Scanner(System.in);

        System.out.println("Digite el numero de cuantas veces va a realizar ");
        i = one.nextInt();

        while (i > 500) {
            System.out.println("No puedes hacer mas de 500");
            System.out.println("Por favor digite otro valor dentro de el rango");
            i = one.nextInt();
        }
        
        System.out.println("elije el numero de la opcion que deas ver: ");
        System.out.println("1. Impares");
        System.out.println("2. Primos");
        System.out.println("3. Pares");
        opcion = one.nextInt();
        
        System.out.println("result");
        
        switch(opcion){
            case 1:
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0) {
                      System.out.println("iteracion, el numero: "  + j + " es impar");
                    }
                }
                break;

            case 2: 
                
                for (int j = 2; j <= i; j++){
                    double divisor;
                     
                    for (divisor = 2; divisor <= Math.sqrt(j); divisor++){
                        if (j % divisor == 0){
                            break;
                        }
                    }
                    
                    if (divisor > Math.sqrt(j)){
                        System.out.println("iteracion, el numero: " + j + " = " + Math.sqrt(j) + " es primo");
                    }
                }
                break;
             
            case 3:
                
                for (int j = 1; j <= i; j++) {
                    if (j % 2 == 0){
                        System.out.println("Iteración, el numero: "  + j +  " es par");
                    }
                }
                break;
            
            default:
                System.out.println("opcion invalida" );
                break;
        }

        one.close();
    }
}