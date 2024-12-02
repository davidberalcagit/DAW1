/*
El programa recibe un vector ordenado de enteros y un valor y devuelve el indice de la posicion del numero 
DavidBernal 29-11-2024
*/
public class ejer8 {

    /**
     * Realiza una búsqueda binaria en un arreglo ordenado.
     * @param arreglo El arreglo donde buscar.
     * @param valor El valor a buscar.
     * @return El índice del valor, o -1 si no se encuentra.
     */
    public static int buscarNumero(int[] arreglo, int valor) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (arreglo[medio] == valor) {
                return medio;  // Valor encontrado
            } else if (arreglo[medio] < valor) {
                izquierda = medio + 1;  // Buscar en la mitad derecha
            } else {
                derecha = medio - 1;  // Buscar en la mitad izquierda
            }
        }
        return -1;  // Valor no encontrado
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int valor = 11;

        int indice = buscarNumero(arreglo, valor);
        
        if (indice != -1) {
            System.out.println("El valor " + valor + " esta en la posicion: " + indice);
        } else {
            System.out.println("El valor " + valor + " no esta en el array.");
        }
    }
}
