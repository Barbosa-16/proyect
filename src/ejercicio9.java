import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Ingrese la segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.println("Ingrese la tercera nota: ");
        float nota3 = scanner.nextFloat();

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println("Promocionado");
            
        } else {
            if (promedio >= 4) {
                System.out.println("Regular");
                
            } else {
                if (promedio < 4) {
                    System.out.println("Reprobado");
                    
                }
            }
        }
        scanner.close();
    }
    
}
