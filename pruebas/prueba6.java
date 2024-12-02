import java.util.Scanner;
public class prueba6{
	public static void main(String[]args){
	Scanner teclado = new Scanner(System.in);
	String resp="S";
	int [] num={1,2,3,4};
	int opcion= 0;
	do{
	System.out.println("Escribe: ");
	opcion=teclado.nextInt();
	teclado.nextLine();
	switch(opcion) {
	case 1:
	System.out.println("hola1");
	break;
	
	case 2:
	for (int i=0 ; i < num.length; i++){
           
                System.out.print(num[i]);
            }
            System.out.println();
	break;
	default:
	System.out.println("No es ni 1 ni 2");
        break;
}
	System.out.println("Quieres seguir(S/N)");
	resp=teclado.nextLine();
	
	}while (resp.equalsIgnoreCase("S"));
	}
}

