import java.util.Scanner;

public class PracticaArrays15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] equipos = new String[15][2];

        int[][] resultados = new int[15][2];

        for (int i = 0; i < 15; i++) {
            System.out.print("Introduce el nombre del equipo 1 para el partido " + (i + 1) + ": ");
            equipos[i][0] = scanner.nextLine();

            System.out.print("Introduce el nombre del equipo 2 para el partido " + (i + 1) + ": ");
            equipos[i][1] = scanner.nextLine();
        }

        for (int i = 0; i < 15; i++) {
            System.out.print("Introduce el número de goles de " + equipos[i][0] + " en el partido " + (i + 1) + ": ");
            resultados[i][0] = scanner.nextInt();

            System.out.print("Introduce el número de goles de " + equipos[i][1] + " en el partido " + (i + 1) + ": ");
            resultados[i][1] = scanner.nextInt();
            scanner.nextLine(); 
        }

    
        System.out.println("\nResultados de la Quiniela:");
        for (int i = 0; i < 15; i++) {
            String resultado = "";

            if (resultados[i][0] > resultados[i][1]) {
                resultado = equipos[i][0] + " gana";
            } else if (resultados[i][0] < resultados[i][1]) {
                resultado = equipos[i][1] + " gana";
            } else {
                resultado = "Empate";
            }

            System.out.println("Partido " + (i + 1) + ": " + equipos[i][0] + " " + resultados[i][0] + " - " +
                    resultados[i][1] + " " + equipos[i][1] + " -> " + resultado);
        }

        scanner.close();
    }
}
