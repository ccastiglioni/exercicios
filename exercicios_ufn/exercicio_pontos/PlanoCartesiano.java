package exercicios_ufn.exercicio_pontos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
cd exercicios_ufn/exercicio_pontos 
exercicio_pontos  rm *.class
exercicio_pontos cd ~/Build/estrutura_dados
estrutura_dados javac exercicios_ufn/exercicio_pontos/*.java
*/
public class PlanoCartesiano {

  static class Ponto implements Comparable<Ponto> {
        int x;
        int y;
        public Ponto(int x, int y) {
           this.x = x;
           this.y = y;
        }
        @Override
        public String toString() {
          return "Ponto [x=" + x + ", y=" + y +"]";
        }
        @Override
        public int hashCode() {
          final int prime = 31;
          int result = 1;
          result = prime * result + x;
          result = prime * result + y;
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
          Ponto other = (Ponto) obj;
          if (x != other.x)
            return false;
          if (y != other.y)
            return false;
          return true;
        }   

        @Override
        public int compareTo(Ponto outro) {
          if (this.x != outro.x) {
            return Integer.compare(this.x, outro.x);
          } else {
            return Integer.compare(this.y, outro.y);
          }
        }
    }

    public static void main(String[] args) {

        ArrayList<Ponto> arrPonto = new ArrayList<>();
        Scanner tecladoIn = new Scanner(System.in);
      
        try (FileReader file = new FileReader("exercicios_ufn/exercicio_pontos/pontos.txt")) {
            BufferedReader buffr = new BufferedReader(file);
            String linha;
            while ( (linha = buffr.readLine()) != null) {
                
                String[] parte = linha.split(";");
                Ponto Objpontos = new Ponto(Integer.parseInt(parte[0]) , Integer.parseInt(parte[1]));
                arrPonto.add( Objpontos );
                
              }
            } catch (IOException e) {
              System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        String opcao="";
        do {
            System.out.println("L - Listar todos os pontos");
            System.out.println("P - Procurar ponto");
            System.out.println("O - Ordenar a lista");
            System.out.println("S - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = tecladoIn.nextLine();

            switch (opcao) {
              case "L":
                System.out.println("### Listagem ###");
                for (Ponto pt : arrPonto) {
                  System.out.println(pt);
                }         
              break;

              case "O":
                Collections.sort(arrPonto);
                System.out.println("### Listagem Ordenada  ###");
                for (Ponto pt : arrPonto) {
                  System.out.println(pt);
                }      
              break;   
              case "P":
                System.out.println("### Procurar Pontos  ###");
                System.out.println("Digite o X:");
                int x =tecladoIn.nextInt();
                System.out.println("Digite o Y:");
                int y =tecladoIn.nextInt();
                
                Ponto Objprocurar = new Ponto(x, y);
                if(arrPonto.contains(Objprocurar))
                  System.out.println("\nPontos Encontrados!! :)\n");
                else
                 System.out.println("\nNÃO Encontrou os ponto no array de Objetos!! :(\n");
              break;
              
              default:
                System.out.println("### Opção Invalida!  ###");
              break;
            }

        } while ( !opcao.equalsIgnoreCase("S") );
       
    }
}
