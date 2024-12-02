import java.util.Scanner;
public class prueba3{
public static void main(String[]args){
Scanner teclado= new Scanner(System.in);
	int num=0;
	int num2=0;
	int mayor=0;
	String resp="S";
	while(resp.equalsIgnoreCase("S")){
	System.out.println("Escribe: ");
	num=teclado.nextInt();
	num2=teclado.nextInt();
	teclado.nextLine();
	if(num<num2){
	mayor=num2;
	}else{
	mayor=num;
	}
	System.out.println();
	System.out.println("Quieres seguir: ");
	resp=teclado.nextLine();
	System.out.println();
	}
	System.out.println(mayor);
	}
}
