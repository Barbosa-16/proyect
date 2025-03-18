import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su sueldo: ");
        int sueldo = scanner.nextInt();

        if (sueldo > 3000) {
            System.out.println("Debe abonar impuestos");
            
        } else {
            System.out.println("No debe abonar impuestos");
        }
       scanner.close();
    }
    
}
