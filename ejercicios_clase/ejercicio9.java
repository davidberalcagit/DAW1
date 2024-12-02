import java.util.Scanner;
public class operaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[3];
        int aux;

        System.out.println("Introduce tres numeros enteros: ");
        for(int i = 0; i < 3; i++){
            numeros[i] = teclado.nextInt();
        }
        teclado.close();

        for(int i = 0; i < numeros.length; i++) {
            for(int j = i + 1; j < numeros.length; j++) {
                if(numeros[i] < numeros[j]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        System.out.println("\nLa ordenacion de mayor a menor es: ");
        for(int num : numeros){
            System.out.print(" " + num + " ");
        }
    }
}
