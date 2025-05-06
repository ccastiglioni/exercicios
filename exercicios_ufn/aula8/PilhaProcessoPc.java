package exercicios_ufn.aula8;

import java.util.Scanner;
import java.util.Stack;

/*
Crie um programa em Java que utilize usando pilha (Stack) 
para armazenar objetos da classe Processo, contendo um id e uma descrição. O programa deve:
    Ler o numero de processo despois a descrições do usuário;
    Criar um processo com id iniciado em 1 para cada descrição;
    Adicionar o processo na pilha somente se ele ainda não existir (usando contains);
    Implemente a classe Processo sobrescrevendo toString() e equals() para que a comparação seja feita pelo id.
*/
class Processos {
    int id;
    String descricao;

    public Processos(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Processos [id=" + id + ", descricao=" + descricao + ", toString()=" + super.toString() + "]";
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public int hashCode() {
        return descricao.toLowerCase().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Processos other = (Processos) obj;
        return this.descricao.equalsIgnoreCase(other.descricao);
    }

}

public class PilhaProcessoPc {

    public static void main(String[] args) {

        Stack<Processos> pilhaPc = new Stack<>();
        int id = 1;
        Scanner TecladoScanIn = new Scanner(System.in);
        System.out.println("Quantos processo deve ter ?");
        int condition = TecladoScanIn.nextInt();
        TecladoScanIn.nextLine();

        for (int i = 0; i < condition; i++) {
            System.out.println("Descricao do Processo " + (i + 1) + ":");
            String descricao_p = TecladoScanIn.nextLine();

            Processos objProcess = new Processos(id, descricao_p);

            if (!pilhaPc.contains(objProcess)) {
                System.out.println("Novo ID: " + id);
                pilhaPc.push(objProcess);
                id++;
            } else {
                System.out.println("Processo já existe na Pilha! ID: " + id);
            }
        }

        for (Processos iterable_element : pilhaPc) {
            System.out.println("Processo:");
            System.out.println(iterable_element);
        }

    }

}
