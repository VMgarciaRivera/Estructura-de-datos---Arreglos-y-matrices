//DECLARACION Y CREACION DE UN ARREGLO
//DELCARAR UN ARREGLO DE 10 ENTEROS
//INICIALIZARLO CON VALORES ALEATORIOS

package Arrays;

public class Actv1 {

    public int[] arreglo = new int[10];

    public void llenarArreglo(){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()*100);
        }
    }

}
