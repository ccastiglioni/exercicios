package exercicios_ufn.aula4;

import java.util.ArrayList;

public class ListaAlunosArrFixo {
		public static void main(String[] args) {

				String[] ProjetoDados = new String[7];  
				String[] EstruturaDados = new String[7];
				String[] BancoDados = new String[7];
				String[][] CienciaComputacao = new String[3][7]; // MATRIZ : 3 linhas (disciplinas) x 7 colunas (alunos)
				ArrayList<String> AlunosContatos = new ArrayList<>();  

				ProjetoDados[0] = "Cleber";
				ProjetoDados[1] = "Maria";
				ProjetoDados[2] = "Adriano";

				EstruturaDados[0] = "Cleber";
				EstruturaDados[1] = "Maria";
				EstruturaDados[2] = "Carlos";

				BancoDados[0] = "Cleber";
				BancoDados[1] = "Luis";
				BancoDados[2] = "Alberti";
				BancoDados[3] = "Julia";
				BancoDados[4] = "Leandro";

				CienciaComputacao[0] =ProjetoDados;
				CienciaComputacao[1] =EstruturaDados;
				CienciaComputacao[2] =BancoDados;

				System.out.println("Lista de Alunos e Quantidade de Disciplinas:");
				for (int i = 0; i < CienciaComputacao.length; i++) {
					for (int j = 0; j < CienciaComputacao[i].length; j++) {
						if (CienciaComputacao[i][j] != null) {
							String nomeTMP = CienciaComputacao[i][j];
							
							if(!AlunosContatos.contains(nomeTMP)){
                int count = 0;
                
                for (int k = 0; k < CienciaComputacao.length; k++) {
                  for (int p = 0; p < CienciaComputacao[k].length; p++) {
                    if(CienciaComputacao[k][p] == nomeTMP){
                      count++;
                    }
                  }
                }
                // AlunosContatos.add(new String[]{nomeTMP, String.valueOf(count)});
                  AlunosContatos.add(nomeTMP);
									System.out.println(nomeTMP +"-"+ count);
							 }  
						}
					}
					//System.out.println("Disciplinas: " + Disciplinas[i] );
				}
				
				System.out.println(AlunosContatos);
				System.out.println("#### FIM #####");
	
		}
}
