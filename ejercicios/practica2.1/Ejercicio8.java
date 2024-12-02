//Un programa que con un numero que escribe el usuario se hace la tabla de multipicar
//David Bernal Alcazar 12-11-2024
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");

        int num = teclado.nextInt();
        System.out.println("\nTabla del " + num + "=" );
        for (int i=1;i<=10;i++) { //Se va ejecutando hasta que llega al 10
            System.out.println(num + "x" + i + "=" + (num*i));
        }
         teclado.close();

    }
}
