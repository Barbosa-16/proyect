import java.util.Scanner;
public class PracticaArrays2 {
    public static void main(String[] args) {
        
        String [] original = new String[5];
        String [] inverso = new String[5];

        Scanner input = new Scanner(System.in);

        System.out.println("Escribe 5 palabras: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print("Palabra " + (i+1) + ": ");
            original [i] = input.nextLine();
        }

        for (int i = 0; i < inverso.length; i++) {
            inverso [i] = original[original.length - 1 - i];
        }

        System.out.println("Palabras en orden inverso: ");
        for (int i = 0; i < inverso.length; i++) {
            System.out.println(inverso[i]);
        }

        input.close();
    }
}
