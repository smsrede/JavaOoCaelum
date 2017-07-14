package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta>{

	private static int totalContas;

	protected double saldo;
	private String titular;
	private int numero;
	private int identificador;

	public Conta() {

	}

	public abstract String getTipo();

	public Conta(String titular) {
		this.titular = titular;
		Conta.totalContas++;
		setIdentificador(this.identificador += Conta.totalContas);
	}

	public Conta(String titular, int numero) {
		this(titular);
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	private String agencia;

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("vc depositou valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public double saca(double valor) {

		this.saldo -= valor;

		return valor;
	}

	/**
	 * @return the identificador Numero serial da das contas
	 */
	public int getIdentificador() {

		return identificador;
	}

	/**
	 * @param identificador
	 *            gerado pelo set identification
	 */
	public void setIdentificador(int identificador) {

		this.identificador = identificador;
	}

	public static int getTotalContas() {
		return totalContas;
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	@Override
	public int compareTo(Conta outraConta){
		return this.titular.compareTo(outraConta.titular);
		
	}

}
