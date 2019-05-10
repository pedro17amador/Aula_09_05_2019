package view;

import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {
	public static void main(String args[]) {
		//Pessoa pessoa = new Pessoa();
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNome("Pedro Rodrigues Amador");
		System.out.println(pf.getNome());
		pf.falar();
		
		pj.setRazaoSocial("Etec Zona Leste");
		System.out.println(pj.getRazaoSocial());
		pf.falar();
		
		/*pessoa.setEndereco("Rua Ganho Gaucho");
		 System.out.println(pessoa.getEndereco());*/
		
		
	}
}
