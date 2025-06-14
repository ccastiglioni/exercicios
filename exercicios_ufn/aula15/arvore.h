typedef struct no
{
    int dado;
    struct no *esq;
    struct no *dir;
} Arvore;

Arvore *inserir(int valor, Arvore *raiz)
{
    if (raiz == NULL)
    {
        Arvore *novo = (Arvore *)malloc(sizeof(Arvore));
        novo->dado = valor;
        novo->esq = NULL;
        novo->dir = NULL;
        return novo;
    }

    if (valor < raiz->dado)
    {
        raiz->esq = inserir(valor, raiz->esq);
    }
    else
    {
        raiz->dir = inserir(valor, raiz->dir);
    }

    return raiz;
}
