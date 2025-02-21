#include <iostream>
#include <cstdlib>
#include <ctime>

int main() {
    int vetor[500];
    int vetorPar[500];
    int vetorImpar[500];
    int contadorPar = 0;
    int contadorImpar = 0;
    srand(time(0));

    //Aqui estou inserindo:
    for (int i = 0; i < 500; i++) {
        vetor[i] = rand() % 100 + 1;

        if (vetor[i] % 2 == 0) {
            vetorPar[contadorPar] = vetor[i];
            contadorPar++;
        }else {
            vetorImpar[contadorImpar] = vetor[i];
            contadorImpar++;
        }
    }

    for (int i = 0; i < 500; i++) {
        std::cout << "Elemento " << i << ": " << vetor[i] << std::endl;
    }

    return 0;
}
