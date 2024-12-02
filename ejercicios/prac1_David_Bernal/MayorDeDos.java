import java.util.Scanner;

public class MayorDeDos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
	
	int numero1;
	int numero2;

        System.out.print("Introduce la edad de la primera persona: ");
        numero1 = Integer.parseInt(teclado.nextLine());
	
	System.out.print("Introduce la edad de la segunda persona: ");
	numero2 = teclado.nextInt();

	if(numero1 > numero2) {
		System.out.println(numero1 + " Es mayor que " + numero2);
	} else if  (numero2 > numero1){
		System.out.println(numero2 + " Es mayor que " + numero1);
	}else {
		System.out.println("Los numeros son iguales ");
	}        
    }
}
