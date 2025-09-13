package exercise;

public class Exercise26 {
    public static void main(String[] args) {
        
        int primerNumero = 0; 
        int segundoNumero= 1; 
        int tercerNumero;

        System.out.println(primerNumero);
        System.out.println(segundoNumero );

        tercerNumero = primerNumero + segundoNumero;

        while (tercerNumero < 100000) {
            System.out.println(tercerNumero);
            primerNumero = segundoNumero;
            segundoNumero = tercerNumero;
            tercerNumero = primerNumero + segundoNumero;
        }
    }
}
