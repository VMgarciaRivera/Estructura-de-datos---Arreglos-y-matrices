//busqueda lineal de un arreglo

class Actv4
{
    public static int BusquedaLineal(int[] arreglo, int valorBuscado)
    {
        for (int i = 0; i < arreglo.Length; i++)
        {
            if (arreglo[i] == valorBuscado)
            {
                return i; // Retorna el índice del valor encontrado
            }
        }
        return -1; // Retorna -1 si el valor no se encuentra en el arreglo
    }
}