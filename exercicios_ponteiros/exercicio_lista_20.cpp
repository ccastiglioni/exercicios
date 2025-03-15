#include <iostream>

using namespace std;

// Estrutura do nó da lista
struct Node {
    int dado;
    Node* prox;
};

// Função para inserir um elemento no início da lista
void inserirInicio(Node*& head, int valor) {
    Node* novoNo = new Node;
    novoNo->dado = valor;
    novoNo->prox = head;
    head = novoNo;
}

// Função para inserir um elemento no final da lista
void inserirFim(Node*& head, int valor) {
    Node* novoNo = new Node;
    novoNo->dado = valor;
    novoNo->prox = nullptr;
    
    if (head == nullptr) {
        head = novoNo;
    } else {
        Node* temp = head;
        while (temp->prox != nullptr) {
            temp = temp->prox;
        }
        temp->prox = novoNo;
    }
}

// Função para remover o primeiro elemento da lista
void removerInicio(Node*& head) {
    if (head == nullptr) {
        cout << "A lista está vazia, nada para remover.\n";
        return;
    }
    Node* temp = head;
    head = head->prox;
    delete temp;
}

// Função para imprimir os elementos da lista
void imprimirLista(Node* head) {
    if (head == nullptr) {
        cout << "A lista está vazia!\n";
        return;
    }
    
    Node* temp = head;
    cout << "Lista Encadeada: ";
    while (temp != nullptr) {
        cout << temp->dado << " -> ";
        temp = temp->prox;
    }
    cout << "NULL\n";
}

// Função para ordenar a lista encadeada usando Bubble Sort
void ordenarLista(Node* head) {
    if (head == nullptr || head->prox == nullptr) {
        return;  // Lista vazia ou com um único elemento já está ordenada
    }

    bool trocado;
    Node* atual;
    Node* ultimo = nullptr;

    do {
        trocado = false;
        atual = head;

        while (atual->prox != ultimo) {
            if (atual->dado > atual->prox->dado) {
                // Troca os valores dos nós
                int temp = atual->dado;
                atual->dado = atual->prox->dado;
                atual->prox->dado = temp;
                trocado = true;
            }
            atual = atual->prox;
        }
        ultimo = atual;  // O último elemento já está na posição correta
    } while (trocado);
}

int main() {
    Node* lista = nullptr;
    int opcao, valor;

    do {
        cout << "\nMenu:\n";
        cout << "1 - Inserir no Início - LIFO (Last In, First Out) \n";
        cout << "2 - Inserir no Fim - FIFO (First In, First Out) \n";
        cout << "3 - Remover do Início\n";
        cout << "4 - Imprimir Lista\n";
        cout << "5 - Ordenar Lista\n";
        cout << "0 - Sair\n";
        cout << "Escolha uma opção: ";
        cin >> opcao;

        switch (opcao) {
            case 1:
                cout << "Digite um valor para inserir no início: ";
                cin >> valor;
                inserirInicio(lista, valor);
                break;
            case 2:
                cout << "Digite um valor para inserir no fim: ";
                cin >> valor;
                inserirFim(lista, valor);
                break;
            case 3:
                removerInicio(lista);
                break;
            case 4:
                imprimirLista(lista);
                break;
            case 5:
                ordenarLista(lista);
                cout << "Lista ordenada com sucesso!\n";
                break;
            case 0:
                cout << "Saindo...\n";
                break;
            default:
                cout << "Opção inválida!\n";
        }
    } while (opcao != 0);

    return 0;
}
