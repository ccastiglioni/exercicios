/*
Em sua linguagem de preferência, crie um programa (usando funções/métodos) que:
  - preencha N nomes de equipes de futebol, obrigatóriamente em maiúsculo. 
  Esses nomes devem ser armazenados em um dicionário que se possa controlar duplicados.
  - exiba os nomes das equipes cadastradas
  - exiba a quantidade de equipes cadastradas
*/

package exercicios_ufn.aula7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EquipeFutebol {

    public static void main(String[] args) {
        Scanner tecladoIn = new Scanner(System.in);

        Map<Integer, String> time = new HashMap<>();
        /*
         * - Map<Integer, String> time = new TreeMap<>(); o TreeMap Garante organizar
         * AUTOMATICAMENTE pela Chave!
         * 
         * - Map<Integer, String> time = new LinkedHashMap<>(); a Estrutura
         * LinkedHashMap
         * Garante a ORDEM de inserção!
         */

        int i = 0;
        while (true) {
            System.out.println("Digite o nome da Equipe " + (i + 1) + " ou S para Sair:");
            String nome = tecladoIn.nextLine().toUpperCase();
            if (nome.equalsIgnoreCase("S")) {
                break;
            }

            if (!time.containsValue(nome)) {
                time.put(i, nome);
            } else {
                System.out.println("\n Time ja cadastrado!");
                i--;
            }
            i++;
        }
        System.out.println("\n Lista de Equipes Cadastradas:");
        System.out.println("Total de equipes: " + time.size());
        System.out.println("--------------------------------");

        for (Map.Entry<Integer, String> tm : time.entrySet()) {
            System.out.println("Time: " + tm.getValue());
            System.out.println("ID: " + tm.getKey());
            System.out.println("-----------------------------");
        }

    }

}
