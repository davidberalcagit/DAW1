import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String respuesta = "S";


        while(respuesta.equalsIgnoreCase("s")){
        System.out.print("Introduce numero real con varios decimales: ");
        String realString = teclado.nextLine();

        realString=realString.replace(",",".");
        double real = Double.parseDouble(realString);
        System.out.print("Indique a cuantos decimales desea redondear: ");
        int decimales = teclado.nextInt();

        double resultado= Math.rint(real*Math.pow(10,decimales)/Math.pow(10,decimales));
        System.out.println("El numero redondeado seria: " + resultado);
        teclado.nextLine();

        System.out.print("¿Desea redondear otro numero ? S/N: ");
        respuesta = teclado.nextLine();
        System.out.println();
        }
        teclado.close();

    }
}
