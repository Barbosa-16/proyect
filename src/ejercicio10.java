import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su sueldo:");
        int sueldo = scanner.nextInt();

        System.out.print("Ingrese los años de antigüedad:");
        int años = scanner.nextInt();

        if (sueldo <= 500 && años >= 10) {
            float valor = sueldo + sueldo * 0.20f;
            System.out.println("Su sueldo es de "+ valor);
        } else if (sueldo <= 500 && años < 10) {
            float valor = sueldo + sueldo * 0.05f;
            System.out.println("Su sueldo es de "+ valor);
        }else {
            System.out.println("Su sueldo es mayor a 500, por ende, no se le aplica un aumento.");
        }
        scanner.close();

    }
}
