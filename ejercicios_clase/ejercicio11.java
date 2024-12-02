import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String respuesta = "S";


        while(respuesta.equalsIgnoreCase("s")){
        System.out.print("Introduce numero real con varios decimales: ");
        double real = teclado.nextDouble();

        System.out.println("Indique a cuantos decimalesdesea redondear: ");
        int decimales = teclado.nextInt();

        double resultado= Math.rint(real*Math.pow(10,decimales)/Math.pow(10,decimales));
        System.out.println("El numero redondeado seria: " + resultado);
        teclado.nextLine();

        System.out.println("¿Desea redondear otro numero ? S/N: ");
        respuesta = teclado.nextLine();
        System.out.println();
        }
        
    }
}
