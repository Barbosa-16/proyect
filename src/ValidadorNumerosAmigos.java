import java.util.Scanner;

public class ValidadorNumerosAmigos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el inicio del rango: ");
        int inicio = input.nextInt();

        System.out.print("Ingrese el fin del rango: ");
        int fin = input.nextInt();

        if (inicio > fin) {
            System.out.println("El rango no es válido. El inicio debe ser menor o igual que el fin.");
            input.close();
            return;
        }


        System.out.println("\nNúmeros amigos en el rango [" + inicio + ", " + fin + "]:");
        boolean encontrado = false;

        for (int numero = Math.max(2, inicio); numero <= fin; numero++) {
        
            int contadorDivisores = 0;
            int primerDivisor = 0;
            int segundoDivisor = 0;

            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    contadorDivisores++;
                    if (contadorDivisores == 1) {
                        primerDivisor = i;
                    } else if (contadorDivisores == 2) {
                        segundoDivisor = i;
                    } else {
                    
                        break;
                    }
                }
            }

          
            if (contadorDivisores == 2) {
                encontrado = true;
                System.out.println(
                        numero + " es un número amigo con divisores: " + primerDivisor + ", " + segundoDivisor);
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron números amigos en el rango especificado.");
        }

        input.close();
    }
}
