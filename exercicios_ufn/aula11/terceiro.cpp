#include <iostream>
#include <ctime>

using namespace std;

void popularVetor(int vetor[], int n)
{
    srand(time(NULL));
    if (n > 0)
    {
        vetor[n - 1];
        popularVetor(vetor, n - 1);
    }
}

void menorR(int vetor[], int n)
{

    if (n > 0)
    {
    }
}

void exibirVetor(int vetor[], int n)
{
}

int main()
{
    int vetor[10];

    popularVetor(vetor, 10);
    exibirVetor(vetor, 10);
    menorR();

    return 1;
}