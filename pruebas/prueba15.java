import java.util.Scanner;
public class prueba14 {
	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		int[] num=new int[2];
		int aux;
		String resp="S";
		
		while(resp.equalsIgnoreCase("S")){
			System.out.println("Escribe");
			for (int i=0;i<2;i++) {
				num[i]=teclado.nextInt();
			}
			
		for (int i=0;i<num.length;i++) {
			for (int j=i+1;j<num.length;j++ ) {
			if(num[i]<num[j]){
				aux=num[i];
				num[i]=num[j];
				num[j]=aux;
			}
				
			}
		}
			System.out.println("\nLa ordenacion de mayor a menor es: ");
        for(int nummeros: num){
            System.out.println(" " + nummeros);
            }
            
            teclado.nextLine();
            System.out.println("¿Quieres añadir otro numero? S/N ");
            resp = teclado.nextLine();
        }
        teclado.close();
		
	}
}