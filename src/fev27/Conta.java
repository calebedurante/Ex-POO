package fev27;
class Conta {

    private String titular;
    private double saldo;
    private double limite; // adicionando um limite a conta

    public double getSaldo() {
        return this.saldo + this.limite;
    }

    // deposita() saca() e transfere() omitidos
    
    Conta() {}
    
    Conta(String titular){
    	super();
    	this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    
}