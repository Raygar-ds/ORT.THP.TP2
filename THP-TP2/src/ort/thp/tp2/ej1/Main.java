package ort.thp.tp2.ej1;

import java.util.Random;
import java.util.Scanner;


public class Main {

	static int num1, num2;
	static int min, max;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear un Sumar
		Sumar suma1 = new Sumar(2, 3);

		// Metodo de Sumar
		suma1.suma(); // esto trae el valor de la suma

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar min:");
		min = sc.nextInt();

		System.out.println("Ingresar max:");
		max = sc.nextInt();

		getRandomNumber(min, max);

	}

	// Este metodo va solicitar al usuario ingresar 2 numeros
	public static void pedirNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar numero 1:");
		num1 = sc.nextInt();

		System.out.println("Ingresar numero 2:");
		num2 = sc.nextInt();
	}

	public static void getRandomNumber(int min, int max) {
		Random random = new Random();
		System.out.println(random.nextInt(max - min) + min);
	}

}
