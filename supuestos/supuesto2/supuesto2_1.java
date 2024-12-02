/*
Un programa que pide numeros y al final muestra el mayor y el menor de los numeros introducidos
19-11-2024 16:41
David Bernal
*/
import java.util.Scanner;
public class supuesto2_1 {
    public static void main(String[]args){
    Scanner teclado=new Scanner(System.in);        
    int num=0;
    String resp="F";
    int[] array={0,0};
    //Si la respuesta es F el bluce acaba.
    do{
    System.out.println("Escribe un numero: ");//Va a preguntar contiguamente un numero
    num=teclado.nextInt();
        if(num<0){
        System.out.println("Debe ser positivo");//Si es positivo avisa al usuario
    for(int i=0;i<array.length;i++){//Recorre todo el stringpara saber cual es el 
        if(num>array[0]||num>array[1]){
            array[0]=num;
        } else if(num<array[0]||num<array[1]){
            array[1]=num;       
    }
    }
}
    if(num==0){
    resp=teclado.nextLine();
    System.out.println("¿Quieres terminar?Para terminar pulsa T/t: ");
    resp=teclado.nextLine();
        }
     }while(resp.equalsIgnoreCase("F"));//Mientras que sea F se va a ejecutar en bucle.
    System.out.println("El mayor de todos los numeros es: " + array[0]);
    System.out.println("El menor de todos los numeros es: " + array[1]);
    teclado.close();
    }
}

