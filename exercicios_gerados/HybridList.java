/*
  Exercício: Estrutura Híbrida com Acesso Rápido e Encadeamento Dinâmico
  Crie uma estrutura que combine os pontos fortes de uma ArrayList (acesso rápido por índice)
   e de uma LinkedList (navegação encadeada).
  A estrutura deve permitir o acesso por índice direto e a navegação entre elementos usando ponteiros anterior e proximo.
*/
package exercicios_gerados;
import java.util.ArrayList;

public class HybridList {

    // Nó da lista ligada
    static class Node {
        String valor;
        Node proximo;
        Node anterior;

        Node(String valor) {
            this.valor = valor;
        }
    }

    public static void main(String[] args) {
        ArrayList<Node> acessoDireto = new ArrayList<>();

        // Criar nós manualmente
        Node joao = new Node("João");
        Node maria = new Node("Maria");
        Node ana = new Node("Ana");

        // Encadeando os nós
        joao.proximo = maria;
        maria.anterior = joao;
        maria.proximo = ana;
        ana.anterior = maria;

        // Adicionando no array para acesso por índice
        acessoDireto.add(joao);
        acessoDireto.add(maria);
        acessoDireto.add(ana);

        // Acesso por índice
        System.out.println("Acesso via índice (ArrayList):");
        for (int i = 0; i < acessoDireto.size(); i++) {
            System.out.println("Posição " + i + ": " + acessoDireto.get(i).valor);
        }

        // Percorrendo como lista ligada
        System.out.println("\n Acesso encadeado (LinkedList):");
        Node atual = acessoDireto.get(0); // começa do primeiro nó

        while (atual != null) {
            System.out.println("Valor: " + atual.valor);
            atual = atual.proximo;
        }
    }
}
