/*Modificación
Cambiar todos los valores impares por cero.
Multiplicar todos los valores por su índice.
*/

namespace ArraysACTV;
class Actv3
{
    public static void CambiarImparesPorCero(int[] arreglo)
    {
        int[] arregloCopia = (int[])arreglo.Clone(); // Clonar el arreglo original para mostrarlo después
        for (int i = 0; i < arregloCopia.Length; i++)
        {
            // Cambiar valores impares por cero
            if (arregloCopia[i] % 2 != 0)
            {
                arregloCopia[i] = 0;
            }
        }

        Console.WriteLine("Arreglo después de cambiar impares por cero:");
        foreach (int valor in arregloCopia)
        {
            Console.Write(valor + " ");
        }
    }

    public static void MultiplicarPorIndice(int[] arreglo)
    {
        int[] arregloCopia = (int[])arreglo.Clone(); // Clonar el arreglo original para mostrarlo después
        for (int i = 0; i < arregloCopia.Length; i++)
        {
            // Multiplicar cada valor por su índice
            arregloCopia[i] *= i;
        }
        Console.WriteLine("\nArreglo después de multiplicar por índice:");
        foreach (int valor in arregloCopia)        {
            Console.Write(valor + " ");
        }
    }

}