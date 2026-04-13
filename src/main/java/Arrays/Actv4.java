//busqueda lineal de un arreglo

package Arrays;

public class Actv4 {

    public static void busquedaLineal(int[] arreglo, int valor) {
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                System.out.println("Valor " + valor + " encontrado en la posición: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Valor " + valor + " no encontrado en el arreglo.");
        }
    }

}
