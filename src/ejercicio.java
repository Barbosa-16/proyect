import java.util.Scanner;

public class ejercicio
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int num = input.nextInt();

        if (num <= 0) {
            System.out.println("Error: Debe ingresar un número entero positivo.");
            input.close();
            return;
        }

        for (int i = num; i >= 1; i--) {
            for (int espacio = 1; espacio < i; espacio++) {
                System.out.print("  ");
            }

            for (int j = i; j <= num; j++) {
                System.out.print(j + " ");
            }

            for (int j = num - 1; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        input.close();
    }
}
