
public class Conta {
	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	void deposita(double valor) {
		this.saldo += valor;
	}
	
	void saca(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {		
		return this.saldo;
	}


	
	
	
	

	


}
