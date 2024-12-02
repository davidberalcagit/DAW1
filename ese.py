# Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	numero1 = int()
	numero2 = int()
	print("Introduce la edad de la primera persona: ")
	numero1 = int(input())
	print("Introduce la edad de la segunda persona: ")
	numero2 = int(input())
	if numero1>numero2:
		print(numero1," es mayor que ",numero2)
	else:
		if numero2>numero1:
			print(numero2," es mayor que ",numero1)
		else:
			print("Los numeros son iguales")

