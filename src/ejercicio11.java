import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayor7 = 0;
        int menor7 = 0;

        for (int i = 1; i <= 10; i++){
            System.out.print("ingrese la nota "+ i + ": ");
            float notas = scanner.nextFloat();

            if (notas >= 7) {
                mayor7++;
            }else {
                menor7++;
            }
        }
        System.out.println("la cantidad de estudiantes que tienen una nota mayor a 7: " +mayor7);
        System.out.println("la cantidad de estudiantes que tienen una nota menor a 7: " + menor7);
        scanner.close();
        }

    
}
