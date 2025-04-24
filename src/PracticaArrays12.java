public class PracticaArrays12 {
    public static void main(String[] args) {
        int[][] marco = new int[5][15]; 

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 15; columna++) {
                if (fila == 0 || fila == 4 || columna == 0 || columna == 14) {
                    marco[fila][columna] = 1; 
                } else {
                    marco[fila][columna] = 0; 
                }
            }
        }

        System.out.println("Contenido de la matriz marco:");
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 15; columna++) {
                System.out.print(marco[fila][columna] + " ");
            }
            System.out.println(); 
        }
    }
}
