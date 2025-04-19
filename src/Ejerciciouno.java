public class Ejerciciouno {
    public static void main(String[] args) {
        int[] vector_numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Ya le ponemos números del 1 al 10

        System.out.println("Número | Cuadrado | Cubo");
        for (int i = 0; i < vector_numeros.length; i++) {
            int numero = vector_numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.println("   " + numero + "    |    " + cuadrado + "     |   " + cubo);
        }
    }
}
