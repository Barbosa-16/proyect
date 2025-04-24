import java.util.Scanner;

public class PracticaArrays14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] precios = new double[5];
        
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Introduce el precio del artículo " + (i + 1) + ": ");
            precios[i] = input.nextDouble();
        }

        int[][] cantidadesVendidas = new int[5][4];

        for (int i = 0; i < cantidadesVendidas.length; i++) {
            for (int j = 0; j < cantidadesVendidas[i].length; j++) {
                System.out.print("Introduce la cantidad del artículo " + (i + 1) + " vendida en la sucursal " + (j + 1) + ": ");
                cantidadesVendidas[i][j] = input.nextInt();
            }
        }

        int[] cantidadesTotales = new int[5]; 
        for (int i = 0; i < cantidadesVendidas.length; i++) {
            int total = 0;
            for (int j = 0; j < cantidadesVendidas[i].length; j++) {
                total += cantidadesVendidas[i][j];
            }
            cantidadesTotales[i] = total;
        }

        System.out.println("\nCantidades totales de cada artículo:");
        for (int i = 0; i < cantidadesTotales.length; i++) {
            System.out.println("Artículo " + (i + 1) + ": " + cantidadesTotales[i] + " unidades");
        }

        int cantidadSucursal2 = 0;
        for (int i = 0; i < cantidadesVendidas.length; i++) {
            cantidadSucursal2 += cantidadesVendidas[i][1]; 
        }
        System.out.println("\nCantidad total de artículos vendidos en la sucursal 2: " + cantidadSucursal2);

    
        int cantidadArticulo3Sucursal1 = cantidadesVendidas[2][0]; 
        System.out.println("\nCantidad del artículo 3 vendida en la sucursal 1: " + cantidadArticulo3Sucursal1);

        double[] recaudacionSucursal = new double[4];
        for (int i = 0; i < cantidadesVendidas.length; i++) {
            for (int j = 0; j < cantidadesVendidas[i].length; j++) {
                recaudacionSucursal[j] += cantidadesVendidas[i][j] * precios[i];
            }
        }

        System.out.println("\nRecaudación total de cada sucursal:");
        for (int i = 0; i < recaudacionSucursal.length; i++) {
            System.out.println("Sucursal " + (i + 1) + ": " + recaudacionSucursal[i] + " unidades monetarias");
        }

        double recaudacionTotalEmpresa = 0;
        for (double recaudacion : recaudacionSucursal) {
            recaudacionTotalEmpresa += recaudacion;
        }
        System.out.println("\nRecaudación total de la empresa: " + recaudacionTotalEmpresa + " unidades monetarias");

        int sucursalMayorRecaudacion = 0;
        for (int i = 1; i < recaudacionSucursal.length; i++) {
            if (recaudacionSucursal[i] > recaudacionSucursal[sucursalMayorRecaudacion]) {
                sucursalMayorRecaudacion = i;
            }
        }
        System.out.println("\nSucursal de mayor recaudación: Sucursal " + (sucursalMayorRecaudacion + 1));

        input.close();
    }
}
