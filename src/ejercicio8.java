import java.util.Scanner;
public class ejercicio8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de preguntas: ");
        int CantidadDePreguntas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de respuestas correctas: ");
        int RespuestasCorrectas = scanner.nextInt();

        if (CantidadDePreguntas <= 0 || RespuestasCorrectas < 0 || RespuestasCorrectas > CantidadDePreguntas) {
            System.out.print("No es valido.");
            scanner.close();
            return;
            
        } 

        double porcentaje = (double) RespuestasCorrectas / CantidadDePreguntas * 100;

        if (porcentaje >= 90) {
            System.out.println("Nivel Maximo.");
        } else if (porcentaje>=75) {
            System.out.println("Nivel Medio.");
            
        } else if (porcentaje >= 50) {
            System.out.println("Nivel Regular.");
        } else if (porcentaje < 50) {
            System.out.println("Fuera de nivel");
        

        scanner.close();
    }
    
    }
}
