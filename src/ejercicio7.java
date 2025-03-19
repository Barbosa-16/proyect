import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("numero no valido");
            input.close();
            return;
            
        } else if (num >= 1 && num <= 9) {
            System.out.println("El numero ingresado tiene una cifra.");
            
        } else if (num >= 10 && num <=99) {
            System.out.println("El numero ingresado tiene dos cifras.");
        } else {
            System.out.println("El numero tiene tres cifras.");
        }
        input.close();
    }
    
}
