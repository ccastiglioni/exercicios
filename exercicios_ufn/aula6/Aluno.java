import java.util.Objects;

public class Aluno {

    public String nome;
    public int matricula;
    public String email;

    public Aluno(int matricula, String nome) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = this.gerarEmail();
    }

    public String gerarEmail() {
        String[] vetorNomes = this.nome.toLowerCase().split(" ");
        return vetorNomes[0] + "." + vetorNomes[vetorNomes.length - 1] + "@ufn.edu.br";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Aluno aluno = (Aluno) obj;
        return Objects.equals(this.email, aluno.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email);
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + ", Nome: " + nome + ", Email: " + email;
    }

 
}