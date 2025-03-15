/*
📌 Exercício: Remoção de Elemento em uma Lista Encadeada Simples
Crie um programa em C++ que implemente uma Lista Encadeada Simples usando ponteiros. O programa deve permitir a inserção e remoção de elementos na lista.

📌 Requisitos
1️⃣ Criar uma estrutura (struct) chamada Node contendo:
Um campo data para armazenar um número inteiro.
Um ponteiro next que aponta para o próximo nó da lista.

2️⃣ Implementar as seguintes funções:
insert(Node*& head, int val): Insere um novo nó no início da lista.
removerElemento(Node*& head, int val): Remove um nó específico da lista, caso ele exista.
imprimirLista(Node* head): Percorre e imprime todos os elementos da lista na tela.

3️⃣ No main()
Permitir ao usuário inserir elementos na lista.
Exibir a lista antes e depois da remoção.
Permitir que o usuário insira um valor e remova esse elemento da lista, caso exista.
*/

#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

void imprimirLista(Node* head ){

  while (head != nullptr){
    cout << "valor:" << head->data <<endl; 
    head = head->next;
  }
}

void imprimirLista_p_aux(Node* head) {
  if (head == nullptr) {
      cout << "Lista vazia!\n";
      return;
  }

  Node* p_aux = head;  //p_aux → [30] → [20] → [10] → NULL
  while (p_aux != nullptr) {
      cout << p_aux->data << " -> ";
      p_aux = p_aux->next; // 1º: p_aux → [20] → [10] → NULL  2º: p_aux → [10] → NULL 
  }
  cout << "NULL\n";
}

void removerElemento(int valorRemover, Node *&head) {

  Node *ant = nullptr;

  while (head != nullptr)
  {
    if(head->data == valorRemover){
   
    }   
  }

}

void insert(Node *&head , int valor){
   
  Node *novoPonteiro = new Node;
  novoPonteiro->data = valor;
  novoPonteiro->next = head;
  head = novoPonteiro;
}  

int main() {
  Node* head = nullptr;
  int valorRemover;

  insert(head , 10);  
  insert(head , 20);  
  insert(head , 35);  
  
  imprimirLista(head);
  cout << "Digite o valor para deletar :  " << endl;
  cin >> valorRemover;
  removerElemento(valorRemover,head);
  
  imprimirLista(head);

  cout << "#### Fim ###";

    return 0;
}
