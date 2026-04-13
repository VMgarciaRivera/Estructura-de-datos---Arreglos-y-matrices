/*Modificación
Cambiar todos los valores impares por cero.
Multiplicar todos los valores por su índice.
*/

namespace ArraysACTV;
class Actv3
{
    public static void CambiarImparesPorCero(int[] arreglo)
    {
        for (int i = 0; i < arreglo.Length; i++)
        {
            // Cambiar valores impares por cero
            if (arreglo[i] % 2 != 0)
            {
                arreglo[i] = 0;
            }
        }

        Console.WriteLine("Arreglo después de cambiar impares por cero:");
        foreach (int valor in arreglo)
        {
            Console.Write(valor + " ");
        }
    }

    public static void MultiplicarPorIndice(int[] arreglo)
    {
        for (int i = 0; i < arreglo.Length; i++)
        {
            // Multiplicar cada valor por su índice
            arreglo[i] *= i;
        }
        Console.WriteLine("\nArreglo después de multiplicar por índice:");
        foreach (int valor in arreglo)        {
            Console.Write(valor + " ");
        }
    }

}