/*
Exercício: Uso de Ponteiros e Alocação Dinâmica Crie um programa em C++ que:

1 Peça ao usuário para inserir o tamanho de um array de números inteiros.
2 Aloque dinamicamente memória para armazenar esses números.
3 Permita que o usuário insira os valores no array.
4 Exiba os valores armazenados e a soma deles.
5 Libere a memória alocada.
*/

#include <iostream>
using namespace std;

int main() {
    int tamanho_arr;
    
    cout << "Digite o tamanho do Array:" << endl;
    cin >> tamanho_arr;
    int *array = new int[tamanho_arr];
    
    cout << "Digite " << tamanho_arr << " Elementos:" << endl;
    //cin >> array[1] ; //cin >> array[2] ;
    
    for (int i = 0; i < tamanho_arr; i++)
    {
      cin >> array[i] ;
    }
    
    for (int i = 0; i < tamanho_arr; i++)
    {
       cout << "Elementos digitados foram : " << array[i] << endl;
    }
    
    delete[] array;
    cout << endl;
    return 0;
}