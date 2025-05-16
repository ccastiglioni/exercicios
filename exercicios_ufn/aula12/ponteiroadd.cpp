#include <iostream>
using namespace std;

#include "lista.h"

int main()
{
    Celula *lista = NULL;

    // lista = inserir(7, lista);
    lista = unicoInserir(10, lista);
    lista = unicoInserir(5, lista);
    lista = unicoInserir(20, lista);

    lista = unicoInserir(40, lista);
    lista = unicoInserir(5, lista);

    exibir(lista);

    int numero = 10;

    if (procurar(numero, lista))
    {
        // cout << p->dado << "\t";
        cout << "numero encontrado : " << endl;
    }

    return 1;
}