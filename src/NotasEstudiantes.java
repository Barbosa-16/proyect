import java.util.Scanner;
public class NotasEstudiantes {
 public static void main(String[] args) {
    
    System.out.print("Ingrese la cantidad de estudiantes: ");
    Scanner input = new Scanner(System.in);
    int cantidad = input.nextInt();
    input.nextLine();

    String [] identificaciones = new String[cantidad];
    String [] nombres = new String[cantidad];
    double [][] notas = new double[cantidad][3];
    final int CANTIDAD_DE_NOTAS = 3;
    final double LIMITE_APROBACION = 3.0;

    for (int i = 0; i < cantidad; i++) {
        System.out.print("Nombre del estudiante " + (i + 1) + ": ");
        nombres [i] = input.nextLine();

        System.out.print("Identificacion del estudiante " + (i + 1) + ": ");
        identificaciones[i] = input.nextLine();

        for (int j = 0; j < CANTIDAD_DE_NOTAS; j++) {
            double nota;
            do {
                System.out.print("Nota " + (j + 1) + ": ");
                nota = input.nextDouble();

                if (nota < 0 || nota > 5) {
                    System.out.println("La nota digitada no es valida, debe estar entre 0 y 5.");
                    
                }
            } while (nota < 0 || nota > 5);

            notas [i][j] = nota;
        }

        input.nextLine();
        System.out.println();
    }

    System.out.println("REPORTE: ");
    
    for (int i = 0; i < cantidad; i++) {
        double suma = 0;

        for (int j = 0; j < CANTIDAD_DE_NOTAS; j++) {
            suma += notas [i][j];
        }

        double promedio = suma / CANTIDAD_DE_NOTAS;

        System.out.print(nombres[i] + " (ID: " + identificaciones[i] + ") - Promedio: " + promedio + " - ");

        if (promedio >= LIMITE_APROBACION) {
            System.out.println("Aprobado.");
            
        } else {
            System.out.println("Reprobado.");
        }
    }
     
    input.close();

   }
}
