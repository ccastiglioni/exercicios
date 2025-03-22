package exercicios_ufn.aula4;
import java.util.ArrayList;
import java.util.HashMap;

public class ListaAlunosMap {
    public static void main(String[] args) {
        ArrayList<String> ProjetoDados = new ArrayList<>();
        ArrayList<String> EstruturaDados = new ArrayList<>();
        ArrayList<String> BancoDados = new ArrayList<>();
        ArrayList<ArrayList<String>> CienciaComputacao = new ArrayList<>(); // Lista de listas

        // Adicionando alunos às disciplinas
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

        BancoDados.add("Maria");
        BancoDados.add("Marta");
        BancoDados.add("João");
        CienciaComputacao.add(BancoDados);

        // Usando um HashMap para armazenar { Nome -> Quantidade }
        HashMap<String, Integer> alunosContados = new HashMap<>();

        System.out.println("TODA LISTA:" + CienciaComputacao);
        System.out.println("Listas na estrutura CienciaComputacao:");

        // Percorre todas as disciplinas e conta os alunos diretamente no HashMap
        for (ArrayList<String> listaDisciplina : CienciaComputacao) {
            for (String aluno : listaDisciplina) {
                // Se o aluno já está no HashMap, incrementamos
                alunosContados.put(aluno, alunosContados.getOrDefault(aluno, 0) + 1);
            }
        }

        // Convertendo HashMap para lista no formato [[Nome, Quantidade]]
        ArrayList<ArrayList<String>> listaFinal = new ArrayList<>();
        for (String nome : alunosContados.keySet()) {
            ArrayList<String> alunoInfo = new ArrayList<>();
            alunoInfo.add(nome);
            alunoInfo.add(String.valueOf(alunosContados.get(nome)));
            listaFinal.add(alunoInfo);
        }

        // Exibindo a lista final
        System.out.println("Lista de Alunos e Quantidade de Disciplinas:");
        System.out.println(listaFinal);
    }
}
