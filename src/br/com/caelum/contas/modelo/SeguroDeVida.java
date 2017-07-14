package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {
	
	private double valor;
	private String titular;
	private int numeroApolice;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTitular() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
