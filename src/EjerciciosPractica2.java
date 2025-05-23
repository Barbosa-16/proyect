import java.util.Scanner;

public class EjerciciosPractica2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] numeros = new int[5];
        
        System.out.println("Digite 5 numeros");
        for (int i = 0; i< numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        int mayor = numeros [0];
        int menor = numeros [0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                }
            if (numeros[i] < menor) {
                menor = numeros[i];
                }
        }
            System.out.print("El numero mayor es: " + mayor);
            System.out.println();
            System.out.print("El numero menor es: " + menor);
    }
}
