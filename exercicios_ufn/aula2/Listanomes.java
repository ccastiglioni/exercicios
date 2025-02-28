package exercicios_ufn.aula2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Listanomes {
  
      public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);
          ArrayList<String> Arr_nomes = new ArrayList<>();
          
          // Solicitar a quantidade de usuários
          System.out.print("Digite quantos usuários deseja cadastrar: ");
          int numeroUsers = scanner.nextInt();
          scanner.nextLine();  
  
          // Loop para cadastrar Arr_nomes
          for (int i = 0; i < numeroUsers; i++) {
              System.out.print("Digite o nome do usuário " + (i + 1) + ": ");
              String nome = scanner.nextLine().trim().toUpperCase();
              
              if (!Arr_nomes.contains(nome)) {
                  Arr_nomes.add(nome);
              } else {
                  System.out.println("Nome já cadastrado! Digite um nome diferente.");
                  i--; 
              }
          }
  
          Collections.sort(Arr_nomes); // Ordenar a lista de Arr_nomes
          System.out.println("\n Lista de usuários cadastrados (ordenada):");
          for (String nome : Arr_nomes) {
              System.out.println(nome);
          }
  
          // Permitir que o usuário pesquise um nome para excluir
          System.out.print("\nDigite um nome para excluir: ");
          String nomeParaExcluir = scanner.nextLine().trim().toUpperCase();
  
          if (Arr_nomes.contains(nomeParaExcluir)) {
              Arr_nomes.remove(nomeParaExcluir);
              System.out.println("Nome removido com sucesso!");
          } else {
              System.out.println("Nome não encontrado na lista.");
          }
  
          System.out.println("\n Lista atualizada:"); // Exibir a lista final após exclusão
          for (String nome : Arr_nomes) {
              System.out.println(nome);
          }
  
          scanner.close(); // Fecha o scanner 
      }
}
