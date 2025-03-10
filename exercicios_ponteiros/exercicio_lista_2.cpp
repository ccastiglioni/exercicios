#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

// Função para inserir um novo nó no início da lista, com prints para visualizar melhor
void insert(Node*& head, int value) {
    cout << "Inserindo: " << value << endl;
 
    // Criando o novo nó
    Node* newNode = new Node;
    newNode->data = value;
    cout << "Novo nó criado com data = " << newNode->data << endl;

    // O novo nó aponta para o atual primeiro nó da lista
    newNode->next = head;
    cout << "newNode->next agora aponta para o antigo head\n";

    // Atualiza o head para apontar para o novo nó
    head = newNode;
    cout << "head agora aponta para o novo nó\n";

    // Exibir a lista após a inserção
    cout << "Lista atualizada: ";
    Node* temp = head;
    while (temp) {
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL" << endl << endl;
}

int main() {
    Node* head = nullptr;  // Lista inicialmente vazia

    insert(head, 10);
    insert(head, 20);
    insert(head, 30);

    return 0;
}
