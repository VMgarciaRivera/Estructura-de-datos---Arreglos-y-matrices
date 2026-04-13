//RECORRER EL ARRAY DE Actv1 USANDO UN BLUCE FOR CLASICO
//RECORRER EL ARRAY DE Actv1 USANDO UN BLUCE FOR-EACH

namespace ArraysACTV;
class Actv2
{
    public static void RecorrerArregloFor(int[] arreglo)
    {
        Console.WriteLine("Recorriendo el arreglo con un bucle for clásico:");
        for (int i = 0; i < arreglo.Length; i++)
        {
            Console.WriteLine(arreglo[i]);
        }
    }

    public static void RecorrerArregloForEach(int[] arreglo)
    {
        Console.WriteLine("Recorriendo el arreglo con un bucle foreach:");
        foreach (int numero in arreglo)
        {
            Console.WriteLine(numero);
        }
    }
}