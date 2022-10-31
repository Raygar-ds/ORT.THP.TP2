package ort.thp.tp2.ej11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turnera turno = new Turnera();
		System.out.println(turno);
		turno.otorgarProximoNumero();
		System.out.println("El ultimo turno es: " + turno.obtenerUltimoNumeroOtorgado());
		turno.resetearContador();

	}

}
