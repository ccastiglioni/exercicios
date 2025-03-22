#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

// Função para inserir um elemento no início da lista
void insert(Node*& head, int val) {
    Node* novoNode = new Node;
    novoNode->data = val;
    novoNode->next = head;
    head = novoNode;
}

// Função para remover um elemento específico da lista  suponto que vou remover o 20
void removerElemento(Node*& head, int val) {
    if (head == nullptr) {
        cout << "Lista vazia! Nada para remover.\n";
        return;
    }

    Node* temp = head;         // temp será usado para percorrer a lista.              temp -> [30|•] → [20|•] → [10|NULL]
    Node* anterior = nullptr; // anterior guardará o nó anterior ao que será removido. anterior = NULL

    // Se o valor a ser removido estiver na cabeça da lista
    if (head->data == val) {
        head = head->next;  // HEAD -> [20|•] → [10|NULL]  //  ficou solto e temp->30 DEVE ser removido!
        delete temp;       // delete temp;  // Libera a memória o   temp -> [30|•] → [20|•] → [10|NULL]
        cout << "Elemento " << val << " removido direto do HEAD!\n";
        return;
    }
    // Percorre a lista procurando o nó anteriro!
    while (temp != nullptr && temp->data != val) {
        anterior = temp;  //  armazenar o nó(da MEMORIA!) anterior ao que será removido.
        temp = temp->next; // o temp vai percorrer a lista até encontrar o elemento a ser removidor
    }

    // Se não encontrou o valor
    if (temp == nullptr) {
        cout << "Elemento " << val << " não encontrado na lista.\n";
        return;
    }

    // ajusta os ponteiros e remover o nó
    anterior->next = temp->next; // Faz [30] apontar diretamente para [10]  //anterior -> [30|•] → [10|NULL]
    delete temp;                // temp -> [20|•] → [10|NULL]  // Nó 20 está "solto"
    cout << "Elemento " << val << " removido!\n";
}

// Função para imprimir a lista encadeada
void imprimirLista(Node* head) {
    if (head == nullptr) {
        cout << "Lista vazia!\n";
        return;
    }
    Node* temp = head;
    while (temp != nullptr) {
        //cout << " temp: " << temp <<endl;
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL\n";
}

int main() {
    Node* head = nullptr;

    insert(head, 10);
    insert(head, 20); // supondo remover esse!
    insert(head, 30);
    insert(head, 40);
    insert(head, 50);
    insert(head, 60);
    insert(head, 70);
    insert(head, 80);

    cout << "Lista antes da remoção:\n";
    imprimirLista(head);

    int valorRemover;
    cout << "Digite um valor para remover: ";
    cin >> valorRemover;

    removerElemento(head, valorRemover);

    cout << "Lista após a remoção:\n";
    imprimirLista(head);

    return 0;
}
 

