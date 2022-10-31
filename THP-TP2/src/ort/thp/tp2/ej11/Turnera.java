package ort.thp.tp2.ej11;

public class Turnera {
	private int turno;
	
	
	
	public Turnera() {
		this.turno = 0;
	}

	public void otorgarProximoNumero() {
		this.turno++;
		System.out.println("El proximo turno es el: " + turno);
		
	}
	
	public int obtenerUltimoNumeroOtorgado() {
		return turno;
	}
	
	public void resetearContador() {
		this.turno = 0;
		System.out.println("Se reseteo la posicion del turno a: " + turno);
	}
	
	public void resetearContador(int posicion) {
		this.turno = posicion;
		System.out.println("Se reseteo la posicion del turno a: " + turno);
		
	}

	@Override
	public String toString() {
		return "Turnera [turno=" + turno + "]";
	}

}
