
public class Pessoa {
	private String cpf;
	private String nome;
	private int idade;
	
	public Pessoa (String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

//	public void setNome(String nome) {
//		this.nome = nome;
//	}

	public int getIdade() {
		return idade;
	}
	
//	public void setIdade(int idade) {
//		this.idade = idade;
//	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (this.idade > 21) {
		this.cpf = cpf;
		}
	}
	
	public void fazAniversario(){
		this.idade++;
	}

	
}
