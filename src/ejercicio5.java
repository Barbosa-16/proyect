import java.util.Scanner; 
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INGRESE DOS NUMEROS DISTINTOS.");
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();

        if (num1 > num2) {

            System.out.println("El " + num1 + " es mayor que el " + num2);
            
        } else {
            if (num2 > num1) {
                System.out.println("El " + num2 + " es mayor que el " + num1);
                
            } else {
                System.out.println("los numeros son iguales");
            }
        }
        scanner.close();
    }
    
}
