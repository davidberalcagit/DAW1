<?php
	// Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
	// Es posible que el codigo generado no sea completamente correcto. Si encuentra
	// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

	$stdin = fopen('php://stdin', 'r');
	settype($numero1, 'integer');
	settype($numero2, 'integer');
	echo 'Introduce la edad de la primera persona: ', PHP_EOL;
	fscanf($stdin, "%d", $numero1);
	echo 'Introduce la edad de la segunda persona: ', PHP_EOL;
	fscanf($stdin, "%d", $numero2);
	if ($numero1>$numero2) {
		echo $numero1, ' es mayor que ', $numero2, PHP_EOL;
	} else {
		if ($numero2>$numero1) {
			echo $numero2, ' es mayor que ', $numero1, PHP_EOL;
		} else {
			echo 'Los numeros son iguales', PHP_EOL;
		}
	}
?>
