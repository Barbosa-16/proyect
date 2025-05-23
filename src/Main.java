import java.util.Scanner;

class Personaje {
    String nombre;
    int fuerza;
    int inteligencia;
    int defensa;
    int vida;

    public Personaje(String nombre, int fuerza, int inteligencia, int defensa, int vida) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.defensa = defensa;
        this.vida = vida;
    }

    public void atributos() {
        System.out.println(nombre + ":");
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Defensa: " + defensa);
        System.out.println("Vida: " + vida);
    }

    public void subirNivel(int fuerza, int inteligencia, int defensa) {
        this.fuerza += fuerza;
        this.inteligencia += inteligencia;
        this.defensa += defensa;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void morir() {
        this.vida = 0;
        System.out.println(nombre + " ha muerto");
    }

    public int dano(Personaje enemigo) {
        // Asegura que el daño mínimo sea 0
        return Math.max(0, this.fuerza - enemigo.defensa);
    }

    public void atacar(Personaje enemigo) {
        int danoRealizado = this.dano(enemigo);
        enemigo.vida -= danoRealizado;
        System.out.println(this.nombre + " ha realizado " + danoRealizado + " puntos de daño a " + enemigo.nombre);
        if (enemigo.estaVivo()) {
            System.out.println("Vida de " + enemigo.nombre + " es " + enemigo.vida);
        } else {
            enemigo.morir();
        }
    }
}

class Guerrero extends Personaje {
    int espada;
    // El Scanner debe ser pasado o creado una sola vez en el Main para evitar problemas
    // con el cierre del recurso y múltiples instancias.

    public Guerrero(String nombre, int fuerza, int inteligencia, int defensa, int vida, int espada) {
        super(nombre, fuerza, inteligencia, defensa, vida);
        this.espada = espada;
    }

    public void cambiarArma(Scanner scanner) { // Se pasa el scanner como parámetro
        int opcion;
        do {
            System.out.println("Elige un arma: (1) Acero Valyrio, daño 8. (2) Matadragones, daño 10");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa un número válido.");
                scanner.next(); // Consume la entrada inválida
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea
        } while (opcion != 1 && opcion != 2);

        if (opcion == 1) {
            this.espada = 8;
        } else {
            this.espada = 10;
        }
        System.out.println(this.nombre + " ahora tiene la espada: " + (opcion == 1 ? "Acero Valyrio" : "Matadragones"));
    }

    @Override
    public void atributos() {
        super.atributos();
        System.out.println("Espada: " + espada);
    }

    @Override
    public int dano(Personaje enemigo) {
        // Multiplica la fuerza por el daño de la espada y resta la defensa del enemigo
        return Math.max(0, (this.fuerza + this.espada) - enemigo.defensa);
    }
}

class Mago extends Personaje {
    int libro;

    public Mago(String nombre, int fuerza, int inteligencia, int defensa, int vida, int libro) {
        super(nombre, fuerza, inteligencia, defensa, vida);
        this.libro = libro;
    }

    @Override
    public void atributos() {
        super.atributos();
        System.out.println("Libro: " + libro);
    }

    @Override
    public int dano(Personaje enemigo) {
        // Multiplica la inteligencia por el poder del libro y resta la defensa del enemigo
        return Math.max(0, (this.inteligencia + this.libro) - enemigo.defensa);
    }

    public void cambiarLibro(Scanner scanner) { // Se pasa el scanner como parámetro
        int opcion;
        do {
            System.out.println("Elige un libro: (1) Fuego, poder 5. (2) Rayo, poder 7");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa un número válido.");
                scanner.next(); // Consume la entrada inválida
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea
        } while (opcion != 1 && opcion != 2);

        if (opcion == 1) {
            this.libro = 5;
        } else {
            this.libro = 7;
        }
        System.out.println(this.nombre + " ahora tiene el libro: " + (opcion == 1 ? "Fuego" : "Rayo"));
    }
}

