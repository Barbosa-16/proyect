import java.util.Scanner;

public class operaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1>numero2) {
            int suma = numero1 + numero2;
            int diferencia = numero1 - numero2;

            System.out.println("La suma es: " + suma);
            System.out.println("La diferencia es: " + diferencia);
            
        } else {
            if (numero2 != 0) {
                int producto = numero1 * numero2;
                double division = (double) numero1 / numero2;
                System.out.println("El producto es: " + producto);
                System.out.println("La division es: " + division);
                
            } else { 
                System.out.println("No se puede dividir por 0. ");
            }
        }



        scanner.close();

    }
}