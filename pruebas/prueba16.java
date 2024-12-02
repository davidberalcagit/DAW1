import java.util.Scanner;
public class prueba14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num=1;
		int sum=0;
		double cont=0;
		

		while(num>0){
			num=teclado.nextInt();
			if (num<0) {
				System.out.println("positivo");
			}else{
				sum+=num;
				cont++;

			}
		} cont--;
			double media=sum/cont;
			System.out.println(sum);
			System.out.println(media);
		
	}
}