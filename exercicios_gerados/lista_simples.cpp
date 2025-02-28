#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

void insert(Node*& head, int value) {
    Node* newNode = new Node;
    newNode->data = value;
    newNode->next = head;
    head = newNode;
}

void printList(Node* head) {
    while (head) {
        cout << head->data << " -> ";
        head = head->next;
    }
}

int main() {
  Node* head = nullptr;  // Inicialmente, a lista está vazia

  // Passo 1: Criar o primeiro nó
  Node* node1 = new Node;
  node1->data = 10;
  node1->next = head;  // Aponta para NULL porque é o primeiro nó
  head = node1;  // head agora aponta para o primeiro nó (aponta pra 10)
  cout << "Após inserir 10: " << head->data << " -> NULL\n";

  // Passo 2: Criar o segundo nó
  Node* node2 = new Node;
  node2->data = 20;
  node2->next = head;  // Aponta para o antigo primeiro nó (10)
  head = node2;  // head agora aponta para o novo primeiro nó (aponta pra 20) 
  cout << "Após inserir 20: " << head->data << " -> " << head->next->data << " -> NULL\n";

  // Passo 3: Criar o terceiro nó
  Node* node3 = new Node;
  node3->data = 30;
  node3->next = head;  // Aponta para o antigo primeiro nó (20)
  head = node3;  // head agora aponta para o novo primeiro nó (aponta pra 30) 
  cout << "Após inserir 30: " << head->data << " -> " << head->next->data << " -> " << head->next->next->data << " -> NULL\n";

  cout << " " << endl;  
  return 0;
}
