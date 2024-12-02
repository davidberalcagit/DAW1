/*
Nombre del archivo Supuesto1_2.java
Autor: David Bernal
Fecha: 30-10-2024
Resumen del programa: El programa pide el precio por unidad de producto y la 
cantidad de unidades. El programa calcula el precio total y el precio tatal con IVA.
*/
import java.util.Scanner;
import java.lang.Math;

public class Supuesto1_2{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Aqui se pide la usuario el precio por unidad
		System.out.println("Escribe el precio por unidad(debe ser positivo): ");
		double precio_unidad = teclado.nextInt(); 
		//Si el precio por unidad es igual o menor que 0 te saldra un mensaje pidiendo un numero positivo
		if(precio_unidad <=0){
		System.out.println("El precio no puede ser negativo u igual a 0, por favor vuelve a interntarlo con un numero positivo mayor a 0");
		}else if (precio_unidad >=0){
		System.out.println("Escribe la cantidad de unidades: ");
		int cantidad = teclado.nextInt();

		double iva = 0.21;

		double precio_total = (cantidad * Double.valueOf(precio_unidad));

		double precio_IVA = (iva + precio_total);

		System.out.println("\n-----Resultados-----");
		System.out.println(precio_total);
		System.out.println(precio_IVA);
	}
	}
}