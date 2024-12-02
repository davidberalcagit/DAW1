import java.util.Scanner;
import java.lang.Math;
public class Ejercicio11 {
    public static void main(String[] args) {
        
        final int  LIMITE_SUPERIOR = 10;
        final int LIMITE_INFERIOR  =-10;
        int margenIzquierdo = Math.abs(LIMITE_INFERIOR);

        final char CARACTER_BARRA = '*';

        //Datos de prueba 
        int[] datos = {-9,-2,4,-6,-10,0,10,-11,11};

        for (int i=0;i<datos.length;i++){
            int dato =datos[i];
            if(dato > LIMITE_SUPERIOR || dato < LIMITE_INFERIOR){
                System.out.println("Valor " + dato + ":Fuera de rango");
            }else{
                if(dato<0){
                    for(int j=0;j<margenIzquierdo + dato;j++){
                        System.out.print(" ");
                    }
                    for (int j=0;j< Math.abs(dato);j++) {
                        System.out.print(CARACTER_BARRA);
                    }
                    }else{
                        for (int j=0;j<margenIz
                            quierdo;j++) {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("|");
                    if (dato>0) {
                        for (int j=0;j<dato;j++) {
                            System.out.print(CARACTER_BARRA);
                        }
                        for (int j = 0;j<LIMITE_SUPERIOR -dato;j++) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                
            }
        }

    }
}