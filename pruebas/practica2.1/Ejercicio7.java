import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una palabra(Java): ");

        String opcion = teclado.nextLine();

        if(opcion.trim().equalsIgnoreCase("Java")){ //trim recorta los espacios en blanco del final y del principio del texto
            System.out.println("La palabra introduccida es Java");
        } else{
            System.out.println("La palabra introduccida no es Java");
        }
        teclado.close();

    }
}
