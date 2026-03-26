/*
 Recorrido
Imprimir la matriz en forma de tabla.
Recorrerla por columnas.
* */

package matrices;

public class Actv2 {
    public static void recorrerPorFilas(int[][] matriz) {
        System.out.println("Recorrido por filas:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void recorrerPorColumnas(int[][] matriz) {
        System.out.println("Recorrido por columnas:");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
