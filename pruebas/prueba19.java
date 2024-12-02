import java.util.Scanner;
import java.lang.Math;

public class prueba19{
	public static void main(String[]args){
	final int SUPERIOR=10;
	final int INFERIOR=-10;
	int margen=Math.abs(INFERIOR);
	
	final char CARACTER_BARRA='*';
	int[]datos={1,3,-7,-10,10,11,-11};
	
	for(i=0;i<datos.length;i++){
		int dato=datos[i];

	if (dato>SUPERIOR||dato<INFERIOR){
	System.out.println(dato+"Valor no valido");
	}else{
	//Margen izquierdo
	if (dato<0){
		for(int j=0;dato<margen+dato;j++){
		System.out.print(" ");
	}//Asteriscos
	for(int j=0;j<Math.abs(dato);j++){
		System.out.print(CARACTER_BARRA);
	}
	}else{
		for(int j=0;j<margen;j++){
			System.out.print(" ");
		}
	}
	System.out.print("|");
	if (dato>0){
	for(int j=0;j<dato;j++){
		System.out.println("CARACTER_BARRA");
	}
	for(int j=0;j<SUPERIOR-dato;j++){
		System.out.println(" ");
	}
	}
	System.out.println();
}
}
}
}







