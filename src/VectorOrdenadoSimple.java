import java.util.Scanner;

public class VectorOrdenadoSimple {
    public static void main(String[] args) {
        int[] numeros = new int[5]; 
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa 5 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número #" + (i + 1) + ": ");
            numeros[i] = input.nextInt(); 
        }

        System.out.println("\nVector original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nVector ordenado (de menor a mayor):");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        input.close();
    }
}
