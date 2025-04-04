import java.util.Scanner;

public class patronnumerico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Numero no valido");
            input.close();
            return;
        }


        for (int i = n; i >= 1; i--) {
 
            for (int espacio = 1; espacio < i; espacio++) {
                System.out.print("  ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }


            for (int j = n - 1; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println(); 

        input.close();
    }
}
}