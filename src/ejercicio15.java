import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        int comparacion = nombre1.compareToIgnoreCase(nombre2);

     
        if (comparacion < 0) {
            System.out.println("Los nombres ordenados alfabéticamente son: ");
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else if (comparacion > 0) {
            System.out.println("Los nombres ordenados alfabéticamente son: ");
            System.out.println(nombre2);
            System.out.println(nombre1);
        } else {
            System.out.println("Ambos nombres son iguales (ignorando mayúsculas/minúsculas).");
        }
        scanner.close();
    }
}

