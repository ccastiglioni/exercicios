package exercicios_ufn.aula4;

import java.util.ArrayList;

public class ListaAlunosDinamico {
    public static void main(String[] args) {
        // Criando a lista de listas para armazenar os alunos
        ArrayList<ArrayList<String>> CienciaComputacao = new ArrayList<>();

        // Adicionando listas vazias manualmente para os índices 0 e 1
        CienciaComputacao.add(new ArrayList<String>()); // Índice 0
        CienciaComputacao.add(new ArrayList<String>()); // Índice 1

        // Adicionando alunos à disciplina no índice 0
        CienciaComputacao.get(0).add("Cleber");
        CienciaComputacao.get(0).add("Mara");
        CienciaComputacao.get(0).add("Sandra");

        // Adicionando alunos à disciplina no índice 1
        CienciaComputacao.get(1).add("Cleber");
        CienciaComputacao.get(1).add("Maria");
        CienciaComputacao.get(1).add("Leandro");
        CienciaComputacao.get(1).add("Marta");
        CienciaComputacao.get(1).add("Pedro");

        // Lista auxiliar para contar alunos
        ArrayList<String> alunosContados = new ArrayList<>();

        System.out.println("Listas na estrutura CienciaComputacao:");

        // Contagem e exibição de quantas disciplinas cada aluno está matriculado
        for (ArrayList<String> listaDisciplina : CienciaComputacao) {
            for (String aluno : listaDisciplina) {
                if (!alunosContados.contains(aluno)) {
                    int contador = 0;
                    alunosContados.add(aluno);

                    // Verifica em quantas disciplinas o aluno está presente
                    for (ArrayList<String> d : CienciaComputacao) {
                        for (String a : d) {
                            if (aluno.equals(a)) {
                                contador++;
                            }
                        }
                    }
                    System.out.println("Aluno: " + aluno + " está em " + contador + " disciplinas.");
                }
            }
        }
    }
}
