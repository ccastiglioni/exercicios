package exercicios_ufn.aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        String nomeCompleto;
        String email;
        String[] vetorNome;

        do {
            System.out.println("Digite seu nome completo:");
            nomeCompleto = teclado.nextLine();
            nomeCompleto = nomeCompleto.toUpperCase();
            vetorNome = nomeCompleto.split(" ");
        } while (vetorNome.length > 2);

        for (int i = 0; i < vetorNome.length; i++) {
            email = vetorNome[0] + "." + vetorNome[vetorNome.length - 1] + "@ufn.com.br";
            alunos.add(new Aluno(email, nomeCompleto));
        }
        teclado.close();
    }
    
}

  class Aluno {
  private String nome;
  private String email;
  private int id;

  // Construtor para ListaObjeto (int, String)
  public Aluno(int id, String nome) {
      this.id = id;
      this.nome = nome;
  }

  // Construtor para Name.java (String, String)
  public Aluno(String email, String nome) {
      this.email = email;
      this.nome = nome;
  }

  @Override
  public String toString() {
      return "Aluno [id=" + id + ", email=" + email + ", nome=" + nome + "]";
  }
}