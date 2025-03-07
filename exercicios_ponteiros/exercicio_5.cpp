#include <iostream>
/*
Exercício: Criando e Manipulando um Array Dinâmico com Ponteiros
Crie um programa em C++ que:

1. Peça ao usuário para inserir o tamanho de um array de números inteiros.
2. Aloque dinamicamente memória para armazenar esses números.
3. Permita que o usuário insira os valores no array.
4. Implemente uma função chamada encontrarMaiorElemento, 
que receba um ponteiro para o array e seu tamanho, e retorne o endereço do maior valor no array.
5. No main(), exiba o maior valor e o seu endereço de memória.
6. Libere a memória alocada.
*/

using namespace std;

int *encontrarMaiorElemento(int* array_dnc , int tamanho_array){
 int *maior = array_dnc;

 cout << " Primeiro :" << *maior ;
 cout << " Segundo :" << *(maior+1)  <<endl;

  for (int i = 1; i < tamanho_array; i++)
  {
    if( *(array_dnc+i) >  *maior ){
       maior = (array_dnc+i); //aponta a memoria do ultimo elemento
    } 

  }
  return maior;
}

int main() {
    int tamanho_array;
    int *maior;

    cout << "Digite o tamanho do array:"  <<endl;
    cin  >> tamanho_array;
    int *array_dnc  = new int[tamanho_array];
    
    for (int i = 0; i < tamanho_array; i++)
    {
      cout << "Digite o Elemento: " << i + 1 << ": " << endl;
      cin >> array_dnc[i];
    }
    
    maior = encontrarMaiorElemento(array_dnc , tamanho_array);
    cout << "MAIOR : " << *maior <<endl;
    // mostrar
    for (int i = 0; i < tamanho_array; i++) {cout << " Elementos: " << array_dnc[i]; }

    cout << endl;
    return 0;
}

/*
4: A função encontrarMaiorElemento tem o seguinte propósito:
Receber um ponteiro para um array dinâmico (ou seja, o primeiro elemento do array).
Receber o tamanho do array, para saber quantos elementos percorrer.
Percorrer o array inteiro, comparando cada valor.
Encontrar o maior valor e armazenar o endereço dele.
Retornar um ponteiro para esse maior valor, permitindo que o main() acesse o dado original.


OBS:
Array Dinâmico :
  int *array_dnc = new int[50]; // ✅ Cria um array de 50 inteiros na HEAP
  delete[] array_dnc;          // Sempre liberar a memória depois de usar!    
  📌 Vantagens do array dinâmico:
    ✅ O tamanho pode ser definido em tempo de execução.
    ✅ Útil quando não sabemos o tamanho exato no momento da compilação.
    ❌ Precisamos liberar a memória manualmente (delete[]).

Array Estático:
  int array_estatico[50]; // ✅ Cria um array de 50 inteiros na STACK
  📌 Vantagens do array estático:
    ✅ Mais rápido (alocado na Stack).
    ✅ Não precisa de delete[], pois a memória é gerenciada automaticamente.
    ❌ O tamanho precisa ser conhecido na compilação.

*/