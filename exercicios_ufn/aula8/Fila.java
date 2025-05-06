/*
Enunciado – Simulação de Atendimento com Filas Prioritárias
Implemente um programa em Java que simule o funcionamento de duas filas de atendimento em uma empresa:
 uma para processos urgentes e outra para processos normais.

Cada processo deve ser representado por um objeto contendo:
Um identificador numérico (id)
Uma descrição (descricao)

O programa deve:
Gerar 1000 números aleatórios entre 0 e 199.

A cada número gerado:
Se for 0, remover (atender) o primeiro processo da fila urgente.
Se for 100, remover (atender) o primeiro processo da fila normal.
Se estiver entre 1 e 99, adicionar um novo processo urgente (caso ainda não esteja na fila).
Se estiver entre 101 e 199, adicionar um novo processo normal (caso ainda não esteja na fila).

Exibir no final:
A quantidade de processos urgentes não atendidos, com a lista completa.
A quantidade de processos normais não atendidos, com a lista completa.

Utilize as classes Queue e LinkedList para implementar as filas.*/
package exercicios_ufn.aula8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class ProcessoFila {
    int id;
    String descricao;

    public ProcessoFila(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Processo [id=" + id + ", descricao=" + descricao + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProcessoFila other = (ProcessoFila) obj;
        if (id != other.id)
            return false;
        return true;
    }
}

public class Fila {
    public static void main(String[] args) {
        Queue<ProcessoFila> filaNormal = new LinkedList<>();
        Queue<ProcessoFila> filaUrgente = new LinkedList<>();

        Random gerador = new Random();
        int numeroProcesso;
        ProcessoFila processoAtendido;
        for (int i = 0; i < 1000; i++) {
            numeroProcesso = gerador.nextInt(200); /// random : 0 a 200
            if (numeroProcesso == 0) {
                if (!filaUrgente.isEmpty()) {
                    processoAtendido = filaUrgente.poll();
                    System.out.println("ATENÇÃO...Processo urgente atendido: " + processoAtendido.id);
                }
            } else if (numeroProcesso == 100) {
                if (!filaNormal.isEmpty()) {
                    processoAtendido = filaNormal.poll();
                    System.out.println("ATENÇÃO...Processo normal atendido: " + processoAtendido.id);
                }
            } else if (numeroProcesso > 0 && numeroProcesso < 100) {
                ProcessoFila tmp = new ProcessoFila(numeroProcesso, "processo urgente");
                if (!filaUrgente.contains(tmp)) {
                    System.out.println("Processo urgente inserido..." + tmp.id);
                    filaUrgente.add(tmp);
                }
            } else {
                ProcessoFila tmp = new ProcessoFila(numeroProcesso, "processo normal");
                if (!filaNormal.contains(tmp)) {
                    System.out.println("Processo normal inserido..." + tmp.id);
                    filaNormal.add(tmp);
                }
            }
        }

        System.out.println("Processos urgentes não atendidos..." + filaUrgente.size());
        for (ProcessoFila p : filaUrgente) {
            System.out.println(p);
        }

        System.out.println("Processos normais não atendidos..." + filaNormal.size());
        for (ProcessoFila p : filaNormal) {
            System.out.println(p);
        }

    }
}
