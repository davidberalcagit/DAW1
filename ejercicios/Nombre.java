import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre1, nombre2;
        int edad1, edad2;

        System.out.println("Introduce el nombre de la primera persona: ");
        nombre1 = teclado.nextLine();

        System.out.println("Introduce la edad de la primera persona: ");
        edad1 = teclado.nextInt();

        System.out.println("Edad de la primera persona: " + edad1);
        System.out.println("Nombre de la primera persona: " + nombre1);

        teclado.nextLine();

        System.out.println("Introduce el nombre de la segunda persona: ");
        nombre2 = teclado.nextLine();

        System.out.println("Introduce la edad de la segunda persona: ");
        edad2 = teclado.nextInt();

        System.out.println("Edad de la segunda persona: " + edad2);
        System.out.println("Nombre de la segunda persona: " + nombre2);
        
    }
}
