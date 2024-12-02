import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[3]; //En el array se almacenan 3 numeros
        int aux;

        System.out.println("Introduce tres numeros enteros: ");
        for(int i = 0; i < numeros.length; i++){ //El for se repite hasta que la cantidad de numeros introducidos sea 3 
            numeros[i] = teclado.nextInt();
        }
        teclado.close();

        for(int i = 0; i < numeros.length; i++) { //El for pone en i el contenido del primer numero del array(Posicion 0)
            for(int j = i + 1; j < numeros.length; j++) { //for suma 1 a "i" y lo mete en "j" por lo que en este se encuentra el segundo numero del array(Posicion1)
                if(numeros[i] < numeros[j]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        //Crea la variable num con lo que hay en el array numeros 
        System.out.println("\nLa ordenacion de mayor a menor es: ");
        for(int num : numeros){ 
            System.out.println(" " + num + "\n ");
        }
         teclado.close();

    }
}