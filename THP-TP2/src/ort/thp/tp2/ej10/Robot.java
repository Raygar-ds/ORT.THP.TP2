package ort.thp.tp2.ej10;

public class Robot {
	
	public void Saludar() {
		System.out.println("Hola, mi nombre es Tito. ¿En qué puedo ayudarte?");		
	}
	public void Saludar(Persona persona) {
		System.out.println("Hola " + persona.getNombre() + ", mi nombre es Tito. ¿En qué puedo ayudarte?");
	}

}
