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
    
    cout << "n1.data: " << n2.data << endl;
    cout << "n1.next: " << n1.next << endl;
    
    //exit(0);

    Node* atual = &n1;  // Começa do primeiro nó
    while (atual != nullptr) {  // enquanto não encontrar nullo
        cout << atual->data << " -> ";
        atual = atual->next;  // Avança para o próximo nó
    }
    cout << " " << endl;  // Indica o final da lista

    return 0;
}
