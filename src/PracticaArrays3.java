import java.util.Scanner;
public class PracticaArrays3 {
    public static void main(String[] args) {
       double [] notas = new double[5];
       Scanner input = new Scanner(System.in); 

       System.out.println("Ingrese las notas. ");
       for (int i = 0; i < notas.length; i++) {
        double nota;
        do {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            nota = input.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota fuera de rango, ingresela de nuevo.");
                }
        } while (nota < 0 || nota > 10);
        notas [i] = nota;
       }

       double suma = 0;
       double notaMaxima = notas[0];
       double notaMinima = notas[0]; 

       for (int i = 0; i < notas.length; i++) {
        suma += notas[i];
        if (notas[i] > notaMaxima) {
            notaMaxima = notas[i];
        }
        if (notas[i] < notaMinima) {
            notaMinima = notas[i];
        }
    }

        double notaMedia = suma / notas.length;

        System.out.println("Notas introducidas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("La nota media es: " + notaMedia);
        System.out.println("La nota maxima es: " + notaMaxima);
        System.out.println("La nota minima es: " + notaMinima);

       input.close();

    }
}
