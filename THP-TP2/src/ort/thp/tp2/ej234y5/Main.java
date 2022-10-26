package ort.thp.tp2.ej234y5;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Domicilio dom = new Domicilio("Salguero", "2677", "Buenos Aires"); //Se crea el domicilio
		Persona persona = new Persona("Fulano", "gomez", dom); //Se le asigna domicilio a Persona.
		Persona persona1 = new Persona("Diego", "Santurtun", dom); //Se le asigna domicilio a Persona.
		persona.obtenerNombreCompleto();
		//4.b - Se cambia el nombre
		persona.ponerNombre("Fulano");
		persona.ponerApellido("Gomez");
		//Se cambia el domicilio
		dom.setCalle("Av Cordoba");
		dom.setNumero("1234");
		dom.setCiudad("CABA");
		persona1.ponerDomicilio(dom); // Se le asigna el domicilio a 
		//4.d - Muestra toda la informacion de la persona
		persona.obtenerNombreCompleto();
		
		//5.f - modificar el domicilio.
		dom.setCalle("Av Santa Fe");
		dom.setNumero("5600");
		persona.obtenerNombreCompleto();
		
	}

}
