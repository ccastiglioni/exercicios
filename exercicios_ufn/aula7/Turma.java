/*
 Ao usarmos  Listas de Objetos  com controle de duplicidade,
  precisamos reescrever o métodos equals() da classe que estamos implementando. 
  Imagine uma classe Turma, em que há os atributos nome, cpf, dataNascimento. 
  A partir daí, implemente a classe e reescreva o método equals() 
  que use o atributo cpf com identficador (chave primária) da classe.
 */
package exercicios_ufn.aula7;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {

    static class EscolaTurma {
        String nome;
        int cpf;
        String dataNascimento;

        public EscolaTurma(int cpf, String nome, String dataNascimento) {
            this.cpf = cpf;
            this.nome = nome;
            this.dataNascimento = dataNascimento;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + cpf;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            EscolaTurma other = (EscolaTurma) obj;
            if (cpf != other.cpf)
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "EscolaTurma [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + " ]";
        }

    }

    public static void main(String[] args) {

        ArrayList<EscolaTurma> arrTurma = new ArrayList<>();
        Scanner tecladoInScan = new Scanner(System.in);

        System.out.println("Quantos Alunos quer cadastrar ?");
        int numAlunos = tecladoInScan.nextInt();
        tecladoInScan.nextLine();
        for (int index = 0; index < numAlunos; index++) {

            System.out.println("Digite o nome");
            String nomeAlunos = tecladoInScan.nextLine();

            System.out.println("Digite o Data de Nascimento:");
            String dataAlunos = tecladoInScan.nextLine();

            System.out.println("Digite o CPF:");
            int cpfAlunos = tecladoInScan.nextInt();
            tecladoInScan.nextLine();

            EscolaTurma ObjTurma = new EscolaTurma(cpfAlunos, nomeAlunos, dataAlunos);
            if (!arrTurma.contains(ObjTurma)) {
                arrTurma.add(ObjTurma);
            } else {
                System.out.println("Ops .. Aluno já cadastrado!");
                index--;
            }
        }

        for (EscolaTurma escolaTurma : arrTurma) {
            System.out.println(escolaTurma);
        }

    }
}
