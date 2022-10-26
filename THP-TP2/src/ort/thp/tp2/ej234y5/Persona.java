package ort.thp.tp2.ej234y5;


public class Persona {
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	
	public void Persona() {
		
	}	
	Persona(String nombre, String apellido, Domicilio domicilio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
	}



	public void ponerNombre(String nombre) {
		this.nombre = nombre;
		
	}
	
	public void ponerApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + "]";
	}
	
	public void obtenerNombreCompleto() {
		System.out.println(nombre + " " + apellido + ", vive en " + domicilio);
	}
	
	public void ponerDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

}
