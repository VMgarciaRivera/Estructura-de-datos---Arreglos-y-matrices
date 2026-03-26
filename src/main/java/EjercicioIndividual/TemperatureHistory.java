/*
 Historial de Temperaturas
Guardar temperaturas diarias de un mes.
Calcular promedio, días más fríos y más cálidos.
Graficar (en texto) las temperaturas diarias como barras. 
* */

package EjercicioIndividual;

public class TemperatureHistory {
    private final double[] temperatures;

    public TemperatureHistory(int days) {
        temperatures = new double[days];
    }

    public void setTemperature(int day, double temperature) {
        if (day >= 1 && day <= temperatures.length) {
            temperatures[day - 1] = temperature;
        } else {
            System.out.println("Día inválido. Debe estar entre 1 y " + temperatures.length);
        }
    }

    public double getAverageTemperature() {
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.length;
    }

    public double getMinTemperature() {
        double min = Double.MAX_VALUE;
        for (double temp : temperatures) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    public double getMaxTemperature() {
        double max = Double.MIN_VALUE;
        for (double temp : temperatures) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public void printTemperatureGraph() {
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            int bars = (int) (temperatures[i] / 2);
            for (int j = 0; j < bars; j++) {
                System.out.print("|");
            }
            System.out.println(" " + temperatures[i] + "°C");
        }
    }
}
