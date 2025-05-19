public class PasoporReferenciaArray {
    public static void ModificarArray (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        System.out.println("Dentro del metodo: " + java.util.Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5};
        System.out.println("Antes de modificar: " + java.util.Arrays.toString(numeros));
        ModificarArray(numeros);
        System.out.println("Despues de modificar: " + java.util.Arrays.toString(numeros));
    }
}
