import java.util.Scanner;

public class PatronNumericoEspecial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo n: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("El número debe ser positivo.");
            input.close();
            return;
        }

        for (int k = 1; k <= n; k++) {
 
            for (int j = 1; j <= k; j++) {
              
                if (j % 2 == 1) {
                    System.out.print(k);
                } else {
                    System.out.print("-" + k);
                }

                if (j < k) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}
