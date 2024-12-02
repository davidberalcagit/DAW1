/*
El programa busca la secuenciade un array en otro array.
DavidBernal 29-11-2024
*/

public class ejer7 {

    /*
      Método para buscar la primera ocurrencia de una secuencia en un array.
      @param arrayPrincipal El array principal donde se busca la secuencia.
      @param secuencia La secuencia a buscar en el array principal.
      @return El índice donde comienza la primera ocurrencia de la secuencia, o -1 si no se encuentra.
     */
    public static int buscarSecuenciaInt(int[] array, int[] array2) {
    // Validar entrada4
        for (int i=0;i<array.length;i++) {
            if (array[i]==array2[0]) {
                int contador=0;
            

            for (int j=0;j<array2.length-1;j++) {
                    if (array[i+j]==array2[j]) {
                    contador ++;
                }else {
                    contador=0;
                }
            }
            if (contador==array2.length-1) {
                return i;
            }
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {4, 3, 1, 4, 2, 5, 8,0};
        int[] array2 = {4, 2, 5};

        int result = buscarSecuenciaInt(array, array2);

        if (result == 0) { //Esto es opcional con un print normal funciona
            System.out.println("La secuencia no se encuentra en el array principal.");
        } else { 
            System.out.println("La secuencia comienza en la posicion: " + result);

        }
    }
}    


