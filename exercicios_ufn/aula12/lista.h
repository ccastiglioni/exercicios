#include <cstdlib>

typedef struct no
{
    int dado;
    struct no *prox;
} Celula;

Celula *inserir(int dado, Celula *lista)
{
    // alocar memória
    Celula *novo = (Celula *)malloc(sizeof(Celula));

    // depositar valores que vem do parâmetro
    novo->dado = dado;
    novo->prox = NULL;

    // testar se é o primeiro elemento a ser inserido
    if (!lista)
    { // if (lista == NULL)
        return novo;
    }

    // percorrer a estrutura até o final
    Celula *p;
    for (p = lista; p->prox != NULL; p = p->prox)
        ;

    // encadear e retornar
    p->prox = novo;
    return lista;
}

Celula *unicoInserir(int dado, Celula *lista)
{
    Celula *p = lista;
    while (p != NULL)
    {
        if (p->dado == dado)
        {
            return lista;
        }
        p = p->prox;
    }

    Celula *novo = (Celula *)malloc(sizeof(Celula));
    novo->dado = dado;
    novo->prox = NULL;

    if (!lista)
    {
        return novo;
    }

    p = lista; /// eu substitui pelo for!!!
    while (p->prox != NULL)
    {
        p = p->prox;
    }
    p->prox = novo;

    return lista;
}

void exibir(Celula *lista)
{
    for (Celula *p = lista; p != NULL; p = p->prox)
    {
        cout << p->dado << "\t";
    }
    cout << endl;
}

int procurar(int numero, Celula *lista)
{
    for (Celula *p = lista; p != NULL; p = p->prox)
    {
        if (numero == p->dado)
        {
            return 1;
        }
    }
    return 0;
}

// int mediaLista(int numero, Celula *lista)