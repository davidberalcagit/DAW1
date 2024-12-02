import java.util.Scanner; //Importa la utilidad de leer por teclado
public class Ejercicio4 { //Para definir la clase (como se llama el programa)
    public static void main(String[] args) { //Hay que ponerlo
        Scanner teclado = new Scanner(System.in); //Hace un escaner del teclado
        int num = 6; //Declara que num es entero 
        int sum = 0; //Declara que sum es entero
        double cont = 0; //Declara que cont es entero

        while(num > 0){ //Mientras que num sea mayor que 0

        System.out.println("Introduce un numero(Introduce 0 para salir): "); //Imprime por pantalla

        num = teclado.nextInt();//Pide por teclado un numero y lo mete en num

        sum += num; //Va sumando los numeros y lo mete en sum
        cont++; //Va contando 1
        }
        
        System.out.println("La suma de todos los numeros es " + sum );
        System.out.println("La media de todos los numeros es " + media );
         teclado.close();

    }
}
