//Declaración e inicialización
// Crear una matriz 3x3 de enteros
// Inicializar con valores del 1 al 9.

/*
Recorrido
Imprimir la matriz en forma de tabla.
Recorrerla por columnas.
*/

namespace MatricesACTV;

class Actv1
{
    public static int[,] IniciarMatriz()
    {
        // Declaración e inicialización de una matriz 3x3 de enteros
        int[,] matriz = //new int [3, 3]
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir la matriz en tabla
        Console.WriteLine("Matriz en forma de tabla:");
        for (int i = 0; i < matriz.GetLength(0); i++)
        {
            for (int j = 0; j < matriz.GetLength(1); j++)
            {
                Console.Write(matriz[i, j] + " ");
            }
            Console.WriteLine(); // Nueva línea después de cada fila
        }

        // Recorrer la matriz por columnas
        Console.WriteLine("\nRecorrido por columnas:");
        for (int j = 0; j < matriz.GetLength(1); j++)
        {
            for (int i = 0; i < matriz.GetLength(0); i++)
            {
                Console.Write(matriz[i, j] + " ");
            }
            Console.WriteLine(); // Nueva línea después de cada columna
        }

        return matriz;
    }
}