import java.util.Scanner;

public class prueba10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean correct=false;

		while(correct==false){
		System.out.println("Escribe 23: ");
		int num=teclado.nextInt();

		if (num==23) {
			 correct=true;
		}else{
			System.out.println(num+" no es 23, por favor introduce 23");
			}
		}
		if(correct){
			System.out.println("El numero introducido es 23");
			
	}
}
}