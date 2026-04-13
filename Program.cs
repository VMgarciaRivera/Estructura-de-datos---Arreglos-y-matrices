class Program
{
    static void Main(string[] args)
    {

        int[] array = new int[10];
        int[,] matrix = new int[3, 3];

        while (true)
        {
            Console.WriteLine("Selecciona una actividad:");
            Console.WriteLine("ARRAYS");
            Console.WriteLine("1. Actividad 1");
            Console.WriteLine("2. Actividad 2");
            Console.WriteLine("3. Actividad 3");
            Console.WriteLine("4. Actividad 4");
            Console.WriteLine("MATRICES");
            Console.WriteLine("5. Actividad 1");
            Console.WriteLine("6. Actividad 2");
            Console.WriteLine("7. Salir");
            String opcion = Console.ReadLine() ?? "";

            switch (opcion)
            {
                case "1":
                    array = ArraysACTV.Actv1.CrearArreglo();
                    break;
                case "2":
                    ArraysACTV.Actv2.RecorrerArregloFor(array);
                    ArraysACTV.Actv2.RecorrerArregloForEach(array);
                    break;
                case "3":
                    ArraysACTV.Actv3.CambiarImparesPorCero(array);
                    ArraysACTV.Actv3.MultiplicarPorIndice(array);
                    break;
                case "4":
                    Console.WriteLine("Ingrese el valor a buscar:");    
                    String Valorbuscado = Console.ReadLine() ?? "";
                    ArraysACTV.Actv4.BusquedaLineal(array, int.Parse(Valorbuscado));
                    break;
                case "5":
                    matrix = MatricesACTV.Actv1.IniciarMatriz();
                    break;
                case "6":
                    MatricesACTV.Actv2.OperacionesMatriz(matrix);
                    break;
                case "7":
                    Console.WriteLine("Saliendo del programa...");
                    return;
                default:
                    Console.WriteLine("Opción no válida.");
                    break;
            }
        }

    }
}