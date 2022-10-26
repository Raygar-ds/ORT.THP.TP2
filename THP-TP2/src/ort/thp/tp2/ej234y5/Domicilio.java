package ort.thp.tp2.ej234y5;

public class Domicilio {

	private String calle;
	private String numero;
	private String ciudad;
	
	public void Domicilio() {
		
	}

	Domicilio(String calle, String numero, String ciudad) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void mostrarDomicilio() {
		System.out.println(calle + " " + numero + " " + ciudad);
	}

	@Override
	public String toString() {
		return calle + " altura " + numero + " en " + ciudad;
	}

}
