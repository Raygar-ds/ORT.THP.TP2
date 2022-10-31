package ort.thp.tp2.ej9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Domicilio dom = new Domicilio("Yatay", "240", "Almagro");
		Persona persona1 = new Persona("Fulano", "Gomez", "12345678", dom);
		Persona persona2 = new Persona("Mengana", "Torres", "9123456", dom);
		
		cuentaBancaria cbu1 = new cuentaBancaria("CA", 0.0, persona1);
		cuentaBancaria cbu2 = new cuentaBancaria("CC", 0.0, persona2);
		
		System.out.println(cbu1);
		System.out.println(cbu2);

	}

}
