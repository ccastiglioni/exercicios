package exercicios_ufn.aula8;

public class Solicitacao {

    int prioridade;
    String descricao;
    String nome;

    public Solicitacao(int prioridade, String descricao, String nome) {
        this.prioridade = prioridade;
        this.descricao = descricao;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Solicitação{" +
                "Nome='" + nome + '\'' +
                ", Problema='" + descricao + '\'' +
                ", Prioridade=" + prioridade +
                '}';
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
