public class prueba14 {
	public static void main(String[] args) {
		String [][] array={
			{"D","D","D"," "," ","B","B","B"," "," ","A","A","A","A"},
			{"D"," "," ","D"," ","B"," "," ","B"," ","A"," "," ","A"},
			{"D"," "," ","D"," ","B","B","B","B"," ","A","A","A","A"},
			{"D"," "," ","D"," ","B"," "," ","B"," ","A"," "," ","A"},
			{"D","D","D"," "," ","B","B","B"," "," ","A"," "," ","A"}
		};
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]);
			}System.out.println();
		}
		
	}
}