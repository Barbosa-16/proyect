import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años ." );

        input.close();
    }
    
}
