import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Aluno obj_temp_memoria;
        String nome;
        int matricula = 1;
        String opcao;

        while (true) {

            System.out.println("Digite o nome do aluno: ");
            nome = scanner.nextLine().toUpperCase();
            obj_temp_memoria = new Aluno(matricula, nome);

            if (alunos.contains(obj_temp_memoria)) {
                System.out.println("Aluno com este email ja cadastrado!");
                System.gc(); // libera memoria  
            } else {
                alunos.add(obj_temp_memoria);
                System.out.println("Aluno cadastrado com sucesso! Matricula: " + matricula + " Email: " + obj_temp_memoria.email);
                matricula++;
            }

            System.out.println("CONTINUA ? (S/N)");
            opcao = scanner.nextLine();

            if (opcao.equals("n"))
                break;
        }

        alunos.sort((aluno1, aluno2)->aluno1.nome.compareTo(aluno2.nome));

        System.out.println("Relação de alunos:");
        for (Aluno objAluno : alunos) {
            System.out.println(objAluno);

          /* 
           public class PrintStream {
           public void println(Object x) {
               String s = String.valueOf(x);
               synchronized(this) {
                  this.print(s);
                  this.newLine();
               }
            }
            public final class String {
              public static String valueOf(Object obj) {
                return obj == null ? "null" : obj.toString();
                }
            }   
            public String toString() {
              return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
            }
        */
        }
    }
}
