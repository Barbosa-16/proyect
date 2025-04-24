import java.util.Scanner;

public class PracticaArrays7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5]; 

        
        System.out.println("Introduce 5 números para el vector1:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vector1[" + i + "]: ");
            vector1[i] = scanner.nextInt();
        }

        System.out.println("\nIntroduce 5 números para el vector2:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vector2[" + i + "]: ");
            vector2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("\nResultado de la suma (vector3 = vector1 + vector2):");
        for (int i = 0; i < 5; i++) {
            System.out.println("vector3[" + i + "] = " + vector1[i] + " + " + vector2[i] + " = " + vector3[i]);
        }

        scanner.close();
    }
}
