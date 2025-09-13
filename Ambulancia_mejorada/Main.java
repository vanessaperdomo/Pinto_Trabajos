import java.util.Scanner;

public class Main {
    // Data from Datos.java
    public static String[] Conductores = new String[10];
    public static String[] pacientes = new String[100];
    public static String[] muertos = new String[15];
    public static String[] funeraria = new String[1]; 
    public static String[] ambulancias = new String[10]; 
    public static Clinica[] clinicas = new Clinica[4]; 
    public static int[][] recorridos = new int[10][4]; 
    public static double[] kmAmbulancias = new double[10]; 
    public static int[] recorridosPorConductor = new int[10];
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("----- Menú Del Sistema Medico Moribundo -----");
            System.out.println("1. Registrar Conductores");
            System.out.println("2. Registrar pacientes");
            System.out.println("3. Registrar muertos");
            System.out.println("4. Transferir conductor de funeraria");
            System.out.println("5. Registrar ambulancia");
            System.out.println("6. Recorridos y Reportes");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    Conductor.registrarConductores();
                    break;
                case 2:
                    Pacientes.registrarPacientes();
                    break;
                case 3:
                    Fallecidos.registrarMuertos();
                    break;
                case 4:
                    Funeraria.transferirConductor();
                    break;
                case 5:
                    Ambulancia.registrarAmbulancias();
                    break;
                case 6:
                    Ambulancia.asignarRecorridos();
                    Reportes.generarReportes();
                    break;
                case 7:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        teclado.close(); 
}
}