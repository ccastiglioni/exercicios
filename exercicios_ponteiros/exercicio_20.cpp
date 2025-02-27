/* pergarTodoAnunciado
Exercício: Implementação de Lista Encadeada Simples em C++
Crie um programa que implemente uma Lista Encadeada Simples usando ponteiros. O programa deve:

1. Criar uma estrutura (struct) chamada Node, que contém:
Um campo dado para armazenar um número inteiro.
Um ponteiro prox que aponta para o próximo nó da lista.

2. Implementar as seguintes funções:
inserirInicio: Insere um novo nó no início da lista.
inserirFim: Insere um novo nó no final da lista.
removerInicio: Remove o primeiro nó da lista.
imprimirLista: Percorre e imprime todos os elementos da lista.
3. No main(), permitir ao usuário inserir e remover elementos interativamente.
*/
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
    Node* temp = head;
    while (temp != nullptr) {
        cout << temp->dado << " -> ";
        temp = temp->prox;
    }
    cout << "NULL\n";
}

int main() {
    Node* lista = nullptr;
    int opcao, valor;

    do {
        cout << "\nMenu:\n";
        cout << "1 - Inserir no início\n";
        cout << "2 - Inserir no fim\n";
        cout << "3 - Remover do início\n";
        cout << "4 - Imprimir lista\n";
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
            case 0:
                cout << "Saindo...\n";
                break;
            default:
                cout << "Opção inválida!\n";
        }
    } while (opcao != 0);

    return 0;
}
