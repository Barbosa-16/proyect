import java.util.Scanner;
public class menuoperaciones {
public static void main(String[]args) {
    Scanner scanner =  new Scanner(System.in);
    int opcion;
    do {
    System.out.println("Selecciona una opcion: ");
    System.out.println("1. Para sumar.");
    System.out.println("2. Para restar.");
    System.out.println("3. Para multiplicar.");
    System.out.println("4. Para dividir.");
    opcion = scanner.nextInt();
    if (opcion < 1 || opcion > 4) {
        System.out.println("Opción no válida, por favor ingrese una opción entre 1 y 4.");
    }
}while (opcion < 1 || opcion > 4);

    System.out.println("Ingrese dos numeros");
    int numero1 = scanner.nextInt();
    int numero2 = scanner.nextInt();

    switch (opcion) {
        case 1:
            int suma = numero1 + numero2;
            System.out.println("La suma es de: " + suma);
            break;

        case 2:
            int resta = numero1 - numero2;
            System.out.println("La resta es de: " + resta);
            break;

        case 3:
            int multiplicacion = numero1 * numero2;
            System.out.println("La multiplicacion es de: " + multiplicacion);
            break;

        case 4:
            
        if (numero2 != 0) {
            
            System.out.println("La division es de: " + numero1 / numero2);
         } else {
            System.out.println("No se puede dividir por cero.");
         }
            break;


    
        default:
            System.out.println("No valido");
            break;
    }

    scanner.close();
}
    
}
