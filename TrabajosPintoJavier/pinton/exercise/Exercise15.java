package exercise;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double salesAmount; // monto venta
        double totalBonus; // total bonus

        System.out.print("ingrese el monto de venta del mes: ");
        salesAmount = scanner.nextDouble();

        if (salesAmount >= 0 && salesAmount < 1000) {
            totalBonus = (0 * salesAmount) / 100;
        } else if (salesAmount >= 1000 && salesAmount < 5000) {
            totalBonus = (3 * salesAmount) / 100;
        } else if (salesAmount >= 5000 && salesAmount < 20000) {
            totalBonus = (5 * salesAmount) / 100;
        } else {
            totalBonus = (8 * salesAmount) / 100;
        }

        System.out.println("la bonificacion total es: $ " + totalBonus);
        scanner.close();
    }
}