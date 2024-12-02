/*
El programa muestra las tablas de multiplicar de un numero y saca hasta 15 productos.
DavidBernal 29-11-2024
*/
public class ejer2 {
	public static void main(String[] args) {
		int numero=9;
		calcularMostrarTabla(numero);
	}



	/**
	*Es una funcion que nos devuelve el numero de numeros consecutivo
	*@param numero para multiplicar
	*@return 
	*/
	private static void  calcularMostrarTabla(int numero){
		final int LIMITE= 15;
		int numero2 = numero;
			System.out.println("------TABLA DEL "+ numero2 +"-----");
		for (int i=0;i<=LIMITE;i++) {
			int result=numero*i;
			System.out.println(numero+" X "+i+" = "+result );
		}


	}
}