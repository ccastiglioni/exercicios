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

int* encontrarPosicaoArray(int* arr_pont,int posicao_elem){

  int* busca = arr_pont+(posicao_elem-1);

  cout << " posicao elem : "<< posicao_elem <<endl; 
  cout << " elem Arr: "<< *busca <<endl; 
    
  return  busca;
} 

int main() {
  int arr_tmh;
  int posicao_elem;
  
  cout << " Digite o tamanho do array: " <<endl; 
  cin >> arr_tmh;
  int * arr_pont = new int[arr_tmh];
  
  /* for (int i = 0; i < arr_tmh; i++)
  {
    cout << " Digite o Elemento: " <<(i+1)<<endl; 
    cin >> arr_pont[i];
    }
    */
   //outra forma de popular o arrau com ponteiros!
   int* ptr = arr_pont;

    for (int i = 0; i < arr_tmh; i++, ptr++) {
        cout << "Digite o Elemento: " << (i + 1) << endl;
        cin >> *ptr;
    }
    
    cout << "Digite a posicao do elemento que quer Buscar: " <<endl; 
    cin >> posicao_elem;
    
    //cout << "O Elemento o elemento " << posicao_elem <<" : "<< arr_pont[posicao_elem-1] <<endl;
    int* busca_pont =  encontrarPosicaoArray(arr_pont,posicao_elem);   

    cout << "## Fim ##"<< endl;
    return 0;
} 