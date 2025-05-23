import java.util.Scanner;
public class EjerciciosPractica1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] numeros = new int[10];
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;


        System.out.println("Escriba 10 numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > 0) {
              positivos++;
                
            } else if (numeros[i] < 0) {
                negativos ++; 
            } else {
                ceros ++;
            }
        }

        System.out.println("Numeros porsitivos: " + positivos);
        System.out.println("Numeros negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);

        input.close();
    }
}
