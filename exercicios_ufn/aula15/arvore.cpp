#include <iostream>
#include <cstdlib>

using namespace std;

#include "arvoreprof.h"

int main()
{
    Arvore *arvore = NULL;

    arvore = inserir(50, arvore);
    arvore = inserir(35, arvore);
    arvore = inserir(40, arvore);
    arvore = inserir(60, arvore);
    cout << "Contar elementes: " << contar(arvore) << endl;

    cout << "Exibir Ordenado: " << endl;
    exibirOrdenado(arvore);

    return 1;
}
