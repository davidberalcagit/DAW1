public class ejer9{
/**
 * Ordena un array de enteros utilizando metodo burbuja
 * @param vector El array de enteros a ordenar
 * @return 1 si se ordeno, 0 si ya estaba ordenado, -1
 * si no puedoordenar
 */

	public static int[] ordenarBurbuja(int [] vector,boolean orde){
		if (vector==null||vector.length<2){
			//return -1;
		}
		

		for (int i=0;i<vector.length -1;i++ ) {
			for (int j=0;j<vector.length -1 -i;j++ ) {
				if (vector[j]>vector[j+1]) {
					int aux =vector[j];
					vector[j]=vector[j+1];
					vector[j+1] = aux;
				}
			}
		}
		return vector;

	}

		public static void main(String[] args) {
			int[]vector={1,2,3,4,5,6};
			boolean ordenado =true;
			int[]respuesta=ordenarBurbuja(vector,ordenado);
			for (int resp:respuesta) {
				System.out.println(resp);
			}
			System.out.println(ordenado); 

	}
}

