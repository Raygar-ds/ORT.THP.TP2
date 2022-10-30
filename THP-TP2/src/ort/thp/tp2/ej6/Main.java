package ort.thp.tp2.ej6;

public class Main {

	/*
	 * Escribí una clase que simule un dado tradicional de 6 caras, con las
	 * propiedades y métodos que consideres más adecuados. Recordá que debe tener un
	 * constructor el cual setea el valor inicial del dado, más el método getValor()
	 * que devuelve. Escribí la clase Test que utilice la clase dado para lanzar dos
	 * dados. Haga lo siguiente:
	 * 
	 * ● Decir si el resultado es el mismo en los dos dados, indicando el valor. ●
	 * Si el resultado no es el mismo en los dos dados, mostrar el valor mayor. ●
	 * Mostrar por pantalla el promedio de los resultados de 100 lanzamientos (de
	 * los dos dados).
	 * 
	 * Para obtener un número aleatorio en Java debes utilizar el método random
	 * colocándolo donde lo consideres necesario.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear las variables
		Dado dado1;
		Dado dado2;

		// Settear los valores en los dados
		dado1 = new Dado();
		dado2 = new Dado();
		// dado1.getValor();
		// dado2.getValor();

		if (dado1.getDado() == dado2.getDado()) {
			System.out.println("Ambos dados sacaron el numero: " + dado1.getDado() + " y " + dado2.getDado());

		} else if (dado1.getDado() > dado2.getDado()) {
			System.out.println("El primer dado es el mayor: " + dado1.getDado());

		} else if (dado1.getDado() < dado2.getDado()) {
			System.out.println("El segundo dado es el mayor: " + dado2.getDado());
		}
		
		int i = 0;
		Double counter = (double) 0;
		Dado dado100;
		while (i < 100) {
			dado100 = new Dado();
			counter += dado100.getDado();
			i++;
		}
		counter = counter/i;
		System.out.println("El promedio de 100 tiradas de dados es: " + counter);

	}

}
