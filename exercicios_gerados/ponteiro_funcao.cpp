#include <iostream>

using namespace std;

// Definição da estrutura jogador
struct jogador {
    char nome[20];
    float salario;
    unsigned gols;
};

void exibir(jogador *ptr) {
    cout << ptr->nome << " "
         << ptr->salario << " "
         << ptr->gols << endl;
    cout << " " << endl;  
}

void aumentarSalario(jogador *ptr, int value) {
  ptr->salario += value;
}

int main() {
    // Criando um jogador
    jogador novato = {"Joaozinho", 100.0, 2};

    aumentarSalario(&novato, 60);
    // Exibi dados passando um ponteiro por &
    exibir(&novato);

    return 0;
}
