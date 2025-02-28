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

    std::set<int> numeros_unicos;   
    std::vector<int> vetor_numeros;  

    int num;
    while (arquivo_dados >> num) {
      
      //std::cout << "valors : " << num;
      ///exit(0);
        if (numeros_unicos.insert(num).second) { 
            vetor_numeros.push_back(num);
        }
    }

    arquivo_dados.close();

    
    std::cout << "Números únicos lidos do arquivo e armazenados no vetor:" << std::endl;
    for (int numero : vetor_numeros) {
        std::cout << numero << " ";
    }
    std::cout << std::endl;

    return 0;
}
