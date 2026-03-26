/*
Operaciones
Sumar todos los elementos.
Intercambiar la primera fila con la última.
*/

package matrices;

public class Actv3 {
    public static int sumarElementos(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    public static void intercambiarFilas(int[][] matriz) {
        int[] temp = matriz[0];
        matriz[0] = matriz[matriz.length - 1];
        matriz[matriz.length - 1] = temp;
    }
}
