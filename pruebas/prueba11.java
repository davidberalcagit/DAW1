import java.util.Scanner;

public class prueba10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean continuar=true;

		for (int i=0;i<5;i++ ) {
		do{
		System.out.println("Escribe 23:");
		int opcion=teclado.nextInt();
		switch (opcion) {
		case 23:
			System.out.println("El numero introducido es 23");
			 continuar=false;
			 
			
		default:
			System.out.println("Por favor escribe 23\n");
			
			}	
			}while(continuar==true);
		}
	}
}