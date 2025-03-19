import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("El numero ingresado es positivo.");
        } else if (num < 0) {
            System.out.println("El numero ingresado es negtivo.");
            
        }else {
            System.out.println("El numero es nulo.");
        }
         input.close();
        
    }
    
}
