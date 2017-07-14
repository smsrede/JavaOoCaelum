package br.com.caelum.contas;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;
import java.util.stream.Stream;

import br.com.caelum.contas.modelo.Conta;

public class RepositorioDeContas {
	
	public void salva(List<Conta> contas){
		
		try(PrintStream stream = new PrintStream("contas.txt")){
			for (Conta c: contas){
				stream.println(c.getTipo() + "," + c.getNumero() + "," + c.getSaldo());
			}
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
			throw new RuntimeException(e);
		} 
	}

}
