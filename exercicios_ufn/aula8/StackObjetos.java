/*
 * Exercício: Pilha de Solicitações de Suporte Técnico Você deve criar um programa em Java que
 * simule a fila de atendimento de chamados técnicos de uma empresa.
 * 
 * Cada Solicitação será um objeto que deve conter: Número da Solicitação (int) Nome do Cliente
 * (String) Problema Descrito (String)
 * 
 * Prioridade (int — 1: Alta, 2: Média, 3: Baixa)
 */
package exercicios_ufn.aula8;

import java.util.Scanner;
import java.util.Stack;

public class StackObjetos {

    public static void main(String[] args) {
        Scanner tecladoScan = new Scanner(System.in);
        int condition;
        Stack<Solicitacao> pilhaSolicitacoes = new Stack<>(); // pilha de objetos

        do {
            System.out.println("1 - Abrir nova solicitação\n" + "2 - Atender solicitação\n" + //
                    "3 - Ver solicitação atual\n" + "4 - Exibir todas as solicitações\n"
                    + "5 - Sair");

            condition = tecladoScan.nextInt();
            tecladoScan.nextLine();

            switch (condition) {
                case 1:
                    System.out.println("Qual seu nome?");
                    String nome = tecladoScan.nextLine();

                    System.out.println("Descrição da solicitação?");
                    String desc = tecladoScan.nextLine();

                    System.out.println("Prioridade de 1 até 3 ?");
                    int prioridade = tecladoScan.nextInt();
                    tecladoScan.nextLine();
                    // Solicitacao objSolict = new Solicitacao(prioridade, desc, nome);
                    Solicitacao objSolicit = new Solicitacao(0, "", ""); // cria vazio com valores

                    objSolicit.setNome(nome);
                    objSolicit.setDescricao(desc);
                    objSolicit.setPrioridade(prioridade);

                    pilhaSolicitacoes.push(objSolicit);

                    break;
                case 2:
                    System.out.println("Atendendo agora ..");
                    if (pilhaSolicitacoes.isEmpty()) {
                        System.out.println("Nenhuma solicitação para atender.");
                    } else {

                        Solicitacao ObjTemp = null;
                        int Keymaior_p = -1;
                        for (int i = 0; i < pilhaSolicitacoes.size(); i++) {
                            if (ObjTemp == null || pilhaSolicitacoes.get(i).getPrioridade() < ObjTemp.getPrioridade()) {
                                ObjTemp = pilhaSolicitacoes.get(i);
                                Keymaior_p = i;
                            }
                        }

                        if (Keymaior_p > -1) {
                            System.out.println(ObjTemp.getNome() + " Atendida!");
                            pilhaSolicitacoes.remove(Keymaior_p);
                        }
                    }
                    break;

                case 3:
                    if (pilhaSolicitacoes.isEmpty()) {
                        System.out.println("Nenhuma solicitação na fila!");
                    } else {
                        System.out.println("Atual da pilha: " + pilhaSolicitacoes.peek());
                    }
                    break;
                case 4:
                    if (pilhaSolicitacoes.isEmpty()) {
                        System.out.println("pilha de objetos vazia!");
                    } else {
                        // for (Solicitacao p_itera : pilhaSolicitacoes) System.out.println(p_itera);
                        for (int i = pilhaSolicitacoes.size() - 1; i >= 0; i--) {
                            System.out.println(pilhaSolicitacoes.get(i));
                        }
                    }

                    break;

                default:
                    System.out.println("Opção invalida!!");
                    break;
            }

        } while (condition < 5);

    }
}
