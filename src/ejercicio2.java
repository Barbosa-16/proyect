import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Ingrese la tercera nota: ");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println("Promocionado");
            
        } else {
        System.out.println("Su promedio es de: " + promedio);
            
        }
        scanner.close();
        

    }


    
}
