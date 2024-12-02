import java.util.Scanner;
public class prueba7 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		boolean continuar=true;
		while (continuar) {
			System.out.println("Horas trabajadas: ");
			int horastrabajadas=teclado.nextInt();

			double salario=calcularSalario(horastrabajadas);
			System.out.println("El salario semanal es: ");

			System.out.println("Quieres otro(S/N)");
			continuar=Scanner.next().equalsIgnoreCase("s");
		}
	}
			private static double calcularSalario(int horas){
				final double NORMAL =15.0;
				final double EXTRA =22.0;
				final int HORAS_LIMITE =35;

				if (horas <=HORAS_LIMITE) {
					return horas *NORMAL;
				}else{
					int EXTRA =horas- HORAS_LIMITE;
					return 	(HORAS_LIMITE*NORMAL)+(horasExtras*EXTRA);

				}
			}
}
				
				

