/*
Un programa que verifica si el programa este ordenado
DavidBernal 29-11-2024
*/

public class ejer6 {
	/*
	Es una funcion que nos dice si los numeros del array estan ordenados o no
	@param array de numeros
	@return int contador
	*/

	public static boolean yaOrdenadoInt (int[] numeros){

		if (numeros==null||numeros.length==0) {
			throw new IllegalArgumentException("El array debe contener al menos 2 numeros");
		}

		for (int i=0;i<numeros.length-1;i++) {
			if (numeros[i]>numeros[i+1]) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		int[] numeros={1, 2, 3, 4, 5, 6, 7};
		boolean resp=yaOrdenadoInt(numeros);
		if (resp) {
			System.out.println("El array esta ordenado");
		}else{
			System.out.println("El array no esta ordenado");
		}
	}



	
}