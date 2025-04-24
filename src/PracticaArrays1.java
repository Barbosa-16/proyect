import java.util.Random;
public class PracticaArrays1 {
    public static void main(String[] args) {
        int [] vector_numero = new int[10];
        Random aleatorio = new Random();

        for (int i = 0; i < vector_numero.length; i++){
            vector_numero[i] = aleatorio.nextInt(10) + 1;
        }

        System.out.println("Numero  | Cuadrado | Cubo");

        for (int i = 0; i < vector_numero.length; i++) {
            int numero = vector_numero[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.println("   " + numero + "    |    " + cuadrado + "     |    " + cubo);
        }
    }
}
