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

int main() {
    int var_1 , valor;
    int tamanho_arr;

    cout << "Insira o Tamanho do array: "<< endl;
    cin >> tamanho_arr;
    int *array_dnc  = new int[tamanho_arr];
    
    for (int i = 0; i < tamanho_arr; i++)
    {
      cin >> valor;
      array_dnc[i] =valor;  
    }
    //int encontrarMaiorElemento()

    for (int i = 0; i < tamanho_arr; i++)
    {
      cout << "valores :  " << array_dnc[i] << endl;
    }
    
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
*/