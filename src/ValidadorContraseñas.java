import java.util.Scanner;

public class ValidadorContraseñas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== VALIDADOR DE CONTRASEÑAS ===");
        System.out.println("La contraseña debe cumplir con los siguientes criterios:");
        System.out.println("- Tener al menos 8 caracteres");
        System.out.println("- Contener al menos una letra mayúscula");
        System.out.println("- Contener al menos una letra minúscula");
        System.out.println("- Contener al menos un número");
        System.out.println("- Contener al menos un carácter especial (@, #, $, %, &, *)");

        System.out.print("\nIngrese una contraseña: ");
        String contraseña = input.nextLine();

        boolean longitudValida = contraseña.length() >= 8;
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;

   
        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);

           
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }

        
            if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            }

      
            if (Character.isDigit(c)) {
                tieneNumero = true;
            }

            if (c == '@' || c == '#' || c == '$' || c == '%' || c == '&' || c == '*') {
                tieneCaracterEspecial = true;
            }
        }


        boolean contraseñaValida = longitudValida && tieneMayuscula && tieneMinuscula &&
                tieneNumero && tieneCaracterEspecial;

   
        System.out.println("\nResultado de la validación:");

        if (contraseñaValida) {
            System.out.println("✓ La contraseña es válida. Cumple con todos los criterios de seguridad.");
        } else {
            System.out.println("✗ La contraseña no es válida. No cumple con los siguientes criterios:");

            if (!longitudValida) {
                System.out.println("  ✗ Debe tener al menos 8 caracteres");
            }

            if (!tieneMayuscula) {
                System.out.println("  ✗ Debe contener al menos una letra mayúscula");
            }

            if (!tieneMinuscula) {
                System.out.println("  ✗ Debe contener al menos una letra minúscula");
            }

            if (!tieneNumero) {
                System.out.println("  ✗ Debe contener al menos un número");
            }

            if (!tieneCaracterEspecial) {
                System.out.println("  ✗ Debe contener al menos un carácter especial (@, #, $, %, &, *)");
            }
        }

        input.close();
    }
}
