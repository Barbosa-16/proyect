import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO: ");
        int num = input.nextInt();

        if (num >= 10 && num <= 99) {
            System.out.println("El numero que ingreso tiene dos digitos.");
            
        } else if (num >= 1 && num <= 9) {
            System.out.println("El numero que ingreso tiene un digito.");
        } else {
            System.out.println("El numero no es valido.");
        }
        input.close();

    }
    
}
