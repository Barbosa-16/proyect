import java.util.Scanner;

public class PracticaArrays9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] minimas = new double[5];
        double[] maximas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Día " + (i + 1) + " - Temperatura mínima: ");
            minimas[i] = input.nextDouble();

            System.out.print("Día " + (i + 1) + " - Temperatura máxima: ");
            maximas[i] = input.nextDouble();
        }

        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < 5; i++) {
            double media = (minimas[i] + maximas[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + media + "°");
        }

        double menorTemperatura = minimas[0];
        for (int i = 1; i < 5; i++) {
            if (minimas[i] < menorTemperatura) {
                menorTemperatura = minimas[i];
            }
        }

        System.out.println("\n Días con la temperatura más baja (" + menorTemperatura + "°):");
        for (int i = 0; i < 5; i++) {
            if (minimas[i] == menorTemperatura) {
                System.out.println("Día " + (i + 1));
            }
        }

        System.out.print("\nIngresa una temperatura para buscar si coincide con alguna máxima: ");
        double tempBuscar = input.nextDouble();
        boolean encontrada = false;

        for (int i = 0; i < 5; i++) {
            if (maximas[i] == tempBuscar) {
                System.out.println("Día " + (i + 1) + " tiene esa temperatura máxima.");
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("Ningún día tiene esa temperatura máxima.");
        }

        input.close();
    }
}
