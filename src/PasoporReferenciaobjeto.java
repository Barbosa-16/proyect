class Rectangulo {
    int ancho;
    int alto;

    Rectangulo (int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
    }

}
public class PasoporReferenciaobjeto {
    public static void modificarRectangulo (Rectangulo r) {
        r.ancho = 30;
        r.alto = 10;

        System.out.println("Dentro del metodo: ancho = " + r.ancho + ", alto = " + r.alto);
    
    }

    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(20, 5);
        System.out.println("Antes de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);

        modificarRectangulo(miRectangulo);
        System.out.println("Despues de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
    }
    
}
