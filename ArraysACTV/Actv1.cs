/*
Declaración y creación de un arreglo
Declarar un arreglo de 10 enteros en cada lenguaje dado
Inicializarlo con valores aleatorios.
*/

class Actv1
{
    public static int[] CrearArreglo(){
        // Declaración y creación de un arreglo de 10 enteros
        int[] arreglo = new int[10];

        // Inicialización con valores aleatorios
        Random rand = new Random();
        for (int i = 0; i < arreglo.Length; i++)
        {
            arreglo[i] = rand.Next(1, 101); // Genera un número aleatorio entre 1 y 100
        }

        // Imprimir el arreglo para verificar los valores
        Console.WriteLine("Arreglo de enteros con valores aleatorios:");
        foreach (int numero in arreglo)
        {
            Console.WriteLine(numero);
        }

        return arreglo;
    }
}