/*Un programa que con un menu que hace las siguientes operaciones
En el "1" suma, en "2" resta,en "3" multiplica y en "4" divide.Al dividir por 0 el programa suelta error 
David Bernal Alcazar 12-11-2024*/
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Declaración de variables 
        String opcion;
        boolean continuar = true;
        int num1;
        int num2;
        double num3;
        double num4;

        do {
            // Mostrar el menú de opciones
            System.out.println("------------ Menú ---------------");
            System.out.println("Pulse 1 para sumar");
            System.out.println("Pulse 2 para restar");
            System.out.println("Pulse 3 para multiplicar");
            System.out.println("Pulse 4 para dividir");
            System.out.println("Pulse 5 para salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextLine();

            //Estas son las distintas opciones
            switch (opcion) {
                case "1":
                    System.out.println("Escribe dos números para sumar: ");
                     num1 = teclado.nextInt();
                     num2 = teclado.nextInt();
                    System.out.println("Resultado: " + (num1 + num2));
                    teclado.nextLine(); 
                    break;
                case "2":
                    System.out.println("Escribe dos números para restar: ");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    System.out.println("Resultado: " + (num1 - num2));
                    teclado.nextLine();
                    break;
                case "3":
                    System.out.println("Escribe dos números para multiplicar: ");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    System.out.println("Resultado: " + (num1 * num2));
                    teclado.nextLine();
                    break;
                case "4":
                    System.out.println("Escribe dos números para dividir: ");
                     num3 = teclado.nextDouble();
                     num4 = teclado.nextDouble();

                     if(num3==0 || num4==0){ //Si alguno de los dos numeros es igual a cero imprime error
                        System.out.println("Error: No se puede dividir entre cero.");
                     }else{
                    System.out.println("Resultado: " + (num3 / num4));
                     }
                    teclado.nextLine();
                    break;
                case "5":
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (continuar);

        teclado.close();
    }
}