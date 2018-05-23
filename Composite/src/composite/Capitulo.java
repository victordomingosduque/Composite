/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;

public class Capitulo extends ComposicaoLivro {

	ArrayList<ComposicaoLivro> topicos = new ArrayList<ComposicaoLivro>();

	public Capitulo(String nomeDoTopico) {
		this.nomeDoTopico = nomeDoTopico;
	}

	@Override
	public void printNomeDoTopico() {
		System.out.println(this.nomeDoTopico);
		for (ComposicaoLivro topicoTmp : topicos) {
			topicoTmp.printNomeDoTopico();
		}
	}

	@Override
	public void adicionar(ComposicaoLivro novoTopico) {
		this.topicos.add(novoTopico);
	}

	@Override
	public void remover(String nomeDoTopico) throws Exception {
		for (ComposicaoLivro topicoTmp : topicos) {
			if (topicoTmp.getNomeDoTopico() == nomeDoTopico) {
				this.topicos.remove(topicoTmp);
				return;
			}
		}
		throw new Exception("Não existe este topico");
	}

	@Override
	public ComposicaoLivro getTopico(String nomeDoTopico) throws Exception {
		for (ComposicaoLivro topicoTmp : topicos) {
			if (topicoTmp.getNomeDoTopico() == nomeDoTopico) {
				return topicoTmp;
			}
		}
		throw new Exception("Não existe este topico");
	}

}