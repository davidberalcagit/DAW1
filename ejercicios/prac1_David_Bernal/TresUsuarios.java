import java.util.Scanner;

public class TresUsuarios{
	public static void main (String[]args){
	Scanner teclado = new Scanner(System.in);
	String nombre1, nombre2, nombre3;
	String apellido1, apellido2, apellido3 ;
	String nif1, nif2, nif3;
	Integer CP, CP2, CP3 ;

	System.out.println("Introduce los nombres de usuario: ");
	nombre1 = teclado.nextLine();
	nombre2 = teclado.nextLine();
	nombre3 = teclado.nextLine();
	
	System.out.println("Introduce los apellidos de los usuarios: ");
	apellido1 = teclado.nextLine();
	apellido2 = teclado.nextLine();
	apellido3 = teclado.nextLine();

	System.out.println("Nombre de usuario 3 " + nombre3 + " Apellido de usuario 3 " + apellido3);
	}

}
