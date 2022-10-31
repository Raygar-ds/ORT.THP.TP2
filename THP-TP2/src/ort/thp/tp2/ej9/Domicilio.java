package ort.thp.tp2.ej9;

public class Domicilio {

	private String calle;
	private String numero;
	private String barrio;

	public void Domicilio() {

	}

	Domicilio(String calle, String numero, String barrio) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.barrio = barrio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public void mostrarDomicilio() {
		System.out.println(calle + " " + numero + " " + barrio);
	}

	@Override
	public String toString() {
		return calle + " altura " + numero + " en " + barrio;
	}

}
