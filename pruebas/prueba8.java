import java.util.Scanner;
import java.lang.Math;

public class prueba8{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese precio por unidad: ");
		String precio = teclado.nextLine();
		
		System.out.println("Ingrese la cantidad: ");
		int cantidad = teclado.nextInt();

		double precioTotal = cantidad + Double.valueOf(precio);

		double iva = 0.21;
		double totalIVA = precioTotal *(1 + iva);
		System.out.println(totalIVA);
		}
}