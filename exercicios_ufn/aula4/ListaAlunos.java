package exercicios_ufn.aula4;
import java.util.ArrayList;

public class ListaAlunos {
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

        ArrayList<String> alunosContados = new ArrayList<>();

        System.out.println("Listas na estrutura CienciaComputacao:");
        
        for (ArrayList<String> listaDisciplina : CienciaComputacao) {
            for (String aluno : listaDisciplina) {
                String nomeTmp = aluno;

                if (!alunosContados.contains(nomeTmp)) {
                    int contador = 0;
                    alunosContados.add(nomeTmp);

                    for (ArrayList<String> d : CienciaComputacao) {
                        for (String a : d) {
                            if (nomeTmp.equals(a)) {
                                contador++;
                            }
                        }
                    }
                    System.out.println("Aluno: " + nomeTmp + " está em " + contador + " disciplinas.");
                }
            }
        }
    }
}
