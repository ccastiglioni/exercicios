/*
Exercício: Acessando um Elemento Específico Usando Ponteiros
Crie um programa em C++ que:

1. Peça ao usuário para inserir o tamanho de um array de números inteiros.
2. Aloque dinamicamente memória para armazenar esses números.
3. Permita que o usuário insira os valores no array.
4. Implemente uma função chamada encontrarPosicaoArray, que:

Receba um ponteiro para o array e o tamanho do array. Pergunte ao usuário qual posição deseja visualizar.
Retorne o elemento naquela posição.. obs: use ponteiro prafazer isso!
 
6. Libere a memória alocada.
*/
#include <iostream>
using namespace std;

int* encontrarPosicaoArray(int* arr_pont, int arr_tmh, int posicao){
  int* buscar;

  buscar = arr_pont + (posicao - 1);  // um ponteiro recebe um ponteiro
  //buscar = arr_pont+1 ;  // um ponteiro recebe o end do PRIMEIRO Elemento ponteiro!

  cout << "Posicao : " << posicao << " Valor->" << *buscar << endl;
  cout << "Endereço Memoria do elemento: " << buscar << endl;

  return buscar;  // Retorna um ponteiro para o elemento
  //OU: return arr_pont + (posicao - 1);  // Retorna o ponteiro para o elemento desejado

}

int main() {
  int arr_tmh;
  int posicao_elem;
  
  cout << " Digite o tamanho do array: " <<endl; 
  cin >> arr_tmh;
  int * arr_pont = new int[arr_tmh];
    
    for (int i = 0; i < arr_tmh; i++)
    {
      cout << " Digite o Elemento: " <<(i+1)<<endl; 
      cin >> arr_pont[i];
    }
    
    cout << "Digite a posicao do elemento que quer Buscar: " <<endl; 
    cin >> posicao_elem;
    
  //  cout << "O Elemento o elemento " << posicao_elem <<" : "<< arr_pont[posicao_elem-1] <<endl;
    int* busca_pont =  encontrarPosicaoArray(arr_pont,arr_tmh,posicao_elem);   

    cout << "## Fim ##"<< endl;
    return 0;
} 