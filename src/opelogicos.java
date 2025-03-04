import java.util.Scanner;

public class opelogicos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESA EL PRIMER NUMERO");
        Float num1 = scanner.nextFloat();
        System.out.println("INGRESA EL SEGUNDO NUMERO");
        Float num2 = scanner.nextFloat();
        System.out.println("INGRESA EL TERCER NUMERO");
        Float num3 = scanner.nextFloat();
    

        System.out.println("el numero 1 es mayor que el numero 2 y el numero 2 es menor que el numero 3  " + (num1 > num2 && num2 < num3 ));
        System.out.println("el numero 1 es menor que el numero 2 || b mayor que el numero 3 " +  (num1 < num2 || num2 > num3));
        System.out.println("! (num1 > num2)" +  !(num1 > num2));

        scanner.close();
    }
}
