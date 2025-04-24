import java.util.Scanner;

public class PracticaArrays10 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5]; 
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce los valores para la matriz 5x5:");
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print("Elemento [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = input.nextInt();
            }
        }

        System.out.println("Suma de cada fila:");
        for (int fila = 0; fila < 5; fila++) {
            int sumaFila = 0;
            for (int columna = 0; columna < 5; columna++) {
                sumaFila += matriz[fila][columna];
            }
            System.out.println("Fila " + fila + ": " + sumaFila);
        }

        System.out.println("Suma de cada columna:");
        for (int columna = 0; columna < 5; columna++) {
            int sumaColumna = 0;
            for (int fila = 0; fila < 5; fila++) {
                sumaColumna += matriz[fila][columna];
            }
            System.out.println("Columna " + columna + ": " + sumaColumna);
        }

        input.close();
    }
}
