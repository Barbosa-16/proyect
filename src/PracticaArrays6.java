import java.util.Scanner;

public class PracticaArrays6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] diasDelMes = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        System.out.print("Introduce un número de mes (1-12): ");
        int numeroMes = scanner.nextInt();

        if (numeroMes >= 1 && numeroMes <= 12) {
            String nombre = nombresMeses[numeroMes - 1];  
            int dias = diasDelMes[numeroMes - 1];

            System.out.println("El mes es " + nombre + " y tiene " + dias + " días.");
        } else {
            System.out.println("Número de mes inválido. Debe estar entre 1 y 12.");
        }

        scanner.close();
    }
}
