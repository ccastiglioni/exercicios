/*
 Ao usarmos listas de objetos com controle de duplicidade,
  precisamos reescrever o métodos equals() da classe que estamos implementando. 
  Imagine uma classe Turma, em que há os atributos nome, cpf, dataNascimento. 
  A partir daí, implemente a classe e reescreva o método equals() 
  que use o atributo cpf com identficador (chave primária) da classe.
 */
package exercicios_ufn.aula7;

public class Turma {
  
   static class EscolaTurma  {
        String nome;
        int cpf;
        String dataNascimento;

        public EscolaTurma(int cpf, String nome, String dataNascimento) {
            this.cpf = cpf;
            this.nome = nome;
            this.dataNascimento = dataNascimento;
        }

        @Override
        public int hashCode() {
          final int prime = 31;
          int result = 1;
          result = prime * result + cpf;
          return result;
        }

        @Override
        public boolean equals(Object obj) {
          if (this == obj)
            return true;
          if (obj == null)
            return false;
          if (getClass() != obj.getClass())
            return false;
          EscolaTurma other = (EscolaTurma) obj;
          if (cpf != other.cpf)
            return false;
          return true;
        }

    }

    public static void main(String[] args) {

        ArrayList<EscolaTurma> arrTurma = new ArrayList<>();
        EscolaTurma ObjTurma = new EscolaTurma( cpf, nome, dataNascimento);
        arrTurma.add(ObjTurma);

        EscolaTurma Objprocurar = new Ponto(cpf);
        if (arrTurma.contains(Objprocurar))
          System.out.println("\ CPF Encontrados!! :)\n");
        else
          System.out.println("\nNÃO Encontrou \n");

}
