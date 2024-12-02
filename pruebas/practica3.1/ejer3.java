/*
El programa muestra la longitud de la secuencia más larga de números consecutivos en un array.
DavidBernal 29-11-2024
*/
public class ejer3 {
	/**
     * Cuenta la longitud de la secuencia más larga de números consecutivos en un array.     *
     * @param numeros el array de números a evaluar.
     * @return la longitud de la secuencia más larga de números consecutivos.
     */
	private static int contarIntConsecutivos(int[]numeros){
		if(numeros != null && numeros.length<2){
			return 0;
		}else{
			int contador = 1;
			int maxConsecutivos=0; //Almacena consecutivos max

			for (int i=0 ;i<numeros.length-1;i++) {
				if (numeros[i+1]==numeros[i]+1) {
					contador++;
				}else{
					maxConsecutivos=Math.max(maxConsecutivos,contador);
				}
			}
			if (contador ==1) {
				return 0;
			}
				return maxConsecutivos;
			
		}


	}
	public static void main(String[] args) {
		int[] numeros={3, 5, 3, 4, 5, 5, 4};
		int numero =contarIntConsecutivos(numeros);
		System.out.println("El numero de numeros consecutivos es "+numero);

	}
}