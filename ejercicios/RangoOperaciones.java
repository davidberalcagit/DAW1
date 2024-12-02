//Crea un programa que pida al usuario un numero en decimal, y segun que rango en el que se encuentre realice lo siguiente 
//Si el numero esta entre 1 y 5 realiza un exponente de ese numero cuya base sea 3.
//Si el numero esta entre 4 y 10 lo que hacemos es sumarle 0.75
//Si el numero esta entre 11 y 20, dime si es par o no 

import java.lang.Math;
import java.util.Scanner;

public class RangoOperaciones{
	public static void main(String[]args){
		Scanner teclado = new Scanner (System.in);

		 System.out.println("Introduce un numero decimal: ");
        String numeroString = teclado.nextLine();  
       
        Double numero = Double.valueOf(numeroString);
        Double resultado;
		if (numero >= 1 && numero <= 5){
			resultado = Math.pow(numero,3);
			System.out.println("El numero al cubo es: " + resultado);
		}else if (numero >= 6 && numero <= 10){
			resultado = numero + 0.75;
			System.out.println("El resultado sumandole 0.75 es" + resultado);
		}else if (numero >= 11 && numero <= 20) {
			if (numero % 2 == 0) {
				System.out.println("El numero es par");
			}else{
				System.out.println("El numero es impar");
			}
		}
	}
}