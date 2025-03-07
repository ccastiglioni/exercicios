/*
Problema: Troca de Valores Usando Ponteiros Crie um programa em C++ que:

1 Declare duas variáveis inteiras.
2 Peça ao usuário para inserir valores para essas variáveis.
3 Crie uma função chamada trocarValores que recebe dois ponteiros e troca os valores das variáveis.
4 Exiba os valores antes e depois da troca.
*/
#include <iostream>
using namespace std;

//✅ Não cria cópias de valores. ❌ Mas não funciona com memória dinâmica (new/delete).
void trocarValores_var_por_referencia(int &pvar_x, int &pvar_y) {
  int temp = pvar_x;  
  pvar_x = pvar_y;    
  pvar_y = temp;      
}

void trocarValores(int *pvar_x,int *pvar_y){
  int tempy = *pvar_y; 
  *pvar_y = *pvar_x;
  *pvar_x = tempy;
  cout << "Valores memoria variavel pvar_x: " << pvar_x << endl;
  cout << "Valores memoria variavel pvar_y: " << pvar_y << endl;
  //exit(0);
}

int main() {
    int var_x;
    int var_y;
   
   cout << "Digite o valor para a variavel X: " << endl;
   cin >>  var_x;

   cout << "Digite o valor para a variavel Y: " << endl;
   cin >>  var_y;
     
   //Passando os endereços das variáveis, 
   //significa que qualquer alteração feita dentro da função afeta diretamente as variáveis originais na memória.
   trocarValores(&var_x, &var_y);
   cout << "Novos valores variavel X: " << var_x << endl;
   cout << "Novos valores variavel Y: " << var_y << endl;
   
   cout << endl;
   return 0;
  }