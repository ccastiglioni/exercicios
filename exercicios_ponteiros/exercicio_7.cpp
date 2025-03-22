/*
 Enunciado do Problema Resolvido Objetivo:
Criar um programa em C++ que utilize ponteiros e alocação dinâmica para armazenar números inteiros fornecidos pelo usuário, preenchendo um array de trás para frente. Além disso, o programa deve permitir que o usuário consulte um elemento específico do array por meio de uma função que utilize ponteiros.

📌 Requisitos:
1️⃣ O usuário insere o tamanho do array.
2️⃣ O programa aloca memória dinamicamente para armazenar os números.
3️⃣ Os valores são inseridos do último para o primeiro elemento do array.
4️⃣ O programa exibe o array preenchido.
5️⃣ A memória alocada dinamicamente é liberada corretamente no final do programa.*/
#include <iostream>
#include <vector>
using namespace std;

int main() {
    int arr_tmh;
    
    cout << "Digite o tamanho do array: ";
    cin >> arr_tmh;

    vector<int> array_dnc(arr_tmh);  // Usando std::vector em vez de new[]

    //int* ptr = &array_dnc[0];  // Aponta para o inicio elemento  OU  int* ptr = array_dnc.data();  // Outra forma de obter o ponteiro para o início
    int* ptr = &array_dnc.back();  // Aponta para o último elemento para comecar inserir do Ultimo

    for (int i = 0; i < arr_tmh; i++, ptr--) {
        cout << "Digite o Elemento " << (i + 1) << ": ";
        cin >> *ptr;
    }

    cout << "\n Como ficou o Array preenchido: ";
    for (int num : array_dnc) {
        cout << num << " ";
    }
    cout << "\n## Fim ##" << endl;

    return 0;
}
