package br.com.caelum.contas.modelo;

public class TestaArrays {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		double media = 0;
		double totalSaldos = 0;

		for(int i =0; i<contas.length; i++){
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.00);
			contas[i] = conta;
		}
		
		
		for(int i =0; i<contas.length; i++){
			
			totalSaldos += contas[i].saldo;
			media = totalSaldos / contas.length;
		}
		
			System.out.println(media);
	}

}
