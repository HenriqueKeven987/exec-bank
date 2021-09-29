package entidades;

public class conta {

	private int numeroConta;
	private String nomeTitular; 
	private double saldoConta;
	
	public conta() {
		
	}
	
	public conta(int numeroConta, String nomeTitular) {		
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public conta(String nomeTitular, int numeroConta, double saldoConta) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		
	}
	
	
	public void setnumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public void setnomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public String getnomeTitular() {
		return nomeTitular;
	}
	
	public double getsaldoConta() {
		return this.saldoConta;
	}
	
	public void depositoServ(double saldoConta) {
		this.saldoConta += saldoConta;
	}
	
	public void sacarSaldo(double saque) {	
		
		if(saque > this.saldoConta) {
			System.out.println("Saldo insuficiente!");			
		}else {
			this.saldoConta -= 5.0;
			this.saldoConta -= saque;
			System.out.println("Saque Realizado com Sucesso!");
		}
		
	}
	
	public String toString() { 
		
		return "Conta " + this.numeroConta + ", Nome: "+ this.nomeTitular + ", Saldo: $"+ this.saldoConta;
	}
	
	 
	
	
	
}
