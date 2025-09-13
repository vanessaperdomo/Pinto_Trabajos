package exercise;

public class Exercise23 {
    public static void main(String[] args) {
        
        int cociente;
        int residuo;
        int contador = 1;

        for (contador = 1; contador <= 10;contador++) {
            cociente = contador / 2;
            residuo = contador - (cociente * 2); 

            if (residuo == 0) {
                continue; 
            } else {
                System.out.println(contador); 
            }
        }
    }
}
