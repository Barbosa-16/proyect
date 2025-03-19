import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar los nombres de las dos personas
        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        // Comparar los nombres ignorando mayúsculas y minúsculas
        int comparacion = nombre1.compareToIgnoreCase(nombre2);

        // Mostrar los nombres en orden alfabético
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

        // Cerrar el scanner
        scanner.close();
    }
}
