/*
Operaciones con matrices
Sumar todos los elementos.
Intercambiar la primera fila con la última.
*/

namespace MatricesACTV;

class Actv2
{
    public static void OperacionesMatriz(int[,] matriz)
    {
        // Sumar todos los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                suma += matriz[i, j];
            }
        }
        Console.WriteLine($"Suma de todos los elementos: {suma}");

        // Intercambiar la primera fila con la última
        int filas = matriz.GetLength(0);
        int columnas = matriz.GetLength(1);
        
        for (int j = 0; j < columnas; j++)
        {
            int temp = matriz[0, j]; // Guardar el valor de la primera fila
            matriz[0, j] = matriz[filas - 1, j]; // Asignar el valor de la última fila a la primera
            matriz[filas - 1, j] = temp; // Asignar el valor guardado a la última fila
        }

        // Imprimir la matriz después del intercambio
        Console.WriteLine("\nMatriz después de intercambiar la primera y última fila:");
        for (int i = 0; i < filas; i++)
        {
            for (int j = 0; j < columnas; j++)
            {
                Console.Write(matriz[i, j] + " ");
            }
            Console.WriteLine(); // Nueva línea después de cada fila
        }
    }
}