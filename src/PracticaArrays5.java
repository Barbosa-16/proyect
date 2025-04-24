import java.util.Random;  
import java.util.Arrays; 

public class PracticaArrays5 {
    public static void main(String[] args) {
        int[] numeros = new int[10]; 
        Random aleatorio = new Random();  

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(100) + 1; 
        }


        System.out.println("Vector original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        Arrays.sort(numeros);

        System.out.println("\n\nVector ordenado de menor a mayor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
