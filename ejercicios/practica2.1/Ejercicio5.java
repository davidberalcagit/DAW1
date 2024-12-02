//Un menu que muestra al usuario el numero que a seleccionado
//David Bernal Alcazar 12-11-2024
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Declaración de variables 
        String opcion;
            // Mostrar el menú de opciones
            System.out.println("------------ Menú ---------------");
            System.out.println("Opción 1");
            System.out.println("Opción 2");
            System.out.println("Opción 3");
            System.out.println("Opción 4");
            System.out.println("Opción 5");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextLine();
            System.out.println("Elige una opción");
            switch (opcion) {
                case "1":
                    System.out.println("Has seleccionado la opción 1");
                    break;
                case "2":
                    System.out.println("Has seleccionado la opción 2");
                    break;
                case "3":
                    System.out.println("Has seleccionado la opción 3");
                    break;
                case "4":
                    System.out.println("Has seleccionado la opción 4");
                    break;
                case "5":
                    System.out.println("Has seleccionado la opción 5");
                    break;
                default: //Si se introduce una opcion que no esta definida saldra esto
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

        teclado.close();
    }
}