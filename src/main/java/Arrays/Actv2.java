//RECORRER EL ARRAY DE Actv1 USANDO UN BLUCE FOR CLASICO
//RECORRER EL ARRAY DE Actv1 USANDO UN BLUCE FOR-EACH

package Arrays;

public class Actv2 {

    public static void recorrerForClasico(int[] arreglo){
        System.out.println("Recorrido con for clasico:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    public static void recorrerForEach(int[] arreglo){
        System.out.println("Recorrido con for each:");
        for (int num : arreglo) {
            System.out.println(num);
        }

    }

}
