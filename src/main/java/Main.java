import Arrays.Actv1;
import Arrays.Actv2;
import Arrays.Actv3;
import matrices.*;
import EjercicioIndividual.TemperatureHistory;

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
            System.out.println("Ejercicio Individual por estudiante:");
            System.out.println("7. Ejercicio 13 Historial de temperaturas");
            System.out.println("8. Salir");
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
                    System.out.println("De cuantos dias va a tomar la temperatura? (máximo 30)");
                    int dias = new Scanner(System.in).nextInt();
                    if (dias > 30) {
                        System.out.println("El número de días no puede ser mayor a 30. Se establecerá en 30.");
                        dias = 30;
                    }
                    TemperatureHistory tempHistory = new TemperatureHistory(dias);
                    for (int i = 1; i <= dias; i++) {
                        System.out.print("Ingrese la temperatura del día " + i + ": ");
                        double temp = new Scanner(System.in).nextDouble();
                        tempHistory.setTemperature(i, temp);
                    }
                    System.out.println("Promedio de temperaturas: " + tempHistory.getAverageTemperature() + "°C");
                    System.out.println("Temperatura más fría: " + tempHistory.getMinTemperature() + "°C");
                    System.out.println("Temperatura más cálida: " + tempHistory.getMaxTemperature() + "°C");
                    System.out.println("Gráfico de temperaturas:");
                    tempHistory.printTemperatureGraph();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}
