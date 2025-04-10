import java.util.Scanner; // Aqui importe un scanner para leer los datos
public class NotasEstudiantes {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Lee la entrada del usuario.

    // Aqui le pido al usuario los estudiantes que va a ingresar.
    System.out.print("Ingrese la cantidad de estudiantes: "); 
    int cantidad = input.nextInt(); // lee la cantidad

    while (cantidad <= 0) { // si es menor o igual a 0, vuelve a pedir la cantidad de estudiantes
        System.out.println("La cantidad de estudiantes a registrar debe ser mayor a 0.");
        System.out.print("Ingrese la cantidad de estudiantes: ");
        cantidad = input.nextInt(); // vuelve a leer el valor
        }
    input.nextLine(); // Limpio el buffer.

    // Meti arrays y contantes.
    String [] identificaciones = new String[cantidad]; // Este va a ir guardando la identificacion de los estudiantes.
    String [] nombres = new String[cantidad]; // Aqui va a ir guardando los nombres
    double [][] notas = new double[cantidad][3]; // Una matriz para guardar las notas
    final int CANTIDAD_DE_NOTAS = 3; // Constante para la cantidad de notas por estudiante
    final double LIMITE_APROBACION = 3.0; // Constante de la nota con la que se aprueba

    for (int i = 0; i < cantidad; i++) { // En este for pide el nombre de cada estudiante
        System.out.print("Nombre del estudiante " + (i + 1) + ": "); // Pido el nombre de cada estudiante
        nombres [i] = input.nextLine(); // Se guardan los nombres

        System.out.print("Identificacion del estudiante " + (i + 1) + ": "); // Pido la identificacion
        identificaciones[i] = input.nextLine(); // Se guardan las identificaciones

        for (int j = 0; j < CANTIDAD_DE_NOTAS; j++) { // Con este for empiezo para ingresar las notas
            double nota; // Aqui se guarda cada nota temporalmente
            do {
                // Se va pidiendo cada nota por cada estudiante
                System.out.print("Nota " + (j + 1) + ": "); 
                if (input.hasNextDouble()) { //Pregunta si lo que el usuario escribio es un numero decimal
                    nota = input.nextDouble();
                } else {
                    System.out.println("Por favor, ingrese un número válido."); // Si puso letras, mostramos esto
                    input.next(); //Elimina el dato mal ingresado del buffer
                    nota = -1; // Se usa un valor invalido para que el ciclo se repita obligatoriamente.
                }

                // Una condicion para los limites de las notas, para que las ingresen en el rango correcto.
                if (nota < 0 || nota > 5) {
                    System.out.println("La nota digitada no es valida, debe estar entre 0 y 5.");
                    
                }
            } while (nota < 0 || nota > 5); // Se repite hasta que la nota sea valida

            notas [i][j] = nota; // Se guarda la nota en la posicion de la matriz
        }

        input.nextLine(); // Limpio el buffer
        System.out.println(); // Salto de linea
    }

    System.out.println("REPORTE: "); // Para mostrar el reporte
    
    for (int i = 0; i < cantidad; i++) { //Aqui se recorren los estudiantes
        double suma = 0; // variable para sumar las notas de cada uno

        for (int j = 0; j < CANTIDAD_DE_NOTAS; j++) { // Se recorre las notas de cada estudiante
            suma += notas [i][j]; // Se suma cada nota
        }

        double promedio = suma / CANTIDAD_DE_NOTAS; //Se calcula el promedio, la suma de las notas sobre la cantidad de notas

        System.out.print(nombres[i] + " (ID: " + identificaciones[i] + ") - Promedio: " + promedio + " - "); // se muestra nombre, identificacion y promedio
 
        // condicion para el promedio
        if (promedio >= LIMITE_APROBACION) { //si el promedio es mayor al limite...
            System.out.println("Aprobado."); // nos muestra que aprobo.
            
        } else { // de lo contrario...
            System.out.println("Reprobado."); //Nos muestra que reprobo
        }
    }
     
    input.close(); //Se cierra el scanner que abrimos al principio.
    }
}