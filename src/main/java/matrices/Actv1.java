//Declaración e inicialización
// Crear una matriz 3x3 de enteros en lenguaje de programación (Java)
// Inicializar con valores del 1 al 9.

package matrices;
import java.util.Arrays;

public class Actv1 {
    public int[][] crearMatriz() {
        int[][] matriz = new int[3][3];
        int valor = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor++;
            }
        }
        System.out.println("Matriz creada:" + Arrays.deepToString(matriz));
        return matriz;
    }
}
