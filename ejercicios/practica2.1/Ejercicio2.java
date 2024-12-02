//Un programa que muestra iniciales dibujadas  que estan en una lista
//David Bernal Alcazar 12-11-2024

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        //Crea un doble string para introducir las iniciales.
        String [][] letras={
            {"D","D","D"," "," "," "," "," ","B","B","B"," "," "," "," "," ","A","A","A","A"},
            {"D"," "," ","D"," "," "," "," ","B"," "," ","B"," "," "," "," ","A"," "," ","A"},
            {"D"," "," ","D"," "," "," "," ","B","B","B"," "," "," "," "," ","A","A","A","A"},
            {"D"," "," ","D"," "," "," "," ","B","B","B"," "," "," "," "," ","A","A","A","A"},
            {"D"," "," ","D"," "," "," "," ","B"," "," ","B"," "," "," "," ","A"," "," ","A"},
            {"D"," "," ","D"," "," "," "," ","B"," "," ","B"," "," "," "," ","A"," "," ","A"},
            {"D","D","D"," "," "," "," "," ","B","B","B"," "," "," "," "," ","A"," "," ","A"}
        };
        //Recorre todo el string 
        for (int i=0 ; i < letras.length; i++){
            for (int j=0;j <letras[i].length;j++) {
                System.out.print(letras[i][j]);
            }
            System.out.println();
        }
    }
}
