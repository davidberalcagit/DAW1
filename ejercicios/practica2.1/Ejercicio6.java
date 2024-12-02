//Un programa que redondea un numero con decimales, el usuario decide cuantos decimales se redondean
//David Bernal Alcazar 12-11-2024
import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String respuesta = "S";


        while(respuesta.equalsIgnoreCase("s")){
        System.out.print("Introduce numero real con varios decimales: ");
        double real = teclado.nextDouble();
    
        //realString=realString.replace(".",",");
        System.out.print("Indique a cuantos decimales desea redondear: ");
        int decimales = teclado.nextInt();

        double paso1 = Math.pow(10,decimales);
        double resultado = Math.rint(real * paso1)/paso1;//Se multiplica el numero para redondear y quitar la coma y despues al dividir se pone la coma 
        System.out.println("El numero redondeado seria: " + resultado);
        teclado.nextLine();

        System.out.print("¿Desea redondear otro numero ? S/N: ");
        respuesta = teclado.nextLine();
        System.out.println();
        }
        teclado.close();

    }
}

