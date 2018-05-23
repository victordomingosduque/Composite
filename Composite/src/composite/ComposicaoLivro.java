/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

// Classe componente
public abstract class ComposicaoLivro {

	String nomeDoTopico;

	public void printNomeDoTopico() {
		System.out.println(this.nomeDoTopico);
	}

	public String getNomeDoTopico() {
		return this.nomeDoTopico;
	}

	public void adicionar(ComposicaoLivro novoTopico) throws Exception {
		throw new Exception("Não pode inserir topicos em: "
				+ this.nomeDoTopico + " - Não é uma capitulo");
	}

	public void remover(String nomeDoTopico) throws Exception {
		throw new Exception("Não pode remover topicos em: "
				+ this.nomeDoTopico + " -Não é uma capitulo");
	}

	public ComposicaoLivro getTopico(String nomeDoTopico) throws Exception {
		throw new Exception("Não pode pesquisar topicos em: "
				+ this.nomeDoTopico + " - Não é uma capitulo");
	}
}