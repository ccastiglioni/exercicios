#include <iostream>
using namespace std;

// Definição do nó da lista
struct Node {
    int data;
    Node* next;
};

int main() {
    // Criando os nós manualmente
    Node n1 = {5, nullptr};   // Primeiro nó 
    Node n2 = {10, nullptr};  // Segundo nó
    Node n3 = {20, nullptr};  // Terceiro nó

    // Ligando os nós para formar a lista: 5 -> 10 -> 20 -> NULL
    n1.next = &n2;
    n2.next = &n3;
    n3.next = nullptr;  // Último nó aponta para NULL

    // Corrigindo a impressão do primeiro nó
    cout << "n1.data: " << n1.data << endl;
    cout << "n1.next: " << n1.next << endl;  // Mostra o endereço do próximo nó

    // Percorrendo a lista manualmente
    Node* atual = &n1;  // Começa do primeiro nó
    while (atual != nullptr) {
        cout << atual->data << " -> ";
        atual = atual->next;  // Avança para o próximo nó
    }
    cout << "NULL" << endl;  // Indica o final da lista

    return 0;
}
