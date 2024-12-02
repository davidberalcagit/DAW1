/**
	*ParImpar.java
	*Programa que pide dos datos y te dice si es Par o Impar
	* arj - 2024.10.23
	*/


import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
	
	int numero1;

        System.out.println("Introduce un numero: ");
        numero1 = teclado.nextInt();
	
	if(numero1 % 2 == 0){
	System.out.println("El numero es par ");
	}else {
		System.out.println("El numero es impar");
		}	
	}
}
