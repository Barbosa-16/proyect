public class PasoporValor {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Antes de llamar a intercambiar: a = " + a + ", b = " + b);

        intercambiar (a,b);

        System.out.println("Despues de llamar a intercambiar: a = " + a + ", b = " + b);

    }

    public static void intercambiar (int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Dentro del metodo intercambiar: a = " + a + ", b = " + b);
    }
}
