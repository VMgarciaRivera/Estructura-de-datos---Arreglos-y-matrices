import Arrays.Actv1;
import Arrays.Actv2;
import Arrays.Actv3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arreglo = new int[10];

        while(true){
            System.out.println("Seleccione una actividad:");
            System.out.println("1. Actividad 1: Declaración y creación de un arreglo");
            System.out.println("2. Actividad 2: Recorrer el arreglo");
            System.out.println("3. Actividad 3: Modificación del arreglo");
            System.out.println("4. Salir");
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
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}
