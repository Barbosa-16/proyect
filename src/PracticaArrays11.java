public class PracticaArrays11 {
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5]; 

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                if (fila == columna) {
                    diagonal[fila][columna] = 1; 
                } else {
                    diagonal[fila][columna] = 0;
                }
            }
        }

        System.out.println("Contenido de la matriz:");
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(diagonal[fila][columna] + " ");
            }
            System.out.println(); 
        }
    }
}
