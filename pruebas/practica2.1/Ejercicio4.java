import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 6;
        int sum = 0;
        double cont = 0; //Se declara como double para que pueda hacer el calculo de la media con decimales.

        while(num > 0){

        System.out.println("Introduce un numero(Introduce 0 para salir): ");

        num = teclado.nextInt();

        sum += num;
        cont++;
        }
        cont--; //Para que no tenga en cuenta el 0 al hacer la media.
        double media = sum/cont;       
        System.out.println("La suma de todos los numeros es " + sum );
        System.out.println("La media de todos los numeros es " + media );
         teclado.close();

    }
}
