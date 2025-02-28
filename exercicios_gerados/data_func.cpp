// Manipulação de Estruturas de Data Usando Ponteiros em C++
// Acessando e Modificando Objetos de uma Classe Através de Ponteiros
#include <iostream>

class Data {
public:
    int dia;
    int mes;
    int ano;

    void print() {
        std::cout << dia << "/" << mes << "/" << ano << std::endl;
    }
};

int main() {
    Data minha_data;
    Data* pData;
    pData = &minha_data;
    pData->dia = 17;
    pData->mes = 03;
    pData->ano = 2021;
    pData->print();
    return 0;
}
