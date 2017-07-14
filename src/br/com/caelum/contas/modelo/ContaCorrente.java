package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("vc sacou valor negativo");
		} else if (this.saldo < valor) {
			throw new SaldoInsuficienteException();
		} else {
			this.saldo -= (valor + 10);
		}
		return saldo;
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

}
