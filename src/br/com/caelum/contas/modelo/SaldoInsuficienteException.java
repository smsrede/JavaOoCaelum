package br.com.caelum.contas.modelo;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException() {
		super("Saldo insuficiente");
	}
}
