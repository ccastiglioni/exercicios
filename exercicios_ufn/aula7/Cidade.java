
/*
 Em sua linguagem de preferência, crie um programa que manipule objetos cidades baseados na classe Cidade,
  contendo, nome da cidade e sigla do estado do Brasil. O controle de duplicidade deve ser via o nome da cidade. 
  O programa deve apresentar um pequeno Menu, em que o usuário possa:
    - cadastrar uma cidade em lista de cidades: nome completo em maiúsculo e a sigla em maiúsculo
    - listar as cidades cadastradas tendo como ordem de ordenação os nomes das cidades
    - pesquisar uma cidade por seu nome e mostrar o seu estado respectivo (no caso, sigla)
    - remover uma cidade, pesquisando-a por seu nome
    - finalizar o programa
 */

package exercicios_ufn.aula7;

import java.util.ArrayList;
import java.util.Scanner;

public class Cidade {

  static class CidadeRs  {
    String cidade;
    String rs;

    public CidadeRs(String cidade, String rs) {
        this.cidade= cidade;
        this.rs= rs;
    }

    public CidadeRs(String cidade) {
      this.cidade= cidade;
    }
    

    public String getRs() {
      return rs;
    }

    @Override
    public String toString() {
        return "Cidade: " + cidade + ", Estado:" + rs;
    }

  }

  public static void main(String[] args) {

    ArrayList<CidadeRs> arrCidadeRs = new ArrayList<>();
        Scanner tecladoIn = new Scanner(System.in);
     
          String city ="";
          String estado = "";
          String opcao = "";
        do {
            System.out.println("A - Adicionar Cidades");
            System.out.println("P - Procurar Por Cidade");
            System.out.println("L - lista das cidades");
            System.out.println("R - Remover cidade");
            System.out.println("S - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = tecladoIn.nextLine();

            switch (opcao) {
                case "A":
                    System.out.println("### Cadastro ###");
                    System.out.println("Digite Cidade:");
                    city = tecladoIn.nextLine().toUpperCase();

                    System.out.println("Digite o Estado:");
                    estado = tecladoIn.nextLine().toUpperCase();
                    CidadeRs Objcidade = new CidadeRs( city,estado);
                    arrCidadeRs.add(Objcidade);
                    break;

                case "R":
                System.out.println("### Remover cidade ###");

                System.out.println("Digite a cidade para remover:");
                city = tecladoIn.nextLine().toUpperCase();
                              
                CidadeRs objRemover = new CidadeRs(city);
                if (arrCidadeRs.remove(objRemover)) {
                    System.out.println("\n Cidade removido com sucesso!\n");
                } else {
                    System.out.println("\n Cidade não encontrado. Nada foi removido.\n");
                }
                break;

                case "L":
                    //Collections.sort(arrCidadeRs);
                    //arrCidadeRs.sort(null);
                    System.out.println("### Listagem  ###");
                    for (CidadeRs cd : arrCidadeRs) {
                        System.out.println(cd);
                    }
                    break;
                case "P":
                    System.out.println("### Procurar Cidade  ###");
                     System.out.println("Digite Cidade:");
                     city = tecladoIn.nextLine();
        
                    CidadeRs Objprocurar = new CidadeRs(city);
                    if (arrCidadeRs.contains(Objprocurar)){
                      System.out.println("\n Cidade Encontrados!! :)\n");
                      //System.out.println(" ESTADO: "+ arrCidadeRs.getRs() );
                    }
                    else{
                      System.out.println("\nNÃO Encontrou  :(\n");
                    }
                    break;

                default:
                    System.out.println("### Opção Invalida!  ###");
                break;
            }

        } while (!opcao.equalsIgnoreCase("S"));



    
  }  
}
