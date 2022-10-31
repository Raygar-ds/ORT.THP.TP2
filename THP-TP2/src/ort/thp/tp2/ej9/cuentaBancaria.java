package ort.thp.tp2.ej9;

public class cuentaBancaria {

	private String CBU;
	private String tipo;
	private Double saldo;
	private Persona titular;

	cuentaBancaria(String tipo, Double saldo, Persona titular) {
		this.tipo = tipo;
		this.saldo = saldo;
		this.titular = titular;
		generarCBU();
	}

	public void generarCBU() {
		if (tipo.equals("CA")) {
			this.CBU = "11-" + titular.getDni() + "-" + titular.getDni().charAt(7);
		} else {
			this.CBU = "12-" + titular.getDni() + "-" + titular.getDni().charAt(7);
		}

	}
	
	public double obtenerSaldo() {
		return saldo;
	}
	
	public void depositar(Double monto) {
		this.saldo += monto;
	}
	
	public void extraer(Double monto) {
		if (monto>saldo) {
			System.out.println("Saldo insuficiente");
		} else { 
			System.out.println("Retiraste $" + monto + "\n"+"-----------------------"+"\n"+"tu saldo es: $"+saldo);
		}
	}

	@Override
	public String toString() {
		return "cuentaBancaria [CBU=" + CBU + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
	
	
	
	

}
