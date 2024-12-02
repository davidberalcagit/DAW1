import java.util.Scanner;
import java.lang.Math;
public class ejercicio11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducce numero de lados: ");
        int lado = teclado.nextInt();

        for(int i=1; i <= lado ; i++){
            for(int j = 1; j <= lado;j++){
                    if(i==1 || i == lado){
                        System.out.print("* ");
                    }else{
                        if(j== 1 || j == lado){
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
            }
            System.out.println();
        }          
    }
}
