/* Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

#include<stdio.h>

int main() {
	int numero1;
	int numero2;
	printf("Introduce la edad de la primera persona: \n");
	scanf("%i", &numero1);
	printf("Introduce la edad de la segunda persona: \n");
	scanf("%i", &numero2);
	if (numero1>numero2) {
		printf("%i es mayor que %i\n", numero1, numero2);
	} else {
		if (numero2>numero1) {
			printf("%i es mayor que %i\n", numero2, numero1);
		} else {
			printf("Los numeros son iguales\n");
		}
	}
	return 0;
}

