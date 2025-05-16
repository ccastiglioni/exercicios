#include <iostream>
using namespace std;

bool ehPrimo(int n)
{
    if (n < 2)
        return false;
    for (int i = 2; i <= n / 2; i++)
    {
        if (n % i == 0)
            return false;
    }
    return true;
}

void mostrarPrimosR(int numero)
{
    if (numero <= 0)
        return;

    mostrarPrimosR(numero - 1); // empilhamento antes → exibe em ordem crescente

    if (ehPrimo(numero))
    {
        cout << numero << " é primo" << endl;
    }
}

int main()
{
    int numero;

    cout << "Digite o número: ";
    cin >> numero;

    mostrarPrimosR(numero);

    return 0;
}
