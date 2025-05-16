/*
 Descrição do Problema – Geração Recursiva de Lista com Números Aleatórios Não Repetidos 
 Implemente um programa que utilize recursão para preencher uma lista 
 com valores inteiros aleatórios entre 0 e 19, sem repetições.

O programa deve:
Criar uma lista (ArrayList<Integer>) de números inteiros.
Preencher essa lista de forma recursiva, com até N tentativas, adicionando somente valores não repetidos.
Exibir o conteúdo final da lista ao término da recursão.

⚙️ Detalhes importantes:
A função popularR() é responsável por:
Gerar um número aleatório entre 0 e 19.
Verificar se esse número já está presente na lista.
Adicioná-lo se ainda não estiver.
Repetir o processo recursivamente até que o número de tentativas se esgote.

A função exibir() simplesmente imprime os valores da lista na tela.
 * 
*/

package exercicios_ufn.aula10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RecurssaoArray {

    public static void popularR(ArrayList lista, int total) {

        Random valorR = new Random();
        int valRand = valorR.nextInt(20);

        if (lista.size() == total) {
            return;
        }
        if (!lista.contains(valRand)) {
            System.out.println("valor :" + valRand);
            lista.add(valRand);
        } else {
            System.out.println("Repetido não add : " + valRand);
        }
        popularR(lista, total);

    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scannerTeclado = new Scanner(System.in);

        System.out.println("digite o tamanho da lista:");
        int total = scannerTeclado.nextInt();
        scannerTeclado.nextLine();

        popularR(lista, total);
        // exibir();
        for (int l : lista) {
            System.out.println("numeros: " + l);
        }

    }

}
