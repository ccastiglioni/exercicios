package exercicios_ufn.aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Aluno {
  private String nome;
  private String email;
  
  public Aluno( String email, String nome) {
      this.email = email;
      this.nome = nome;
  }
  
  @Override
  public String toString() {
      return "Aluno [email=" + email + ", nome=" + nome + "]";
  }
}

public class Nome {
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
          //System.out.println( "length:   ----" + vetorNome.length );
        }while(vetorNome.length  >2 ) ; 
        
        for (int i = 0; i < vetorNome.length; i++) {
           // System.out.println(vetorNome[i]);
            email = vetorNome[0] + "." + vetorNome[vetorNome.length-1] +"@ufn.com.br";
            alunos.add(new Aluno(email,nomeCompleto));
            //System.out.println(vetorNome[0] + "." + vetorNome[vetorNome.length-1] +"@ufn.com.br");
        }

      

        teclado.close();
    }
}
