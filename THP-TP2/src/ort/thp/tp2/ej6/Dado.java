package ort.thp.tp2.ej6;

public class Dado {
	private int dado = (int)(Math.random()*6)+ 1;
	
	public Dado() {
		
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}
	
	public void getValor() {
		System.out.println("El valor del dado es " + dado);
	}
	
		
	

}
