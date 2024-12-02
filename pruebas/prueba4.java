import java.util.Scanner;
	
	public class prueba3{
	public static void main(String[]args){
	Scanner teclado=new Scanner(System.in);
	int []array={};
	int resp=0;
	int num=1;
	double cont=0;
	while(num>0){
	System.out.println("Escribe un numero: ");
	num=teclado.nextInt();
	if(num<0){
	System.out.println("Debe ser positivo");
	}else{
	resp += num;
	cont++;
	}
	}
	cont--;
	double  media=(resp/cont);
	System.out.println("Suma"+resp);
	System.out.println("Media"+media);
	}
}
