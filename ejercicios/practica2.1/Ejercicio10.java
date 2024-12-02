/*Un programa que imprime un cuadrado de asteriscos que dibuja solo los bordes y el centro esta vacio.
 El usuario elije cuanto de largo va a ser el cuadrado
David Bernal Alcazar 12-11-2024*/
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe el tamaño de los lados del cuadrado(entero): ");
        int nlado=teclado.nextInt();

        //String con el numero de lados
        String[][] cuadrado = new String[nlado][nlado];

       for (int i=0;i<nlado;i++){ //for para recorrer las filas cubo
        for(int j=0;j<nlado;j++){ //for para reccorer las columnas
            //Imprime un asterisco si el numero de la fila o columna es 0(la primera) o si es nlado-1(la ultima)
            if(i == 0||i == nlado-1||j==0||j==nlado-1){
                cuadrado[i][j]="*";//Pone un asterisco en la posicion indicada
            }else{
                cuadrado[i][j]=" ";
            }
        }
       }
       //Imprime el cuadrado
       for (int i=0;i<nlado ;i++) {
           for (int j=0;j<nlado;++j){
            System.out.print(cuadrado[i][j]);
           }
           System.out.println();//Nueva fila
       }
        teclado.close();
    }
}