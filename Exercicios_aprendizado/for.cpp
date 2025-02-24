#include <iostream>
using namespace std;

int main() {
    int arr[] = {5, 10, 20, 30};  // Vetor ordenado
    int tamanho = sizeof(arr) / sizeof(arr[0]);  // Número de elementos no vetor
    int valor = 21;  // Novo valor a ser inserido
    int posicao = tamanho;  // Assume que o valor será inserido no final
    int anterior = -1;  // Armazena o índice anterior

    // Percorrer o vetor para encontrar a posição correta
    for (int i = 0; i < tamanho; i++) {
        if (valor < arr[i]) {
            posicao = i;  // Encontramos a posição correta
            break;
        }
        anterior = i;  // Atualiza o valor anterior
        cout << " " << valor << " < " << arr[i] << "\n"; 
        cout << "Posição atual: " << posicao << "\n"; 
    }

    // Exibir a posição onde o número deve ser inserido 
    if (posicao == 0) {
        cout << "O número " << valor << " deve ser inserido no Início." << endl;
    } else if (posicao < tamanho) {
        cout << "O número " << valor << " deve ser inserido antes da posição " << posicao << endl;
    } else {
        cout << "O número " << valor << " deve ser inserido no Final do vetor." << endl;
    }

    return 0;
}
