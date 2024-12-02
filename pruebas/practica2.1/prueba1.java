//Un programa que ordene 3 numeros dados por el usuario
//David Bernal Alcazar 12-11-2024
 
import java.util.Scanner;
public  class prueba1{
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       int[]num = new int[3];
       int aux;

       System.out.println("Escribe tres numero: ");
       for (int i=0 ;i<num.length;i++) {
           num[i]=teclado.nextInt();
       }
       teclado.close();

       for (int i=0;i < num.length;i++){
        for (int j = i + 1;j<num.length ;j++ ) {
            if(num[i] < num[j]){
                aux= num[i];
                num[i]=num[j];
                num[j]=aux;
            }

        }

        }
        System.out.println("La ordenacion de mayor a menor es: ");
        for (int i=0;i<num.length;i++) {
                System.out.println(" " + num + "\n ");
        }
        teclado.close();
    }
}