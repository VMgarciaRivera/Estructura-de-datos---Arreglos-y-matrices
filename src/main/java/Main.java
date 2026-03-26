import Arrays.Actv1;
import Arrays.Actv2;
import Arrays.Actv3;
import matrices.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arreglo = new int[10];
        int[][] matriz = new int[3][3];

        while(true){
            System.out.println("Seleccione una actividad:");
            System.out.println("Arreglos:");
            System.out.println("1. Actividad 1: Declaración y creación de un arreglo");
            System.out.println("2. Actividad 2: Recorrer el arreglo");
            System.out.println("3. Actividad 3: Modificación del arreglo");
            System.out.println("Matrices:");
            System.out.println("4. Actividad 1: Declaración y creación de una matriz");
            System.out.println("5. Actividad 2: Recorrer la matriz");
            System.out.println("6. Actividad 3: operaciones con matriz");
            System.out.println("7. Salir");
            int opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1:
                    Actv1 actv1 = new Actv1();
                    arreglo = actv1.llenarArreglo();
                    break;
                case 2:
                    Actv2.recorrerForClasico(arreglo);
                    Actv2.recorrerForEach(arreglo);
                    break;
                case 3:
                        Actv3.cambiarImparesPorCero(arreglo);
                        System.out.println("Arreglo después de cambiar impares por cero: " + java.util.Arrays.toString(arreglo));
                        Actv3.multiplicarPorIndice(arreglo);
                        System.out.println("Arreglo después de multiplicar por índice: " + java.util.Arrays.toString(arreglo));
                    break;
                case 4:
                    matrices.Actv1 actvMatriz = new matrices.Actv1();
                    matriz = actvMatriz.crearMatriz();
                    break;
                case 5:
                    matrices.Actv2.recorrerPorFilas(matriz);
                    matrices.Actv2.recorrerPorColumnas(matriz);
                    break;
                case 6:
                    int suma = matrices.Actv3.sumarElementos(matriz);
                    System.out.println("Suma de todos los elementos: " + suma);
                    matrices.Actv3.intercambiarFilas(matriz);
                    System.out.println("Matriz después de intercambiar la primera fila con la última:");
                    matrices.Actv2.recorrerPorFilas(matriz);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}