public class Main {
    public static void combateInteractivo(Personaje jugador1, Personaje jugador2, Scanner scanner) {
        int turno = 1;

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            System.out.println("\n--- Turno " + turno + " ---");

            // Turno del Jugador 1
            System.out.println(jugador1.nombre + ", elige una acción:");
            int opcion1;
            do {
                if (jugador1 instanceof Guerrero) {
                    System.out.println("1. Atacar\n2. Cambiar arma");
                } else if (jugador1 instanceof Mago) {
                    System.out.println("1. Atacar\n2. Cambiar libro de hechizos");
                } else {
                    System.out.println("1. Atacar");
                }
                while (!scanner.hasNextInt()) {
                    System.out.println("Ingresa un número válido.");
                    scanner.next();
                }
                opcion1 = scanner.nextInt();
                scanner.nextLine(); // Consume el salto de línea
            } while (opcion1 != 1 && (opcion1 != 2 || (!(jugador1 instanceof Guerrero) && !(jugador1 instanceof Mago))));

            if (jugador1 instanceof Guerrero && opcion1 == 2) {
                ((Guerrero) jugador1).cambiarArma(scanner);
            } else if (jugador1 instanceof Mago && opcion1 == 2) {
                ((Mago) jugador1).cambiarLibro(scanner);
            } else {
                jugador1.atacar(jugador2);
            }
            if (!jugador2.estaVivo()) break;

            // Turno del Jugador 2
            System.out.println(jugador2.nombre + ", elige una acción:");
            int opcion2;
            do {
                if (jugador2 instanceof Guerrero) {
                    System.out.println("1. Atacar\n2. Cambiar arma");
                } else if (jugador2 instanceof Mago) {
                    System.out.println("1. Atacar\n2. Cambiar libro de hechizos");
                } else {
                    System.out.println("1. Atacar");
                }
                while (!scanner.hasNextInt()) {
                    System.out.println("Ingresa un número válido.");
                    scanner.next();
                }
                opcion2 = scanner.nextInt();
                scanner.nextLine(); // Consume el salto de línea
            } while (opcion2 != 1 && (opcion2 != 2 || (!(jugador2 instanceof Guerrero) && !(jugador2 instanceof Mago))));

            if (jugador2 instanceof Guerrero && opcion2 == 2) {
                ((Guerrero) jugador2).cambiarArma(scanner);
            } else if (jugador2 instanceof Mago && opcion2 == 2) {
                ((Mago) jugador2).cambiarLibro(scanner);
            } else {
                jugador2.atacar(jugador1);
            }
            turno++;
        }

        if (jugador1.estaVivo()) {
            System.out.println("\nHa ganado " + jugador1.nombre + "!");
        } else if (jugador2.estaVivo()) {
            System.out.println("\nHa ganado " + jugador2.nombre + "!");
        } else {
            System.out.println("\nEmpate!");
        }
    }

    public static String pedirNombreValido(Scanner scanner) {
        String nombre;
        do {
            System.out.print("Nombre de tu personaje: ");
            nombre = scanner.nextLine().trim(); // Usa trim() para eliminar espacios en blanco al inicio/final
            if (!nombre.matches("[a-zA-Z]+")) {
                System.out.println("El nombre solo debe contener letras. Intenta de nuevo.");
            }
        } while (!nombre.matches("[a-zA-Z]+"));
        return nombre;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Selección del Jugador 1
        int eleccion1;
        do {
            System.out.println("Jugador 1, elige tu clase (1) Guerrero o (2) Mago:");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa un número válido.");
                scanner.next();
            }
            eleccion1 = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea
        } while (eleccion1 != 1 && eleccion1 != 2);

        String nombre1 = pedirNombreValido(scanner);

        int fuerza = 10, inteligencia = 10, defensa = 5, vida = 100;
        Personaje jugador1;
        if (eleccion1 == 1) {
            jugador1 = new Guerrero(nombre1, fuerza, inteligencia, defensa, vida, 2);
        } else {
            jugador1 = new Mago(nombre1, fuerza, inteligencia, defensa, vida, 2);
        }

        // Selección del Jugador 2
        int eleccion2;
        do {
            System.out.println("\nJugador 2, elige tu clase (1) Guerrero o (2) Mago:");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa un número válido.");
                scanner.next();
            }
            eleccion2 = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea
        } while (eleccion2 != 1 && eleccion2 != 2);

        String nombre2 = pedirNombreValido(scanner);

        Personaje jugador2;
        if (eleccion2 == 1) {
            jugador2 = new Guerrero(nombre2, fuerza, inteligencia, defensa, vida, 2);
        } else {
            jugador2 = new Mago(nombre2, fuerza, inteligencia, defensa, vida, 2);
        }

        jugador1.atributos();
        jugador2.atributos();

        System.out.println("\n--- ¡COMIENZA EL COMBATE! ---");
        combateInteractivo(jugador1, jugador2, scanner); // Pasa el scanner al método de combate

        scanner.close(); // Cierra el scanner al finalizar el programa
    }
}