import java.util.Scanner;
public class prueba13 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int [] num = new int[3];
		int aux;
		System.out.println("Escribe");
		
		for (int i=0;i<num.length;i++ ) {
			num[i]=teclado.nextInt();
		}

		for (int i=0;i<num.length;i++) {
			for (int j=i+1;j<num.length;j++) {
				if (num[i]<num[j]){
					aux=num[i];
					num[i]=num[j];
					num[j]=aux;
				}
			}
		}
		for (int numeros:num) {
			System.out.println(" "+numeros+"\n");
		}
		teclado.close();
	}
}