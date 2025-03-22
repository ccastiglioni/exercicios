package exercicios_ufn.aula4;

import java.util.ArrayList;

public class ListaAlunos {
    public static void main(String[] args) {
        ArrayList<String> ProjetoDados = new ArrayList<>();
        ArrayList<String> EstruturaDados = new ArrayList<>();
        ArrayList<String> BancoDados = new ArrayList<>();
        ArrayList<ArrayList<String>> CienciaComputacao = new ArrayList<>(); // Lista de listas

        // Adicionando alunos nas disciplinas
        ProjetoDados.add("Cleber");
        ProjetoDados.add("Maria");
        ProjetoDados.add("Leandro");
        ProjetoDados.add("Marta");
        CienciaComputacao.add(ProjetoDados);
 
        EstruturaDados.add("Carlos");
        EstruturaDados.add("Cleber");
        EstruturaDados.add("Maria");
        EstruturaDados.add("Luiz");
        CienciaComputacao.add(EstruturaDados);
        
        BancoDados.add("Andrisa");
        BancoDados.add("Matheus");
        BancoDados.add("Cleber");
        CienciaComputacao.add(BancoDados);

        // Lista para armazenar alunos já contados
        ArrayList<String> alunosContados = new ArrayList<>();

        System.out.println("\nNúmero de disciplinas por aluno:");
        
        // Percorrer todas as disciplinas para contar as disciplinas de cada aluno
        for (ArrayList<String> listaDisciplina : CienciaComputacao) {
            for (String aluno : listaDisciplina) {
                // Verificar se o aluno já foi contado
                if (!alunosContados.contains(aluno)) {
                    int contador = 0;
                    // Percorrer novamente as disciplinas para contar as ocorrências do aluno
                    for (ArrayList<String> listaBusca : CienciaComputacao) {
                        if (listaBusca.contains(aluno)) {
                            contador++;
                        }
                    }
                    alunosContados.add(aluno);
                    System.out.println(aluno + " cursa " + contador + " disciplina(s).");
                }
            }
        }
    }
}
