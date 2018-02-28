package fev27;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta a = new Conta();
		
		
		a.setTitular("batman");
		System.out.println(a.getTitular());
		
		a.setLimite(3000);
		System.out.println(a.getLimite());

		a.setSaldo(2000);
		System.out.println(a.getSaldo());
		
		Conta b = new Conta("Calebe");
		System.out.println(b.getTitular());
		
		
		// Exercício 01
		// -------------
		// Ao tentar modificar ou ler um atributo de conta, mostra-se um erro 
		// falando que este atributo não está visivel. 
		
		
		// Exercício 04
		// --------------
		// É necessário criar um contrutor sobrecarregado para que se tenha mais opçoes para o usuario. 
		// Se não houvesse, o usuario só teria uma opção para agir.
		
		

	}

}
