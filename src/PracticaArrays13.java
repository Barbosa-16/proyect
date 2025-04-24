import java.util.Scanner;

public class PracticaArrays13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nombres = new String[5];

        double[][] kms = new double[5][7]; 

        double[] total_kms = new double[5]; 
  
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre del conductor " + (i + 1) + ": ");
            nombres[i] = input.nextLine();
        }

        for (int i = 0; i < kms.length; i++) {
            for (int j = 0; j < kms[i].length; j++) {
                System.out.print("Introduce los kilómetros del conductor " + nombres[i] + " en el día " + (j + 1) + ": ");
                kms[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < kms.length; i++) {
            double total = 0;
            for (int j = 0; j < kms[i].length; j++) {
                total += kms[i][j];
            }
            total_kms[i] = total; 
        }

        System.out.println("\nTotal de kilómetros conducidos por cada conductor:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " ha conducido un total de " + total_kms[i] + " km.");
        }

        input.close();
    }
}
