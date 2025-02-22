#include <iostream>
#include <fstream>
#include <vector>  

int main() {
    std::ifstream arquivo_dados("/var/tmp/dados.txt");  

    if (!arquivo_dados) {
        std::cerr << "Erro ao abrir o arquivo!" << std::endl;
        return 1;
    }

    std::vector<int> meuvetor;    
    int num;  

    while (arquivo_dados >> num) {
        meuvetor.push_back(num);
    }

    arquivo_dados.close(); 

    // Exibe os números lidos
    std::cout << "Números lidos do arquivo:" << std::endl;
    for (int num : meuvetor) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;
}
