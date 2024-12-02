/* Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deberia llamarse "MAYORDEDOS.java."

import java.io.*;

public class ese {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int numero1;
		int numero2;
		System.out.println("Introduce la edad de la primera persona: ");
		numero1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Introduce la edad de la segunda persona: ");
		numero2 = Integer.parseInt(bufEntrada.readLine());
		if (numero1>numero2) {
			System.out.println(numero1+" es mayor que "+numero2);
		} else {
			if (numero2>numero1) {
				System.out.println(numero2+" es mayor que "+numero1);
			} else {
				System.out.println("Los numeros son iguales");
			}
		}
	}


}

