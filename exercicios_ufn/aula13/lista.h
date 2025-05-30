typedef struct no
{
    int dado;
    struct no *prox;
} Lista;

Lista *inserir(int dado, Lista *lista)
{
    if (lista && dado >= lista->dado)
    {
        if (dado != lista->dado)
        {
            // avançar na lista
            lista->prox = inserir(dado, lista->prox);
        }
        /// aqui quando quero retornar cada elemento!
        return lista;
    }
    else
    { // cheguei no final da lista
        Lista *novo = (Lista *)malloc(sizeof(Lista));
        novo->dado = dado;
        if (lista)
        {
            novo->prox = lista;
        }
        else
        {
            novo->prox = NULL;
        }
        /// chegou no final mesmo
        return novo;
    }
}

void exibir(Lista *lista)
{
    if (lista)
    {
        cout << lista->dado << endl;
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