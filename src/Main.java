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
        return this.fuerza - enemigo.defensa;
    }

    public void atacar(Personaje enemigo) {
        int dano = this.dano(enemigo);
        if (dano < 0) dano = 0;
        enemigo.vida -= dano;
        System.out.println(this.nombre + " ha realizado " + dano + " puntos de daño a " + enemigo.nombre);
        if (enemigo.estaVivo()) {
            System.out.println("Vida de " + enemigo.nombre + " es " + enemigo.vida);
        } else {
            enemigo.morir();
        }
    }
}

class Guerrero extends Personaje {
    int espada;
    Scanner scanner = new Scanner(System.in);

    public Guerrero(String nombre, int fuerza, int inteligencia, int defensa, int vida, int espada) {
        super(nombre, fuerza, inteligencia, defensa, vida);
        this.espada = espada;
    }

    public void cambiarArma() {
        int opcion;
        do {
            System.out.println("Elige un arma: (1) Acero Valyrio, da\u00f1o 8. (2) Matadragones, da\u00f1o 10");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa un numero valido.");
                scanner.next();
            }
            opcion = scanner.nextInt();
        } while (opcion != 1 && opcion != 2);

        if (opcion == 1) {
            this.espada = 8;
        } else {
            this.espada = 10;
        }
    }

    @Override
    public void atributos() {
        super.atributos();
        System.out.println("Espada: " + espada);
    }

    @Override
    public int dano(Personaje enemigo) {
        return this.fuerza * this.espada - enemigo.defensa;
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
        System.out.println("\u00b7Libro: " + libro);
    }

    @Override
    public int dano(Personaje enemigo) {
        return this.inteligencia * this.libro - enemigo.defensa;
    }

    public void cambiarLibro() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elige un libro: (1) Fuego, poder 5. (2) Rayo, poder 7");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa un n\u00famero v\u00e1lido.");
                scanner.next();
            }
            opcion = scanner.nextInt();
        } while (opcion != 1 && opcion != 2);

        if (opcion == 1) {
            this.libro = 5;
        } else {
            this.libro = 7;
        }
        
    }
}

public class Main {
    public static void combateInteractivo(Personaje jugador1, Personaje jugador2) {
        Scanner scanner = new Scanner(System.in);
        int turno = 1;

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            System.out.println("\n--- Turno " + turno + " ---");

            System.out.println(jugador1.nombre + ", elige una acci\u00f3n:");
            int opcion;
            do {
                if (jugador1 instanceof Guerrero) {
                    System.out.println("1. Atacar\n2. Cambiar arma");
                } else if (jugador1 instanceof Mago) {
                    System.out.println("1. Atacar\n2. Cambiar libro de hechizos");
                } else {
                    System.out.println("1. Atacar");
                }
                while (!scanner.hasNextInt()) {
                    System.out.println("Ingresa un n\u00famero v\u00e1lido.");
                    scanner.next();
                }
                opcion = scanner.nextInt();
            } while (opcion != 1 && opcion != 2);

            if (jugador1 instanceof Guerrero && opcion == 2) {
                ((Guerrero) jugador1).cambiarArma();
            } else if (jugador1 instanceof Mago && opcion == 2) {
                ((Mago) jugador1).cambiarLibro();
            }
            jugador1.atacar(jugador2);
            if (!jugador2.estaVivo()) break;

            System.out.println(jugador2.nombre + ", elige una acci\u00f3n:");
            do {
                if (jugador2 instanceof Guerrero) {
                    System.out.println("1. Atacar\n2. Cambiar arma");
                } else if (jugador2 instanceof Mago) {
                    System.out.println("1. Atacar\n2. Cambiar libro de hechizos");
                } else {
                    System.out.println("1. Atacar");
                }
                while (!scanner.hasNextInt()) {
                    System.out.println("Ingresa un n\u00famero v\u00e1lido.");
                    scanner.next();
                }
                opcion = scanner.nextInt();
            } while (opcion != 1 && opcion != 2);

            if (jugador2 instanceof Guerrero && opcion == 2) {
                ((Guerrero) jugador2).cambiarArma();
            } else if (jugador2 instanceof Mago && opcion == 2) {
                ((Mago) jugador2).cambiarLibro();
            }
            jugador2.atacar(jugador1);
            turno++;
        }

        if (jugador1.estaVivo()) {
            System.out.println("\nHa ganado " + jugador1.nombre);
        } else if (jugador2.estaVivo()) {
            System.out.println("\nHa ganado " + jugador2.nombre);
        } else {
            System.out.println("\nEmpate");
        } 
    }

    public static String pedirNombreValido(Scanner scanner) {
        String nombre;
        do {
            System.out.print("Nombre de tu personaje: ");
            nombre = scanner.nextLine();
            if (!nombre.matches("[a-zA-Z]+")) {
                System.out.println("El nombre solo debe contener letras. Intenta de nuevo.");
            }
        } while (!nombre.matches("[a-zA-Z]+"));
        return nombre;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eleccion1;
        do {
            System.out.println("Jugador 1, elige tu clase (1) Guerrero o (2) Mago:");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa un numero valido.");
                scanner.next();
            }
            eleccion1 = scanner.nextInt();
        } while (eleccion1 != 1 && eleccion1 != 2);

        scanner.nextLine();
        String nombre1 = pedirNombreValido(scanner);

        int fuerza = 10, inteligencia = 10, defensa = 5, vida = 100;
        Personaje jugador1;
        if (eleccion1 == 1) {
            jugador1 = new Guerrero(nombre1, fuerza, inteligencia, defensa, vida, 2);
        } else {
            jugador1 = new Mago(nombre1, fuerza, inteligencia, defensa, vida, 2);
        }

        int eleccion2;
        do {
            System.out.println("\nJugador 2, elige tu clase (1) Guerrero o (2) Mago:");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa un numero valido.");
                scanner.next();
            }
            eleccion2 = scanner.nextInt();
        } while (eleccion2 != 1 && eleccion2 != 2);

        scanner.nextLine();
        String nombre2 = pedirNombreValido(scanner);

        Personaje jugador2;
        if (eleccion2 == 1) {
            jugador2 = new Guerrero(nombre2, fuerza, inteligencia, defensa, vida, 2);
        } else {
            jugador2 = new Mago(nombre2, fuerza, inteligencia, defensa, vida, 2);
        }

        jugador1.atributos();
        jugador2.atributos();

        System.out.println("\n--- COMBATE ---");
        combateInteractivo(jugador1, jugador2);
    }
}