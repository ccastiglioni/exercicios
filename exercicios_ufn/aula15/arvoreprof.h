typedef struct no
{
    int dado;
    struct no *esq;
    struct no *dir;
} Arvore;

Arvore *inserir(int valor, Arvore *raiz)
{
    if (raiz)
    { // percurso pré-fixado ou RED
        // percorrer ou pra esquerda ou pra direita
        if (valor < raiz->dado)
        {
            // ir para esquerda
            raiz->esq = inserir(valor, raiz->esq);
        }
        else
        {
            // ir para direita
            raiz->dir = inserir(valor, raiz->dir);
        }
        return raiz;
    }
    else
    {
        Arvore *novo = (Arvore *)malloc(sizeof(Arvore));
        novo->dado = valor;
        novo->esq = NULL;
        novo->dir = NULL;
        return novo;
    }
}

void exibirOrdenado(Arvore *raiz)
{
    if (raiz)
    { // percurso in-fixado ou ERD
        exibirOrdenado(raiz->esq);
        cout << raiz->dado << "\t";
        exibirOrdenado(raiz->dir);
    }
}

int contar(Arvore *raiz)
{
    if (raiz)
    {
        return 1 + contar(raiz->esq) + contar(raiz->dir);
    }
    return 0;
}

int somar(Arvore *raiz)
{
    if (raiz)
    {
        return raiz->dado + somar(raiz->esq) + somar(raiz->dir);
    }
    return 0;
}

int contarPares(Arvore *raiz)
{
    if (raiz)
    {
        if (raiz->dado % 2 == 0)
        {
            return 1 + contarPares(raiz->esq) + contarPares(raiz->dir);
        }
        return 0 + contarPares(raiz->esq) + contarPares(raiz->dir);
    }
    return 0;
}

int contarFolhas(Arvore *raiz)
{
    if (raiz)
    {
        if (raiz->dado)
        {
            if (raiz->esq == nullptr && raiz->dir == nullptr)
            {
                return 1 + contarFolhas(raiz->esq) + contarFolhas(raiz->dir);
            }
        }
        return 0;
    }
    return 0;
}

void exibirFolhas(Arvore *raiz)
{
    if (raiz)
    {
        if (!raiz->esq && !raiz->dir)
        {
            exibirFolhas(raiz->esq);
            exibirFolhas(raiz->dir);
        }
    }
}

int contarFolhasProf(Arvore *raiz)
{
    if (raiz)
    {
        if (!raiz->esq && !raiz->dir)
        {
            return 1;
        }
        return contarFolhasProf(raiz->esq) + contarFolhasProf(raiz->dir);
    }
    return 0;
}

bool localizarElemento(int valor, Arvore *raiz)
{
    if (raiz)
    {
        if (raiz->dado == valor)
        {
            if (raiz->esq == nullptr && raiz->dir == nullptr)
            {
                localizarElemento(valor, raiz->esq);
                return 1;
                localizarElemento(valor, raiz->dir);
            }
        }
        else
        {
            return 0;
        }
    }
    return 0;
}
