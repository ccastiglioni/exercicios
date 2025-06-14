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
    arvore = inserir(70, arvore);
    arvore = inserir(20, arvore);

    cout << "Total de elementos: " << contar(arvore) << endl;
    exibirOrdenado(arvore);

    cout << "Contar Folhas: " << contarFolhasProf(arvore) << endl;

    cout << "Localizar Elemento: " << localizarElemento(40, arvore) << endl;

    cout << "########################" << endl;
    return 1;
}
