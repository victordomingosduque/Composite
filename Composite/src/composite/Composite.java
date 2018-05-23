/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author victor.domingos
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // O usuário do código não precisa saber detalhes das implementações dos
        // objetos. Consegue manipular os objetos a partir da interface comum:
        // TopicoComponent.
        ComposicaoLivro capitulo1 = new Capitulo("Capitulo 1/");
        ComposicaoLivro capitulo2 = new Capitulo("Capitulo 2/");
        ComposicaoLivro primeiroTopico = new Topico("primeiroTopico");
        ComposicaoLivro segundoTopico = new Topico("segundoTopico");

        try {
            // Como a interface define operações comuns a todos os topico é
            // possível tentar inserir um topico em um topico
            primeiroTopico.adicionar(segundoTopico);
           
        } catch (Exception e) {
            // No entanto você deve tratar este tipo de comportamento com
            // exceções ou outros métodos
            System.out.println(e.getMessage());
        }

        try {
            capitulo1.adicionar(primeiroTopico);
            capitulo1.adicionar(primeiroTopico);
            capitulo1.adicionar(segundoTopico);
            capitulo1.printNomeDoTopico();
        } catch (Exception e) {
            // Não será executado pois minha pasta é um TopicoComposite e
            // possui todas as operações de gerenciamento dos topicos
            // implementadas.
            System.out.println(e.getMessage());
        }
        
        try {
            capitulo1.adicionar(capitulo2);
            capitulo1.printNomeDoTopico();
        } catch (Exception e) {
            // Não será executado pois minha pasta é um TopicoComposite e
            // possui todas as operações de gerenciamento dos topicos
            // implementadas.
            System.out.println(e.getMessage());
        }

        try {
            // O problema dessa implementação é que o usuário do código precisa
            // sempre verificar se pode realizar as operações, pois não se tem
            // certeza sobre o tipo do objeto utilizado
            System.out.println("\nPesquisando topicos:");
            capitulo1.getTopico(primeiroTopico.getNomeDoTopico())
                    .printNomeDoTopico();
            System.out.println("\nRemover topicos");
            capitulo1.remover(primeiroTopico.getNomeDoTopico());
            capitulo1.printNomeDoTopico();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
