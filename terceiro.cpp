#include <iostream>
#include <fstream>
#include <set>
#include <vector>

int main() {
    std::ifstream arquivo_dados("/var/tmp/dados.txt");  

    if (!arquivo_dados) {
        std::cerr << "Erro ao abrir o arquivo!" << std::endl;
        return 1;
    }

    std::set<int> numeros_unicos;  // Armazena apenas valores únicos
    int num;

    while (arquivo_dados >> num) {
        numeros_unicos.insert(num);  // Insere no set (ignora duplicados automaticamente)
    }

    arquivo_dados.close();

    // Exibe os números lidos sem repetições
    std::cout << "Números únicos lidos do arquivo:" << std::endl;
    for (int numero : numeros_unicos) {
        std::cout << numero << " ";
    }
    std::cout << std::endl;

    return 0;
}
