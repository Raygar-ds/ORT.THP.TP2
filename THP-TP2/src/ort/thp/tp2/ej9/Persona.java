package ort.thp.tp2.ej9;

public class Persona {
	
	private String nombre, apellido, dni;
	private Domicilio domicilio;
	
	Persona (){
		
	}

	Persona(String nombre, String apellido, String dni, Domicilio domicilio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni.length()<8?"0"+dni : dni;
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", domicilio=" + domicilio
				+ "]";
	}
	

}
