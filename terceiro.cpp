#include <iostream>
#include <fstream>
#include <vector>  

int main() {
    std::ifstream arquivo_dados("/var/tmp/dados.txt");  // Abre o arquivo

    // Verifica se o arquivo foi aberto corretamente
    if (!arquivo_dados) {
        std::cerr << "Erro ao abrir o arquivo!" << std::endl;
        return 1;
    }

    std::vector<int> meuvetor;  // Vetor para armazenar os números lidos
    int num;  // Variável temporária para armazenar cada número lido

    // Lê cada número do arquivo e adiciona ao vetor
    while (arquivo_dados >> num) {
        meuvetor.push_back(num);
    }

    arquivo_dados.close();  // Fecha o arquivo

    // Exibe os números lidos
    std::cout << "Números lidos do arquivo:" << std::endl;
    for (int num : meuvetor) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;
}
