/*Exercício: Cadastro e Cálculo de Médias com Vetores
📌 Descrição:
Crie um programa em Java que leia os nomes e 3 notas de 5 alunos. numa string armazene o nome da Escola
Depois Utilize vetores fixos para armazenar os alunos:
Os nomes dos alunos
As notas E as médias calculadas
*/

package exercicios_gerados;

import java.util.Scanner;

public class exercicio_vetor_fixo {

    public static void main(String[] args) {

        Scanner tecladoIn = new Scanner(System.in);
        String vetorAlunos[] = new String[5];
        Integer notas[][]    = new Integer[5][3];
        Double medias[] = new Double[5];

        System.out.println("Digite o nome Da escola");
        String nomeEscola = tecladoIn.nextLine();

        for (int i = 0; i < vetorAlunos.length; i++) {
            System.out.println("Digite o nome do Aluno " + (i+1));
            vetorAlunos[i] = tecladoIn.nextLine();
        } 

        for (int i = 0; i < vetorAlunos.length; i++) {
            for (int j = 0; j < 3; j++) {
                    System.out.println("Adicione a Nota: "+(j+1)+" do Aluno "+ vetorAlunos[i]);
                    notas[i][j] = tecladoIn.nextInt();
            }
        }

        for (int i = 0; i < vetorAlunos.length; i++) {
            int soma = 0; 
            for (int j = 0; j < 3; j++) {
               soma += notas[i][j]; 
            }
            medias[i] = soma/3.0;
        }

        System.out.println("\n========== BOLETIM ==========");
        System.out.println("Escola: " + nomeEscola + "\n");

        for (int i = 0; i < vetorAlunos.length; i++) {
            System.out.printf("Aluno: %-15s Média: %.2f\n", vetorAlunos[i], medias[i]);

        }
        tecladoIn.close();
        
    }

}
