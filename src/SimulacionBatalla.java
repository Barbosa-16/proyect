import java.util.Scanner;

// Clase base: Personaje
class Personaje {
    String nombre;
    int fuerza;
    int velocidad;
    int resistencia;

    // Constructor para inicializar el personaje
    public Personaje(String nombre, int fuerza, int velocidad, int resistencia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
    }

    // Método para atacar a otro personaje
    public void atacar(Personaje oponente) {
        System.out.println(nombre + " ataca a " + oponente.nombre + " con una fuerza de " + fuerza + " puntos.");
        oponente.resistencia -= fuerza;
        if (oponente.resistencia < 0) oponente.resistencia = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
    }

    // Método para mostrar estadísticas del personaje
    public void mostrarEstadisticas() {
        System.out.println("\\n--- Estadísticas de " + nombre + " ---");
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("-----------------------------------\\n");
    }

    // Método para recuperarse y aumentar la resistencia
    public void recuperarse() {
        resistencia += 20;
        System.out.println(nombre + " se ha recuperado y ahora tiene " + resistencia + " puntos de resistencia.");
    }
}

// Clase derivada: SuperHeroe
class SuperHeroe extends Personaje {
    // Constructor
    public SuperHeroe(String nombre, int fuerza, int velocidad, int resistencia) {
        super(nombre, fuerza, velocidad, resistencia);
    }

    // Método sobrecargado para un ataque especial
    public void ataqueEspecial(Personaje oponente) {
        int poderExtra = velocidad * 2; // El ataque especial depende de la velocidad
        System.out.println(nombre + " realiza un ataque especial a " + oponente.nombre + " con " + poderExtra + " puntos de daño.");
        oponente.resistencia -= poderExtra;
        if (oponente.resistencia < 0) oponente.resistencia = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
    }
}

// Clase derivada: Villano
class Villano extends Personaje {
    // Constructor
    public Villano(String nombre, int fuerza, int velocidad, int resistencia) {
        super(nombre, fuerza, velocidad, resistencia);
    }

    // Método para hacer trampa y duplicar su ataque
    public void hacerTrampa(Personaje oponente) {
        int dobleAtaque = fuerza * 2;
        System.out.println(nombre + " hace trampa y ataca con el doble de fuerza: " + dobleAtaque + " puntos de daño.");
        oponente.resistencia -= dobleAtaque;
        if (oponente.resistencia < 0) oponente.resistencia = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
    }
}

// Clase principal: Simulación de Batalla
public class SimulacionBatalla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear superhéroe y villano
        SuperHeroe heroe = new SuperHeroe("Capitán Relámpago", 30, 20, 100);
        Villano villano = new Villano("Doctor Sombra", 35, 15, 120);

        // Mostrar estadísticas iniciales
        heroe.mostrarEstadisticas();
        villano.mostrarEstadisticas();

        // Interacción del usuario
        int opcion;
        do {
            System.out.println("Elige una acción:");
            System.out.println("1. El héroe ataca al villano");
            System.out.println("2. El héroe usa su ataque especial");
            System.out.println("3. El villano ataca al héroe");
            System.out.println("4. El villano hace trampa");
            System.out.println("5. El héroe se recupera");
            System.out.println("6. El villano se recupera");
            System.out.println("7. Mostrar estadísticas");
            System.out.println("8. Terminar batalla");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    heroe.atacar(villano);
                    break;
                case 2:
                    heroe.ataqueEspecial(villano);
                    break;
                case 3:
                    villano.atacar(heroe);
                    break;
                case 4:
                    villano.hacerTrampa(heroe);
                    break;
                case 5:
                    heroe.recuperarse();
                    break;
                case 6:
                    villano.recuperarse();
                    break;
                case 7:
                    heroe.mostrarEstadisticas();
                    villano.mostrarEstadisticas();
                    break;
                case 8:
                    System.out.println("La batalla ha terminado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            // Si la resistencia de alguno llega a 0, la batalla termina
            if (heroe.resistencia == 0) {
                System.out.println(heroe.nombre + " ha sido derrotado. ¡El villano gana!");
                break;
            } else if (villano.resistencia == 0) {
                System.out.println(villano.nombre + " ha sido derrotado. ¡El héroe gana!");
                break;
            }

        } while (opcion != 8);

        scanner.close();
    }
}
