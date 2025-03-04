package exercicios_ufn.aula2;

public class Violao {
  private int qtdCordas;
  private String tipo;
  private double preco;

  public Violao(int qtd, String tipo, double preco) {
      this.qtdCordas = qtd;
      this.tipo = tipo;
      this.preco = preco;
  }

  public int getQtdCordas() {
      return qtdCordas;
  }

  public void setQtdEstoque(int qtd) {
      this.qtdCordas = qtd;
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

  // Sobrescrevendo o método toString() para exibir os dados do objeto de forma legível
  @Override
  public String toString() {
      return "Violão: " + tipo + " | Estoque: " + qtdCordas + " | Preço: R$ " + preco;
  }
  
}
