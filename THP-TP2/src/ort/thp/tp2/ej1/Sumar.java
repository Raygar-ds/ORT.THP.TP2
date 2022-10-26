package ort.thp.tp2.ej1;

public class Sumar {
	
	
	private int num1;
	private int num2;
	private int suma;

	Sumar(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public void suma() {
		suma = num1 + num2;
		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
	}

}
