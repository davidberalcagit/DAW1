import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 6;
        int sum = 0;
        int cont = 0;

        while(num > 0){

        System.out.println("Introduce un numero: ");

        num = teclado.nextInt();

        sum += num;
        cont++;
        }
        double media = sum/cont;
        System.out.println("La suma de todos los numeros es " + sum );
        System.out.println("La media de todos los numeros es " + media );
         teclado.close();

    }
}
