import java.util.Scanner;

public class AnálisisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mayor = Integer.MIN_VALUE;  // El menor valor posible, para empezar con cualquier número.
        int suma = 0;
        int contador = 0;
        String continuar;

        // Ingresar números y calcular el mayor
        do {
            System.out.print("Introduce un número entero positivo: ");
            int numero = scanner.nextInt();

            // Verificar que el número es positivo
            if (numero > 0) {
                // Comparar el número con el mayor
                if (numero > mayor) {
                    mayor = numero;
                }
                
                // Acumular la suma y aumentar el contador
                suma += numero;
                contador++;

                // Preguntar si desea continuar
                System.out.print("¿Quieres seguir introduciendo números? (S para continuar): ");
                continuar = scanner.next();
            } else {
                // Si el número es cero o negativo, terminamos la lectura
                continuar = "N";
            }

        } while (continuar.equalsIgnoreCase("S"));

        // Mostrar el mayor número ingresado
        System.out.println("El mayor número ingresado es: " + mayor);

        // Mostrar la suma y la media
        if (contador > 0) {
            System.out.println("La suma de los números ingresados es: " + suma);
            System.out.println("La media de los números ingresados es: " + (double)suma / contador);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }

        scanner.close();
    }
}
