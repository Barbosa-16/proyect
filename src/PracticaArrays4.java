import java.util.Scanner;

public class PracticaArrays4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int cantidadIngresada = 0;

        System.out.println("Introduce números enteros (negativo para detener):");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; 
            }

            numeros[i] = numero;
            cantidadIngresada++;
        }

    
        System.out.println("Números ingresados:");
        for (int i = 0; i < cantidadIngresada; i++) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}
