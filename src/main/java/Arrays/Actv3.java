/*Modificación
Cambiar todos los valores impares por cero.
Multiplicar todos los valores por su índice.
*/

package Arrays;

public class Actv3 {

    public static void cambiarImparesPorCero(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 != 0) {
                arreglo[i] = 0;
            }
        }
    }

    public static void multiplicarPorIndice(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] *= i;
        }
    }

}
