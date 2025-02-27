/*
Crie um programa em C++ que:

1. Peça ao usuário para inserir dois números inteiros.
2. Crie uma função chamada encontrarMaior que receba dois ponteiros e retorne o maior valor.
3. No main(), use essa função para determinar o maior número e exiba o resultado.
*/

#include <iostream>
using namespace std;

int encontrarMaior(int *px, int *py) {
  int maior = *px;  // Copia o valor apontado por px para a variável 'maior'

  if (*py > *px) {
      maior = *py;  // Se *py for maior, copia seu valor para 'maior'
  }
  return maior;  // Retorna a cópia do maior valor
}

int* encontrarMaior_Val_Ref(int *px, int *py) { // Como retorna um ponteiro, é possível modificar o valor original no main() , sem fazer copia!
  if (*px > *py) {
      return px;  // Retorna o próprio ponteiro para px
  } else {
      return py;  // Retorna o próprio ponteiro para py
  }
}

int main() {
    int var_x;
    int var_y;
    int v_return;  
  cout << "Digite o valor para a variavel X: " << endl;
  cin >>  var_x;

  cout << "Digite o valor para a variavel Y: " << endl;
  cin >>  var_y;
  //func que receba dois ponteiros e retorne o maior valor
  v_return = encontrarMaior(&var_x,&var_y);
  // int* maior = encontrarMaior(&var_x, &var_y); //Recebe um ponteiro para o maior valor

  cout << "Maior é : " << v_return << endl;
  cout << endl;
  return 0;
}