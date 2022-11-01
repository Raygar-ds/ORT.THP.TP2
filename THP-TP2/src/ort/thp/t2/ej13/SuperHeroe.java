package ort.thp.t2.ej13;

public class SuperHeroe {
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superPoder;

	SuperHeroe(String nombre, int fuerza, int resistencia, int superPoder) {
		super();
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.superPoder = superPoder;
	}

	public String getNombre() {
		return nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getResistencia() {
		return resistencia;
	}

	public int getSuperPoder() {
		return superPoder;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setFuerza(int fuerza) {
		if (fuerza > 100) {
			this.fuerza = 100;
		} else if (fuerza < 0) {
			this.fuerza = 0;
		} else
			this.fuerza = fuerza;
	}

	private void setResistencia(int resistencia) {
		if (resistencia > 100) {
			this.resistencia = 100;
		} else if (resistencia < 0) {
			this.resistencia = 0;
		} else
			this.resistencia = resistencia;

	}

	private void setSuperPoder(int superPoder) {
		if (superPoder > 100) {
			this.superPoder = 100;
		} else if (superPoder < 0) {
			this.superPoder = 0;
		} else
			this.superPoder = superPoder;
	}

	@Override
	public String toString() {
		return "SuperHeroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia + ", superPoder="
				+ superPoder + "]";
	}

	public String competir (SuperHeroe sup) {

		if ((fuerza>sup.getFuerza() && (resistencia>sup.getResistencia() || superPoder>sup.getSuperPoder())) || 
				(resistencia>sup.getResistencia() && superPoder>sup.getSuperPoder())) {
			return "VICTORIA";
		} else if ((fuerza<sup.getFuerza() && (resistencia<sup.getResistencia() || superPoder<sup.getSuperPoder())) || 
				(resistencia<sup.getResistencia() && superPoder<sup.getSuperPoder())) {
			return "DERROTA";
		} else return "EMPATE";



	}
}
