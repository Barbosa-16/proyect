import java.util.Scanner;
public class numerosamigos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 <= 0 || numero2 <= 0) {
            System.out.print("Los numeros deben ser enteros positivos.");
            scanner.close();
            return;
            
        }

        System.out.print("Los divisores propios de " + numero1 + " son: ");
        int sumadedivisores1 = 0;
        boolean primerdivisor = true;

        for (int i = 1; i < numero1; i++) {
            if (numero1 % i == 0) {
                if (!primerdivisor) {
                    System.out.print(", ");
                }
                System.out.print(i);
                sumadedivisores1 += i;
                primerdivisor = false;
            }
        } 
        System.out.println();
        System.out.println("La suma de los divisores propios de " + numero1 + " es: " + sumadedivisores1);

        System.out.println();
        System.out.print("Los divisores propios de " + numero2 + " son: ");
        int sumadedivisores2 = 0;
        primerdivisor = true;

        for (int i = 1; i < numero2; i++){
            if (numero2 % i == 0) {
                if (!primerdivisor) {
                    System.out.print(", ");
                    
                }
                System.out.print(i);
                sumadedivisores2 += i;
                primerdivisor = false;
            }
        }
        
        System.out.println();
        System.out.println("La suma de los divisores propios de " + numero2 + " es: " + sumadedivisores2);
       
        System.out.println();
       if (sumadedivisores2 == numero1 && sumadedivisores1 == numero2) {
        System.out.print("El numero " + numero1 + " y el numero " + numero2 + " son amigos.");
        
       } else {
        System.out.print("El numero " + numero1 + " y el numero " + numero2 + " no son amigos.");
       }

       scanner.close();

        
    }
    
}
