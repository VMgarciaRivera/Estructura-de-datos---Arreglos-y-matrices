/*
 Historial de Temperaturas
Guardar temperaturas diarias de un mes.
Calcular promedio, días más fríos y más cálidos.
Graficar (en texto) las temperaturas diarias como barras. 
* */

package EjercicioIndividual;

import java.util.Arrays;

public class TemperatureHistory {

    // Record para almacenar día y temperatura
    public record DiaTemperatura(int dia, double temperatura) {}

    private DiaTemperatura[] datos;

    public TemperatureHistory(int days) {
        datos = new DiaTemperatura[days];
    }

    // Inicializar datos
    public void setTemperature(int day, double temperature) {
        if (day >= 1 && day <= datos.length) {
            datos[day - 1] = new DiaTemperatura(day, temperature);
        } else {
            System.out.println("Día inválido");
        }
    }

    // Promedio
    public double getAverageTemperature() {
        double sum = 0;
        for (DiaTemperatura d : datos) {
            sum += d.temperatura();
        }
        return sum / datos.length;
    }

    // Mínima
    public double getMinTemperature() {
        double min = Double.MAX_VALUE;
        for (DiaTemperatura d : datos) {
            if (d.temperatura() < min) {
                min = d.temperatura();
            }
        }
        return min;
    }

    // Máxima
    public double getMaxTemperature() {
        double max = Double.MIN_VALUE;
        for (DiaTemperatura d : datos) {
            if (d.temperatura() > max) {
                max = d.temperatura();
            }
        }
        return max;
    }

    // Gráfica en texto
    public void printTemperatureGraph() {
        for (DiaTemperatura d : datos) {
            System.out.print("Día " + d.dia() + ": ");
            int bars = (int) (d.temperatura() / 2);
            for (int i = 0; i < bars; i++) {
                System.out.print("|");
            }
            System.out.println(" " + d.temperatura() + "°C");
        }
    }

    // Modificación (clave con record)
    public void updateTemperature(int day, double newTemp) {
        if (day >= 1 && day <= datos.length) {
            datos[day - 1] = new DiaTemperatura(day, newTemp);
        }
    }

    // Mostrar datos
    public void printAll() {
        for (DiaTemperatura d : datos) {
            System.out.println("Día " + d.dia() + ": " + d.temperatura() + "°C");
        }
    }

    // MAIN para probar
    public static void main(String[] args) {
        TemperatureHistory th = new TemperatureHistory(5);

        th.setTemperature(1, 30);
        th.setTemperature(2, 28);
        th.setTemperature(3, 32);
        th.setTemperature(4, 25);
        th.setTemperature(5, 29);

        System.out.println("Temperaturas:");
        th.printAll();

        System.out.println("\nPromedio: " + th.getAverageTemperature());
        System.out.println("Mínima: " + th.getMinTemperature());
        System.out.println("Máxima: " + th.getMaxTemperature());

        System.out.println("\nGráfica:");
        th.printTemperatureGraph();

        // Modificación
        th.updateTemperature(2, 31);

        System.out.println("\nDespués de modificar:");
        th.printAll();
    }
}