#include <iostream>
#include <fstream>
#include <cstdlib>
#include <ctime>

int main() {  
    int vetor[500];
    srand(time(0));

    for (int i = 0; i < 500; i++) {
        vetor[i] = rand() % 100 + 1;
    }
    std::ofstream arquivo("/var/tmp/dados.txt");

    if (!arquivo) {
        std::cerr << "Erro ao abrir o arquivo!" << std::endl;
        return 1;
    }

    for (int i = 0; i < 500; i++) {
        arquivo << "Elemento " << i << ": " << vetor[i] << std::endl;
    }

    arquivo.close();

    std::cout << "Números salvos em 'dados.txt' com sucesso!" << std::endl;

    return 0;
}
