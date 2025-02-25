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

    std::set<int> numeros_unicos;  // Para garantir que não há duplicatas
    std::vector<int> vetor_numeros; // Vetor onde armazenaremos os números únicos

    int num;
    while (arquivo_dados >> num) {
        // Se o número ainda não está no set, adicionamos no set e no vetor
        if (numeros_unicos.insert(num).second) { 
            vetor_numeros.push_back(num);
        }
    }

    arquivo_dados.close();

    // Exibe os números lidos sem repetições
    std::cout << "Números únicos lidos do arquivo e armazenados no vetor:" << std::endl;
    for (int numero : vetor_numeros) {
        std::cout << numero << " ";
    }
    std::cout << std::endl;

    return 0;
}
