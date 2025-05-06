/* Encontrar a primeira e a última ocorrência de um número em um vetor (recursivamente)
🧠 Explicação:
Imagine um vetor como [3, 7, 2, 7, 4, 7, 9]

Queremos:
Saber onde aparece o número 7 pela primeira vez E onde aparece pela última vez

Usando recursão:
Durante o empilhamento: verificamos da esquerda pra direita → primeira ocorrência
Durante o desempilhamento: voltamos da direita pra esquerda → última ocorrência
*/
package exercicios_ufn.aula10;

public class Encontrar {

    public static void encontrarOcorrencias(int[] vetor, int i, int alvo, int[] resultado) {
        if (i == vetor.length) {
            System.out.println("Valor do Tamanho do Array: " + i);
            return; // fim do vetor
        }

        // Empilhamento: detecta a primeira ocorrência
        if (vetor[i] == alvo && resultado[0] == -1) {
            resultado[0] = i; // primeira ocorrência
        }

        encontrarOcorrencias(vetor, i + 1, alvo, resultado);

        // Desempilhamento: detecta a última ocorrência
        System.out.println("Desempilha: " + i);
        if (vetor[i] == alvo && resultado[1] == -1) {
            resultado[1] = i; // última ocorrência (detecta na volta)
        }
    }

    public static void main(String[] args) {
        int[] vetor = { 0, 3, 7, 2, 7, 4, 7, 9, 5 };
        int alvo = 7;
        int[] resultado = { -1, -1 }; // índice 0 = primeira, índice 1 = última

        encontrarOcorrencias(vetor, 0, alvo, resultado);

        System.out.println("Primeira ocorrência de " + alvo + ": " + resultado[0]);
        System.out.println("Última ocorrência de " + alvo + ": " + resultado[1]);
    }

}

/*
 * Como é que o resultado recebe os valores se a função encontrarOcorrencias()
 * não tem return???
 * Isso significa que quando você passa resultado para a função,
 * você está passando uma referência (um "ponteiro") para o mesmo array na
 * memória.
 */