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
		
		
		// Exerc�cio 01
		// -------------
		// Ao tentar modificar ou ler um atributo de conta, mostra-se um erro 
		// falando que este atributo n�o est� visivel. 
		
		
		// Exerc�cio 04
		// --------------
		// � necess�rio criar um contrutor sobrecarregado para que se tenha mais op�oes para o usuario. 
		// Se n�o houvesse, o usuario s� teria uma op��o para agir.
		
		

	}

}
