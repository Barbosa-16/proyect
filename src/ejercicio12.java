import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero de empleados: ");
        int empleados = scanner.nextInt();

        int mas300 = 0;
        int menos300 = 0;
        int total = 0;

        for (int i = 1; i <= empleados; i++ ){
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            int sueldo = scanner.nextInt();
            if (sueldo < 100 || sueldo > 500) {
                System.out.println("No es valido.");
                scanner.close();
                return;
            }

            else if (sueldo > 300) {
                mas300++;
                
            } else {
                menos300++;

            }
            
            total += sueldo;
        }
         System.out.println("La cantidad de empleados que cobran mas de 300 es: " + mas300);
         System.out.println("La cantidad de empleados que cobran menos de 300 es: " + menos300);
         System.out.println("el total es: " + total );
         scanner.close();
    }
}
