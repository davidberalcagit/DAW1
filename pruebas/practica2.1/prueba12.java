import java.util.Scanner;

public class prueba12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean continuar=true;
		int veces;
		int opcion;

		for (int i=0;i<5;) {
		while(continuar==true)i++;{
		System.out.println("Escribe 23:");
		opcion=teclado.nextInt();
		System.out.println("Escibe cuantas veces quieres que se imprima: ");
		veces= teclado.nextInt();

		switch (opcion) {
		case 23:
			System.out.println("El numero introducido es 23");
			 continuar=false;
			 break;
		default:
			System.out.println("Por favor escribe 23\n");
			
				}	
			}
		}
	}
}