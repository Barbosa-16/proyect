public class PasoporValorDevolverNum {
    public static int incrementar (int x) {
        x += 1;
        System.out.println("Dentro del metodo: x = " + x);
        return x;
    }

    public static void main(String[] args) {
        int x = 7;
        System.out.println("Antes de llamar el metodo: x = " + x);

        x = incrementar(x);
        System.out.println("Despues de llamar el metodo: x = " + x);
    }

}