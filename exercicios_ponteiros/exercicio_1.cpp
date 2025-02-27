/*
Exercício: Manipulação de Ponteiros , Escreva um programa em C++ que:

1 - Declare uma variável inteira e atribua um valor a ela.
2 - Declare um ponteiro para armazenar o endereço Dessa variável.
3 - Use o ponteiro para modificar o valor da variável.
4 Imprima o endereço e os valores antes e depois da modificação.
*/
#include <iostream>
using namespace std;

int main () {
int var_1;
int *p_var_1;

var_1 = 20;
p_var_1 = &var_1;

cout << "Antes Varival var_1: "  << var_1 << endl;
cout << "valor memoria de var_1: "  << &var_1 << endl;
cout << "valor Pontiro(memoria) : "  << p_var_1 << endl;
cout << "valor que Pontiro está Apontando : "  << *p_var_1 << endl;

*p_var_1 = *p_var_1 + 5;
cout << "Depois Varival:"  << var_1 << endl;


cout << endl; return 0; 
}

