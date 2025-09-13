import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int var1, suma=0, contador=0, num=0;
        double a = 0, b = 0, n = 0, f_n = 0, h_n = 0, log_f_n = 0, log_h_n = 0, n1=0, n2=0, n3=0;
        double f_n2 = 0, h_n2 = 0, log_f_n2 = 0, log_h_n2 = 0, diferencia = 0;
        boolean areBigOEqual = false, areLogBigOEqual = false;
        boolean areBigOEqual2 = false, areLogBigOEqual2 = false;

        Scanner ejercicios = new Scanner(System.in);

        do {
            System.out.print("Digite una opcion del 1 al 15 (0 para salir): ");
            var1 = ejercicios.nextInt();

            switch (var1) {
                case 1: {
                    System.out.print("Límite de f(n)/h(n): ");
                    a = ejercicios.nextDouble();

                    System.out.print("Límite de g(n)/h(n): ");
                    b = ejercicios.nextDouble();

                    diferencia = a - b;

                    System.out.println("Diferencia a - b = " + diferencia);

                    if (a == b) {
                        System.out.println("⇒ f(n) - g(n) ∈ O(h(n))");
                    } else if (a > b) {
                        System.out.println("⇒ f(n) - g(n) ∈ Θ(h(n))");
                    } else {
                        System.out.println("Error: esto no cumple f(n) ≥ g(n)");
                    }
                    break;
                }

                case 2: 
                {
                    System.out.print("Ingresa base a (>1): ");
                    a = ejercicios.nextDouble();

                    System.out.print("Ingresa base b (>1): ");
                    b = ejercicios.nextDouble();

                    System.out.print("Ingresa un valor grande de n (>1): ");
                    n = ejercicios.nextDouble();

                    f_n = Math.log(n) / Math.log(a);
                    h_n = Math.log(n) / Math.log(b);
                    diferencia = f_n / h_n;

                    log_f_n = Math.pow(2, f_n);
                    log_h_n = Math.pow(2, h_n);
                    double ratio = log_f_n / log_h_n;

                    System.out.println("\nlog_a(n) / log_b(n) = " + diferencia);
                    System.out.println("⇒ log_a(n) ∈ Θ(log_b(n))");
                    System.out.println("\n2^log_a(n) / 2^log_b(n) = " + ratio);
                    System.out.println("⇒ 2^log_a(n) ∉ Θ(2^log_b(n)) si a ≠ b");
                    break;
                }

                case 3: {
                    System.out.print("Ingresa el valor de n: ");
                    n = ejercicios.nextDouble();

                    f_n = Math.pow(n, 2);
                    h_n = f_n + n;

                    log_f_n = Math.log(f_n) / Math.log(2);
                    log_h_n = Math.log(h_n) / Math.log(2);

                    areBigOEqual = (f_n / h_n > 0.1 && f_n / h_n < 10);
                    areLogBigOEqual = (log_f_n / log_h_n > 0.1 && log_f_n / log_h_n < 10);

                    System.out.println("\nEjemplo A:");
                    System.out.println("f(n) = " + f_n);
                    System.out.println("h(n) = " + h_n);
                    System.out.println("log(f(n)) = " + log_f_n);
                    System.out.println("log(h(n)) = " + log_h_n);
                    System.out.println("¿O(f(n)) = O(h(n))? " + areBigOEqual);
                    System.out.println("¿O(log(f(n))) = O(log(h(n)))? " + areLogBigOEqual);

                    f_n2 = Math.pow(2, n);
                    h_n2 = Math.pow(3, n);

                    log_f_n2 = Math.log(f_n2) / Math.log(2);
                    log_h_n2 = Math.log(h_n2) / Math.log(2);

                    areBigOEqual2 = (f_n2 / h_n2 > 0.1 && f_n2 / h_n2 < 10);
                    areLogBigOEqual2 = (log_f_n2 / log_h_n2 > 0.1 && log_f_n2 / log_h_n2 < 10);

                    System.out.println("\nEjemplo B:");
                    System.out.println("f(n) = " + f_n2);
                    System.out.println("h(n) = " + h_n2);
                    System.out.println("log(f(n)) = " + log_f_n2);
                    System.out.println("log(h(n)) = " + log_h_n2);
                    System.out.println("¿O(log(f(n))) = O(log(h(n)))? " + areLogBigOEqual2);
                    System.out.println("¿O(f(n)) = O(h(n))? " + areBigOEqual2);
                    break;
                }

                case 4:
                {  
                    System.out.println("Ingresa el valor de n (entero positivo): ");
                    n = ejercicios.nextDouble();

                    if (n <= 0 || n != Math.floor(n)) {
                        System.out.println("n debe ser un entero positivo.");
                        break;
                    }
                    long resultado = 0;

                    resultado = new Object() {
                        long calcularT(int x) {
                            if (x <= 0) return 0;
                            if (x == 1) return 1;
                            return (long) (x * x) + 4 * calcularT(x / 2);
                        }
                    }.calcularT((int) n);

                    System.out.println("\nT(" + (int) n + ") = " + resultado);
                    System.out.println("Orden de T(n) ∈ Θ(n^2 log n)");
                    break;
                }

                case 5: 
                {
                    System.out.print("Introduce un número entero positivo n: ");
                    n = ejercicios.nextDouble();

                    if (n <= 0 || n != Math.floor(n)) {
                        System.out.println("n debe ser un entero positivo.");
                        break;
                    }

                    suma = 0;
                    contador = 1;
                    num = (int) n;

                    while (suma < num) {
                        suma += contador;
                        contador++;
                    }

                    if (suma == num) {
                        System.out.println(num + " es un número triangular.");
                    } else {
                        System.out.println(num + " NO es un número triangular.");
                    }
                    break;
                }

                case 7:
                {
                    n = 1000000; 
                    int maquina = 100; 
     
                    n1 = n * maquina;
                    System.out.println("(a) k1 n:" + n1);
       
                    n2 = n / 10; 
                    System.out.println("(b) K2 n^2: " + n2);
   
                    n3 = n - 2; 
                    System.out.println("(c) K 10^n: " + n3);
                    break;
                }
                
                case 8:
                {
                    System.out.print("Ingrese el tamaño del vector: ");
                    int nn = ejercicios.nextInt();

                    if (nn <= 0) {
                        System.out.println("El tamaño debe ser positivo.");
                        break;
                    }

                    int[] arr = new int[nn];
                    System.out.println("Ingrese los elementos del vector:");
                    for (int i = 0; i < nn; i++) {
                        System.out.print("Elemento[" + i + "] = ");
                        arr[i] = ejercicios.nextInt();
                    }

                    int comparaciones = 0;
                    int min, max, inicio;

                    if (nn % 2 == 0) {
                        comparaciones++;
                        if (arr[0] < arr[1]) {
                        min = arr[0];
                        max = arr[1];
                    } else {
                        min = arr[1];
                        max = arr[0];
                    }
                    inicio = 2;
                    } else {
                        min = max = arr[0];
                        inicio = 1;
                    }

                    for (int i = inicio; i < nn - 1; i += 2) {
                        comparaciones++; // comparación dentro de la pareja
                        int menorPar, mayorPar;
                        if (arr[i] < arr[i + 1]) {
                            menorPar = arr[i];
                            mayorPar = arr[i + 1];
                        } else {
                            menorPar = arr[i + 1];
                            mayorPar = arr[i];
                        }

                        comparaciones++; // comparar menor con min
                        if (menorPar < min) {
                            min = menorPar;
                        }

                        comparaciones++; // comparar mayor con max
                        if (mayorPar > max) {
                            max = mayorPar;
                        }
                    }
                    System.out.println("\nResultado:");
                    System.out.println("  Mínimo = " + min);
                    System.out.println("  Máximo = " + max);
                    System.out.println("Comparaciones realizadas = " + comparaciones);
                    System.out.println("3·n/2 = " + (3.0 * nn / 2));
                    System.out.println("¿Se cumple comparaciones < 3n/2? " + (comparaciones < (3.0 * nn / 2)));
                    break;
                }

                case 9:
                {
                    System.out.print("Ingrese el valor de n (entero positivo): ");
                    int valorN = ejercicios.nextInt();

                    if (valorN <= 0) {
                        System.out.println("n debe ser un entero positivo.");
                        break;
                    }

                    double resultado = new Object() {
                    double T(int n) {
                        if (n <= 1) {
                            return 1;
                        } else {
                            return 2 * T(n / 4) + Math.log(n) / Math.log(2); // log base 2
                        }
                        }
                    }.T(valorN);

                    System.out.println("T(" + valorN + ") = " + resultado);
                    System.out.println("Orden de T(n) ∈ Θ(log n)");
                    break;
                }

                case 10:
                {
                    System.out.println("Elige una opción:");
                    System.out.println("1. Ejecutar total(n) con parcial(n)");
                    System.out.println("2. Ejecutar total(n, m)");
                    int opcion10 = ejercicios.nextInt();
    if (opcion10 == 1) {
        System.out.print("Ingresa n (entero positivo): ");
        int n10 = ejercicios.nextInt();
        if (n10 <= 0) {
            System.out.println("n debe ser un entero positivo.");
            break;
        }

        int resultadoTotal = new Object() {
            int parcial(int m) {
                if (m == 1) return 1;
                return 2 * parcial(m - 1);
            }

            int total(int n) {
                if (n == 1) return 1;
                return total(n - 1) + 2 * parcial(n - 1);
            }
        }.total(n10);

        System.out.println("Resultado de total(n) con parcial(n): " + resultadoTotal);
        System.out.println("Orden temporal estimado: Θ(n²)");

    } else if (opcion10 == 2) {
        System.out.print("Ingresa n (entero positivo): ");
        int n10 = ejercicios.nextInt();
        System.out.print("Ingresa m (entero positivo): ");
        int m10 = ejercicios.nextInt();

        if (n10 <= 0 || m10 <= 0) {
            System.out.println("Ambos valores deben ser enteros positivos.");
            break;
        }

        int resultadoTotalDos = new Object() {
            int total(int n, int m) {
                if (n == 1) return m;
                return m + total(n - 1, 2 * m);
            }
        }.total(n10, m10);

        System.out.println("Resultado de total(n, m): " + resultadoTotalDos);
        System.out.println("Orden temporal estimado: Θ(n)");

    } else {
        System.out.println("Opción no válida.");
    }

                break;
                }

                case 11:
                {
                    
    System.out.println("=== Búsqueda de patrón (String B dentro de String A) ===");
    ejercicios.nextLine(); // Limpiar el buffer

    System.out.print("Ingrese la cadena A (texto principal): ");
    String A = ejercicios.nextLine();

    System.out.print("Ingrese la cadena B (patrón a buscar): ");
    String B = ejercicios.nextLine();

    if (B.length() > A.length()) {
        System.out.println("El patrón B no puede ser más largo que la cadena A.");
        break;
    }

    int N = A.length();
    int M = B.length();
    int limite = N - M + 1;
    int com = 0;
    boolean encontrado = false;
    int comienzo = -1;

    while (!encontrado && com < limite) {
        int i = com;
        int j = 0;

        while (j < M && A.charAt(i) == B.charAt(j)) {
            i++;
            j++;
        }

        if (j == M) {
            encontrado = true;
        } else {
            com++;
        }
    }

    if (encontrado) {
        comienzo = com;
        System.out.println("El patrón B comienza en la posición: " + comienzo);
    } else {
        System.out.println("No se encontró el patrón B en A.");
    }

    System.out.println("Orden temporal estimado: Θ(n·m) (fuerza bruta)");
    break;

                }

                case 12:
                {
                    System.out.print("Ingrese el tamaño del vector: ");
                    int tam = ejercicios.nextInt();

                    if (tam <= 0) {
                        System.out.println("El tamaño debe ser mayor que cero.");
                        break;
                    }

                    int[] arreglo = new int[tam];
                    System.out.println("Ingrese los elementos del vector:");
                    for (int i = 0; i < tam; i++) {
                        System.out.print("Elemento[" + i + "] = ");
                        arreglo[i] = ejercicios.nextInt();
                    }

                    // Fase 1: ordenación por pares
                    for (int i = 0; i < tam - 1; i += 2) {
                        if (arreglo[i] > arreglo[i + 1]) {
                            int temp = arreglo[i];
                            arreglo[i] = arreglo[i + 1];
                            arreglo[i + 1] = temp;
                        }
                    }

                    // Fase 2: ordenación final con sort
                    Arrays.sort(arreglo);

                    System.out.println("Vector ordenado: " + Arrays.toString(arreglo));
                    System.out.println("Orden temporal estimado: Θ(n log n)");
                    break;
                }

                case 13:
                {
                    System.out.println("=== Verificación de Palíndromo ===");
                    ejercicios.nextLine(); // Limpiar el buffer

                    System.out.print("Ingrese una cadena para verificar: ");
                    String cadena = ejercicios.nextLine();

                    boolean esPalindromo = new Object() {
                        boolean isPalindrome(String C, int i, int j) {
                            if (i >= j) {
                                return true;
                            } else if (C.charAt(i) != C.charAt(j)) {
                                return false;
                            } else {
                                return isPalindrome(C, i + 1, j - 1);
                            }
                        }
                    }.isPalindrome(cadena, 0, cadena.length() - 1);

                    if (esPalindromo) {
                        System.out.println("La cadena es un palíndromo.");
                    } else {
                        System.out.println("La cadena NO es un palíndromo.");
                    }

                    System.out.println("Orden temporal estimado: Θ(n)");
                    break;
                }

                case 14:
                {
                    System.out.println("=== Comparación de costes: Trivial vs. Divide y vencerás ===");
                    System.out.print("¿Cuántos valores deseas probar? ");
                    int m = ejercicios.nextInt();

                    int n14 = 16;  // Valor inicial de n
                    for (int i = 0; i < m; i++) {
                        long costTrivial = (long) n14 * n14;

                        double costDC = new Object() {
                            double dcCost(int n) {
                                if (n <= 1) return 1;
                                double log2n = Math.log(n) / Math.log(2);
                                double halfCost = dcCost(n / 2);
                                return 2 * halfCost + 2 * n * log2n;
                            }
                        }.dcCost(n14);

                        System.out.println("n = " + n14);
                        System.out.println("  Costo trivial (n^2): " + costTrivial);
                        System.out.println("  Costo divide y vencerás (T(n)): " + costDC);
                        System.out.println();

                        n14 *= 2;  // duplicamos n para la siguiente iteración
                    }
                    System.out.println("Orden temporal estimado:");
                    System.out.println("  - Trivial: Θ(n²)");
                    System.out.println("  - Divide y vencerás: Θ(n log² n)");
                    break;
                }

                case 15:
                {
                    System.out.print("Introduce el tamaño n del vector: ");
                    int n15 = ejercicios.nextInt();

                    int comparaciones = new Object() {
                        int countComparisons(int n) {
                            if (n <= 1) {
                                return 0;
                            } else if (n == 2) {
                                return 1;
                            } else {
                                return 3 + countComparisons(n - 2);
                            }
                        }
                    }.countComparisons(n15);

                    System.out.println("Peor caso: numero de comparaciones = " + comparaciones);
                    System.out.println("Orden estimado: T(n) ∈ Θ(n)");
                    break;
                }

                default:
                    if (var1 != 0) {
                        System.out.println("Opción no válida.");
                    }
                    break;
            }

        } while (var1 != 0);

        ejercicios.close();
    }
}

