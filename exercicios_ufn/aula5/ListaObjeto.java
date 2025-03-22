package exercicios_ufn.aula5;

import java.util.ArrayList;
import java.util.List;

class Aluno {
    private int matricula;
    private String nome;
    
    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + "]";
    }
}

public class ListaObjeto {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        
        // Adiciona alunos com suas respectivas matrículas e nomes
        alunos.add(new Aluno(1, "João"));
        alunos.add(new Aluno(2, "Maria"));
        alunos.add(new Aluno(3, "Pedro"));
        
        // Exibe os alunos
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
