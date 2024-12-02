/*
Ordena por baraja un array de numeros
DavidBernal 29-11-2024
*/

public class ejer10 {
	/**
	 * Ordena un array de enteros utilizando metodo baraj
	 * @param vector El array de enteros a ordenar
	 * @return 1 si se ordeno, 0 si ya estaba ordenado, -1
	 * si no puedoordenar
	 */
	public static int []ordenarBaraja(int[]vector){
		if (vector==null||vector.length==0) {
			//return -1;
		}
		boolean yaOrdenado = true;
		for (int i=0;i<vector.length;i++) {
			int aux=vector[i];
			int post=i;
			boolean movido=false;

			while (post > 0 && vector[post-1]){
					vector[post]=vector[post-1];
					post --;
					movido = true;
					yaOrdenado=false;

			}
			vector[post]=aux;
			if (yaOrdenado) {
				return 0;
			}else{
				return 1;
			}
		}
	}

	public static void main(String[] args) {
	int[] vector ={3,7,1,9,5};	
	int[] resultado=ordenarBaraja(vector);

	for (int i=0;i<vector.length;i++) {
		System.out.println(resultado[i]);
	}
	}
}

