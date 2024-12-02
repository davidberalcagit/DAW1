/*
El programa saca un calculo de el salario de los trabajadores que cobran 15€ por hora, se considera horas extras por encima de 35 horas,
y se pagaran a 22€.
DavidBernal 29-11-2024
*/



import java.util.Scanner;
public class ejer1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean continuar= true;
		int horas=0;

		while (continuar) { //Pedir hasta que continuar sea falso
			System.out.println("¿Cuantas horas has trabajado?");
			horas=teclado.nextInt();
			teclado.nextLine();
			double salario = calcularsalario(horas);
			//Escribir salarios
			System.out.println("\nEl salario es " + salario);

			System.out.println("¿Quieres introducir más horas de otro trabajador? si/no");
			continuar=teclado.nextLine().equalsIgnoreCase("si");

		}
		teclado.close();
		System.out.println("Programa finalizado");
	}

	/**
	 * Calcula el salario de un empleado segun las horas que ha trabajado.
	*@param horas Numero de horas trabajadas 
	*@return salario calculado 
	*/
	private static double calcularsalario(int horas){
		final int HORAS_LIMITE = 35;
		final double PAGO_NORMAL = 15.0;
		final double PAGO_EXTRA = 22.0;

		if (horas<=HORAS_LIMITE) {
			return PAGO_NORMAL* horas;	
		}else{
			int horasExtras =horas-HORAS_LIMITE;
			return (HORAS_LIMITE*PAGO_NORMAL)+(horasExtras*PAGO_EXTRA);//Calculo horas
		}
	}
}