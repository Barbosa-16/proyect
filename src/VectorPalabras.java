import java.util.Scanner;

public class VectorPalabras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] vectorOriginal = new String[5];
        String[] vectorInvertido = new String[5];

        System.out.println("Escribe 5 palabras:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            vectorOriginal[i] = input.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            vectorInvertido[i] = vectorOriginal[4 - i]; 
        }

        System.out.println("\n Palabras en orden inverso:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posición " + (i + 1) + ": " + vectorInvertido[i]);
        }

        input.close();
    }
}
