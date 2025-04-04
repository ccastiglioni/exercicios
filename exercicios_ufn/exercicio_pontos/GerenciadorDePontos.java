/* 
04/04/2025 - AVALIAÇÃO
Fazer um programa que trage pontos em um plano cartesiano (x,y). 
Os pontos devem estar armazenados em um arquivo texto, um ponto abaixo do outro, em que x e y estão separados por ';'. 
O programa deve ler o arquivo e popular seus dados em uma lista encadeada dinamicamente. 
O usuário por sua vez, deve ser capaz de exibir esses dados e procurar por um ponto em especial.
*/ 
package exercicios_ufn.exercicio_pontos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// Classe para representar um ponto (x, y)
class PontoCartesiano {
    int x, y;

    public PontoCartesiano(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Ponto outro) {
        return this.x == outro.x && this.y == outro.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// Nó da lista encadeada
class No {
    PontoCartesiano ponto;
    No proximo;

    public No(PontoCartesiano ponto) {
        this.ponto = ponto;
        this.proximo = null;
    }
}

// Lista encadeada de pontos
class ListaEncadeada {
    No inicio;

    public void inserir(PontoCartesiano ponto) {
        No novo = new No(ponto);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.ponto);
            atual = atual.proximo;
        }
    }

    public boolean procurar(PontoCartesiano ponto) {
        No atual = inicio;
        while (atual != null) {
            if (atual.ponto.equals(ponto)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
}

public class GerenciadorDePontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();

        // Leitura do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader("/home/cleber/Build/estrutura_dados/exercicios_ufn/exercicio_pontos/pontos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                int x = Integer.parseInt(partes[0].trim());
                int y = Integer.parseInt(partes[1].trim());
                lista.inserir(new PontoCartesiano(x, y));
            }
            System.out.println("Arquivo lido com sucesso!\n");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        // Menu para o usuário
        int opcao;
        do {
            System.out.println("1 - Exibir pontos");
            System.out.println("2 - Procurar ponto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nPontos armazenados:");
                    lista.exibir();
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Digite x: ");
                    int x = scanner.nextInt();
                    System.out.print("Digite y: ");
                    int y = scanner.nextInt();
                    PontoCartesiano procurado = new PontoCartesiano(x, y);
                    if (lista.procurar(procurado)) {
                        System.out.println("Ponto encontrado!\n");
                    } else {
                        System.out.println("Ponto não encontrado.\n");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida.\n");
            }
        } while (opcao != 0);

        scanner.close();
    }
}






