package exercicios_ufn.aula9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class principal {

    public static void main(String[] args) {
        Random gerador = new Random();
        int quantidadeProcessos = 10000;
        int numeroProcessoGerado;

        Queue<Processo> filaPrioritaria = new LinkedList<>();
        Queue<Processo> filaNormal = new LinkedList<>();

        // rotina para gerar 10000 processos entre 1 e 1000
        for (int i = 0; i < quantidadeProcessos; i++) {

            // Gera número entre 1 e 1000
            numeroProcessoGerado = gerador.nextInt(1000) + 1;
            // numeroProcessoGerado = gerador.nextInt(0, 1001);

            switch (numeroProcessoGerado) {
                case 0:
                    // rotina para retirar da fila prioritaria
                    Processo processoAtendido_p = filaPrioritaria.poll();
                    System.out.println("ATENDENDO: " + processoAtendido_p);
                    break;
                case 500:
                    // rotina para retirar da fila normal
                    Processo processoAtendido_n = filaPrioritaria.poll();
                    System.out.println("ATENDENDO: " + processoAtendido_n);
                    break;
                default:
                    // rotina para inserir processo na fila de prioridade
                    if (numeroProcessoGerado < 500) {

                        Processo processoTmp = new Processo(numeroProcessoGerado, "Processo de alta prioridade Add!");

                        if (!filaPrioritaria.contains(processoTmp)) { // para não adicionar o mesmo Processo!
                            filaPrioritaria.offer(processoTmp); // ou .add()
                            System.out.println(processoTmp);
                        }
                    } else {
                        // rotina para inserir processo na fila normal
                        Processo processoTmp = new Processo(numeroProcessoGerado, "Processo de prioridade Baixa Add!");
                        if (!filaNormal.contains(processoTmp)) {
                            filaNormal.offer(processoTmp); // ou .add()
                            System.out.println(processoTmp);
                        }
                    }
                    break;
            }
        }
    }
}
