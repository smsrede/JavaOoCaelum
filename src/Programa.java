
public class Programa {

	public static void main(String[] args) {
		Pessoa fulano = new Pessoa("Sicrano", 22);
		//fulano.setNome("Fulano de Tal");
		//fulano.setIdade(29);
		fulano.setCpf("111111111111");
		
		System.out.println(fulano.getNome());
		System.out.println(fulano.getCpf());
		System.out.println(fulano.getIdade()); 

		Pessoa beltrano = fulano; 
		//beltrano.setIdade(34);
		
		System.out.println(fulano.getNome());
		System.out.println(fulano.getCpf());
		System.out.println(fulano.getIdade());
		
		Pessoa sicrano = new Pessoa("Samuel", 22);
		
			
	}

}
