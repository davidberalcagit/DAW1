 //Lee tres números y escribe el mayor de los tres.
 //MayorDeTres.java
 //23.10.2024

import java.util.Scanner;
	public class MayorDeTres {
	public static void main (String[] args){
		Scanner teclado = new Scanner(System.in);
	//Declaracion de variables
	Integer num1, num2, num3;
	System.out.println("Introduce tres numeros: ");
	num1 = teclado.nextInt();
	num2 = teclado.nextInt();
	num3 = teclado.nextInt();
	//Comprobacion de numero 
	if ((num1 > num2) && (num1 > num3)){
		System.out.println(num1 + " Es el mayor");
	}else if((num2 > num1) && (num2 > num3)) {
		System.out.println(num2 + " Es el mayor");
	}else if((num3 > num1) && (num3 > num2)){
		System.out.println(num3 + " Es el mayor");
	}else if ((num1==num2) && (num2==num3)){
	//Comprobacion si son iguales
		System.out.println("Todos son iguales");
	}else if(num3 == num2) {
		System.out.println(num3 + " Es igual que " + num2);
	}else if(num1==num2){
		System.out.println(num1 + " Es igual que " + num2);
	}else if(num1==num3){
		System.out.println(num1 + " Es igual que " + num3);
	}else if ((num1==num2) && (num2==num3)) {
		System.out.println("Todos son iguales");
			
		}
	}
}
