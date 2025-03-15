package exercicios_ufn.aula2;

public class Violao {
    private int id;  
    private int qtdCordas;
    private String tipo;
    private double preco;

    public Violao(int id, int qtdCordas, String tipo, double preco) {
        this.id = id;
        this.qtdCordas = qtdCordas;
        this.tipo = tipo;
        this.preco = preco;
    }
 
    public int getId() {
        return id;
    }

    public int getQtdCordas() {
        return qtdCordas;
    }

    public void setQtdCordas(int qtdCordas) {
        this.qtdCordas = qtdCordas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Violão: " + tipo + " | ID: " + id + " | Cordas: " + qtdCordas + " | Preço: R$ " + preco;
    }
}
