/*Exercício: Cadastro e Cálculo de Médias com Vetores DINAMICOS
📌 Descrição:
Crie um programa em Java que leia os nomes e 3 notas de alunos de forma dinamica. 
Depois  armazene :
Os nomes dos alunos e mostre As notas E as médias calculadas
*/

package exercicios_gerados;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class exercicio_vetor_dinaminco {

    public static void main(String[] args) {

        Scanner tecladoIn = new Scanner(System.in);
        // String vetorAlunos[] = new String[n];
        Vector<String> vetorAlunos = new Vector<>();  // array unidimensional dinâmico

        // Double notas[][] = new Double[n][n];
        ArrayList<ArrayList<Double>> notas = new ArrayList<>();
        
        // Double medias[] = new Double[n];
        ArrayList<Double> medias = new ArrayList<>();
        
        while (true) {
          
          System.out.println("### Digite o nome do Aluno ou S para Sair ###");
          String nomeAluno = tecladoIn.nextLine();
          if (nomeAluno.equalsIgnoreCase("S")) {
            break;
          }
          vetorAlunos.add(nomeAluno);
           
            ArrayList<Double> notasAluno = new ArrayList<>();  // Double notasAluno[] = new Double[n]; 
            Double soma=0.0;
            for (int i = 0; i < 3; i++) {
                System.out.println("Digite a nota " + (i + 1) + " do Aluno " + nomeAluno);
                Double num = tecladoIn.nextDouble();
                tecladoIn.nextLine();
                soma +=num;
                notasAluno.add(num); // add as notas de cada aluno
            }
            Double media = soma/3;
            notas.add(notasAluno); // array dentro do array
            medias.add(media);
        }

        /// MOSTRAR:
         for (int i = 0; i < notas.size(); i++) {
            System.out.println("notas: " + notas.get(i)  );
         }
    }

}
