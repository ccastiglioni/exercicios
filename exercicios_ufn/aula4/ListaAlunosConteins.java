//projetoBancoDeDados [andrisa, matheus] - disciplina
//estruturasDeDados [andrisa, matheus] - disciplina
//comunicacaoDeDados [andrisa] - disciplina

//Criar n listas representando as disciplinas do curso CC
//para cada lista, colocar alguns nomes de alunos
//criar a lista cienciaComputacao e adicionar todas as listas de disciplinas.
//mostrar o nome do aluno e quantas disciplinas ele cursa.

package exercicios_ufn.aula4;
import java.util.ArrayList;

public class ListaAlunosConteins {
    public static void main(String[] args) {
        ArrayList<String> ProjetoDados = new ArrayList<>();
        ArrayList<String> EstruturaDados = new ArrayList<>();
        ArrayList<ArrayList<String>> CienciaComputacao = new ArrayList<>(); // Lista de listas
        
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
        
        ArrayList<String> alunosContados  = new ArrayList<>();

        System.out.println("Listas na estrutura CienciaComputacao:");
        for (ArrayList<String> listaDisciplina : CienciaComputacao) {
          for (String aluno : listaDisciplina) {

              if (!alunosContados.contains(aluno)) {
                  int contador = 0;           
                  for (ArrayList<String> countLista : CienciaComputacao) {
                      if (countLista.contains(aluno)) {
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
