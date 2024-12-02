import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[2];
        int aux;
        String resp="S";

         
        while (resp.equalsIgnoreCase("S")){ //Para identificar las mayusculas.
        System.out.println("Introduce dos numeros enteros: ");
        for(int i = 0; i < 2; i++){
            numeros[i] = teclado.nextInt();
        }
        

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
        for(int num: numeros){
            System.out.println(" " + num);
            }
            
            teclado.nextLine();
            System.out.println("¿Quieres añadir otro numero? S/N ");
            resp = teclado.nextLine();
        }
        teclado.close();
    }
}
