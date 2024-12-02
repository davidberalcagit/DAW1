//Lee dos números y que escribe el mayor de los dos.
//MayorDeDos.java
//23.10.2024

import java.util.Scanner;

public class MayorDeDos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
	//Declaracion de variables
	int numero1;
	int numero2;
	//Pregunta por teclado
        System.out.print("Introduce la edad de la primera persona: ");
        numero1 = Integer.parseInt(teclado.nextLine());
	
	System.out.print("Introduce la edad de la segunda persona: ");
	numero2 = teclado.nextInt();
	//Aqui comprueba que numero es más alto 
	if(numero1 > numero2) {
		System.out.println(numero1 + " Es mayor que " + numero2);
	} else if  (numero2 > numero1){
		System.out.println(numero2 + " Es mayor que " + numero1);
	}else //Si ninguno es mayor que otro pasara esto {
		System.out.println("Los numeros son iguales ");
	}        
    }
}
