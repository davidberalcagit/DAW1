/*
Hace un triangulo de asteriscos
DavidBernal 29-11-2024
*/

public class ejer4 {
  /**
     * Muestra una pirámide de asteriscos en función de la altura dada.
     *
     * @param altura Número entero que indica la cantidad de niveles de la pirámide
     */
    public static void triangulo(int altura) {
        // Comprobar que la altura debe ser positiva
        if (altura <= 0) {
            System.out.println("La altura debe ser un número positivo.");
            return;
        }

        for (int i = 0; i < altura; i++) {
            int espacios = altura - i - 1;

            // Margenes
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            // Calcula el número de asteriscos
            int asteriscos = 2 * i + 1;
            for (int k = 0; k < asteriscos; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
   	public static void main(String[] args) {
   		int altura=7;
		triangulo(altura);
	}

}