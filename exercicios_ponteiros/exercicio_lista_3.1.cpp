#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

// Função para imprimir a lista encadeada
void imprimirLista(Node* head) {
    if (head == nullptr) {
        cout << "Lista vazia!\n";
        return;
    }

    Node* p_aux = head;  // Ponteiro auxiliar para percorrer a lista
    while (p_aux != nullptr) {
        cout << p_aux->data << " -> ";
        p_aux = p_aux->next;  
    }
    cout << "NULL\n";
}

// Função para inserir um nó no início da lista
void insert(Node *&head, int valor) {
    Node *novoPonteiro = new Node;
    novoPonteiro->data = valor;
    novoPonteiro->next = head;
    head = novoPonteiro;
}

// Função para remover um elemento da lista (nova lógica!)
void removerElemento(int valorRemover, Node *&head) {
    if (head == nullptr) {
        cout << "Lista vazia! Nada para remover.\n";
        return;
    }

    Node *p_temp = head;
    Node *ant = nullptr;

    // Percorre a lista até encontrar o elemento ou chegar ao final
    while (p_temp != nullptr && p_temp->data != valorRemover) {
        ant = p_temp; // Armazena o nó anterior ao que estamos verificando
        p_temp = p_temp->next;
    }

    // Se o elemento não foi encontrado
    if (p_temp == nullptr) {
        cout << "Elemento " << valorRemover << " não encontrado na lista.\n";
        return;
    }

    // Se o nó a ser removido é o primeiro (HEAD) 
    if (p_temp == head) {   ///  Aqui p_temp == head é verdadeiro, pois ambos apontam para 35.
        head = head->next; // Move o HEAD para o próximo nó
    } else {
        ant->next = p_temp->next; // Faz o nó anterior apontar para o próximo do removido
    }

    delete p_temp; // Libera a memória do nó removido
    cout << "Elemento " << valorRemover << " removido!\n";
}

int main() {
    Node* head = nullptr;
    int valorRemover;

    // Inserindo valores na lista
    insert(head, 10);  
    insert(head, 20);  
    insert(head, 35);  

    // Exibe a lista antes da remoção
    cout << "Lista antes da remoção:\n";
    imprimirLista(head);

    // Solicita o valor a ser removido
    cout << "Digite o valor para deletar: ";
    cin >> valorRemover;
    
    // Remove o elemento
    removerElemento(valorRemover, head);

    // Exibe a lista após a remoção
    cout << "Lista após a remoção:\n";
    imprimirLista(head);

    cout << "#### Fim ###\n";
    return 0;
}
