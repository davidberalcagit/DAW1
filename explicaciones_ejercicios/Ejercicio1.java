import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[3];
        int aux;

        System.out.println("Introduce tres numeros enteros: ");
        for(int i = 0; i < numeros.length; i++){ //El for se repite hasta que la cantidad de numeros introducidos sea 3 
            numeros[i] = teclado.nextInt();
        }
        teclado.close();

        for(int i = 0; i < numeros.length; i++) { //El for pone en i el contenido del primer numero del array.En la primera pasada(Posicion 0|Posicion1) en la segunda pasada(Posicion1|Posicion2) en la ultima pasada(Posicion2|) 
            for(int j = i + 1; j < numeros.length; j++) { //for suma 1 a "i" y lo mete en "j" por lo que en este se encuentra el segundo numero del array(Posicion1)
                if(numeros[i] < numeros[j]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        System.out.println("\nLa ordenacion de mayor a menor es: ");
        for(int num : numeros){
            System.out.println(" " + num + "\n ");
        }
         teclado.close();

    }
}
