import java.util.Scanner;

public class CalculadoraNumerosPerfectos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número para verificar si es perfecto: ");
        int num = input.nextInt();

     
        boolean esPerfecto = false;
        if (num > 1) {
            int sumaDivisores = 1;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
        
                    sumaDivisores += i;

                
                    if (i != num / i) {
                        sumaDivisores += num / i;
                    }
                }
            }

       
            esPerfecto = (sumaDivisores == num);
        }

        if (esPerfecto) {
            System.out.println(num + " es un número perfecto.");
            System.out.println("Divisores propios: ");

     
            System.out.print("1"); 
            int suma = 1;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.print(" + " + i);
                    suma += i;
                }
            }

            System.out.println(" = " + suma);
        } else {
            System.out.println(num + " no es un número perfecto.");
        }

        
        System.out.print("\nIngrese el inicio del rango: ");
        int inicio = input.nextInt();

        System.out.print("Ingrese el fin del rango: ");
        int fin = input.nextInt();

    
        if (inicio > fin) {
            System.out.println("Error: El inicio del rango debe ser menor o igual al fin.");
            input.close();
            return;
        }

        
        System.out.println("Números perfectos encontrados en el rango [" + inicio + ", " + fin + "]: ");
        boolean encontrado = false;

        for (int i = inicio; i <= fin; i++) {
         
            boolean iPerfecto = false;
            if (i > 1) {
                int sumaDivisoresI = 1;


                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
  
                        sumaDivisoresI += j;

                        if (j != i / j) {
                            sumaDivisoresI += i / j;
                        }
                    }
                }

           
                iPerfecto = (sumaDivisoresI == i);
            }

            if (iPerfecto) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron números perfectos en el rango especificado.");
        } else {
            System.out.println(); 
        }

        input.close();
    }
}
