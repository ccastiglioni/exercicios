package exercicios_ufn.aula5;

public class Aluno {
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
