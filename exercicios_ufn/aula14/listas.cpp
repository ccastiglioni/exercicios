#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

struct Lista
{
    int dado;
    Lista *prox;
};

Lista *inserir(int dado, Lista *lista)
{
    if (lista && dado >= lista->dado)
    {
        if (dado != lista->dado)
        {
            lista->prox = inserir(dado, lista->prox);
        }
        return lista;
    }
    else
    {
        Lista *novo = (Lista *)malloc(sizeof(Lista));
        novo->dado = dado;
        novo->prox = lista;
        return novo;
    }
}

void exibir(Lista *lista)
{
    if (lista)
    {
        cout << lista->dado << " ";
        exibir(lista->prox);
    }
}

int contar(Lista *lista)
{
    if (lista)
    {
        return 1 + contar(lista->prox);
    }
    return 0;
}

int procurar(int numero, Lista *lista)
{
    for (Lista *p = lista; p != NULL; p = p->prox)
    {
        if (numero == p->dado)
        {
            return 1;
        }
    }
    return 0;
}

Lista *remover(int dado, Lista *lista)
{
    Lista *p, *pR;
    for (p = lista, pR = NULL; p != NULL; pR = p, p = p->prox)
    {
        if (p->dado == dado)
        {
            if (pR == NULL)
            { // é o primeiro elemento
                lista = p->prox;
            }
            else
            {
                pR->prox = p->prox;
            }
            free(p);
            break;
        }
    }
    return lista;
}

Lista *removerPares(Lista *lista)
{
    Lista *p = lista;
    while (p != NULL)
    {
        Lista *prox = p->prox;

        if (p->dado % 2 == 0)
        {
            lista = remover(p->dado, lista);
        }

        p = prox;
    }
    return lista;
}

Lista *unirListas(Lista *l1, Lista *l2)
{
    Lista *nova = NULL;
    Lista *fim = NULL;

    while (l1)
    {
        Lista *novo = (Lista *)malloc(sizeof(Lista));
        novo->dado = l1->dado;
        novo->prox = NULL;

        if (!nova)
        {
            nova = novo;
            fim = novo;
        }
        l1 = l1->prox;
    }

    while (l2)
    {
        Lista *novo = (Lista *)malloc(sizeof(Lista));
        novo->dado = l2->dado;
        novo->prox = NULL;

        if (!nova)
        {
            nova = novo;
            fim = novo;
        }
        l2 = l2->prox;
    }

    return nova;
}

void DeltarTodaLista(Lista *lista)
{
    Lista *atual = lista;
    while (atual != NULL)
    {
        Lista *temp = atual->prox;
        free(atual);

        atual = temp;
    }
}

void mostrarComuns(Lista *l1, Lista *l2)
{
    cout << "\nElementos iguis\n";

    Lista *aux1 = l1;
    while (aux1 != NULL)
    {
        int valor1 = aux1->dado;

        Lista *aux2 = l2;
        while (aux2 != NULL)
        {
            int valor2 = aux2->dado;

            if (valor1 == valor2)
            {
                cout << valor1 << " ";
            }

            aux2 = aux2->prox;
        }

        aux1 = aux1->prox;
    }
}

int main()
{
    srand(time(NULL));
    Lista *lista1 = NULL;
    Lista *lista2 = NULL;

    for (int i = 0; i < 30; i++)
    {
        lista1 = inserir(rand() % 100 + 1, lista1);
    }

    for (int i = 0; i < 25; i++)
    {
        lista2 = inserir(rand() % 100 + 1, lista2);
    }

    cout << "\nLista 1: ";
    exibir(lista1);

    cout << "\nLista 2: ";
    exibir(lista2);

    mostrarComuns(lista1, lista2);

    lista1 = removerPares(lista1);

    Lista *unida = unirListas(lista1, lista2);

    DeltarTodaLista(unida);
    cout << "\nLista unida deletada." << endl;

    return 0;
}
