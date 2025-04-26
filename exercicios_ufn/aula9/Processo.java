package exercicios_ufn.aula9;

public class Processo {
    private int id;
    private String descricao;

    public Processo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Processo{id=" + id + ", descricao='" + descricao + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Processo processo = (Processo) obj;

        return id == processo.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
