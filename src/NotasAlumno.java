import java.util.Scanner;

public class NotasAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Introduce la nota #" + (i + 1) + " (0 - 10): ");
                notas[i] = scanner.nextDouble();
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Nota inválida. Debe estar entre 0 y 10.");
                }
            } while (notas[i] < 0 || notas[i] > 10);
        }

        System.out.print("\nNotas introducidas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        double suma = 0;
        double max = notas[0];
        double min = notas[0];

        for (double nota : notas) {
            suma += nota;
            if (nota > max) {
                max = nota;
            }
            if (nota < min) {
                min = nota;
            }
        }

        double media = suma / notas.length;


        System.out.println("Resultados:");
        System.out.println("Nota media: " + media);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);

        scanner.close();
    }
}
