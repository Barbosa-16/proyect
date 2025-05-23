import java.util.Scanner;

public class EjerciciosPractica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];

        System.out.println("Escriba 5 nombres");
        for (int i = 0; i < nombres.length; i++ ) {
            System.out.print("Nombre " +  (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
      

        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println(nombres[i]);
        }

        scanner.close();
    }
}

