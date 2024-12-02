/*
El programa saca un calculo de el salario de los trabajadores que cobran 15€ por hora, se considera horas extras por encima de 35 horas,
y se pagaran a 22€.
DavidBernal 29-11-2024
*/

 /**
     * Encuentra el número más frecuente en un array de enteros.
     * Si hay varios números con la misma frecuencia máxima, retorna el primero que aparece.
     *
     * @param numeros el array de números a analizar.
     * @return el valor más frecuente en el array.
     * @throws IllegalArgumentException si el array es nulo o está vacío.
     */

public class ejer5 {
	public static int masFrecuenteInt (int[]numeros){
		if (numeros==null||numeros.length==0) {
			throw new IllegalArgumentException("El array no debe der nulo y debe contener minimo un numero");
		}
		int valorMasFrecuente=numeros[0];
		int maxFrecuencia=1;
		int Frecuenciactu;
		
		for (int i=0;i<numeros.length;i++) {
		 	Frecuenciactu=1;
		 	for (int j=i+1;j<numeros.length;j++) {
		 		if (numeros[i]==numeros[j]) {
		 			Frecuenciactu++;
		 		}
		 	}
		 	if (Frecuenciactu>maxFrecuencia) {
		 		maxFrecuencia=Frecuenciactu;
		 		valorMasFrecuente=numeros[i];
		 	}
		 }
		 	
		 return valorMasFrecuente;
	}



	public static void main(String[] args) {
	int[] numeros={4,2,4,2,4,2};	
	int result=masFrecuenteInt(numeros);
	System.out.println(result);
	

	}

}