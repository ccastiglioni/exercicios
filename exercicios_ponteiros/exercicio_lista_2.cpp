#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

void insert(Node* &head, int val){

   //new , data add , next
   Node *novoNode = new Node; 
   novoNode->data = val;
   novoNode->next = head;
   head = novoNode;


  }

int main() {
    //head é um ponteiro com atributo data e next e apontado para NULL
    Node* head = nullptr;  

    insert(head, 10);
    insert(head, 20);
    insert(head, 30);

    Node *p_temp = head; 
    while (p_temp != nullptr)
    {
       cout << "p_temp:" << p_temp->data <<endl;
       p_temp = p_temp->next;
    }
    
    //outra forma de listagem!
    for (Node* temp = head; temp != nullptr; temp = temp->next) {
      cout << temp->data << " -> ";
    }

    cout << "### FIM ###"  << endl;
    return 0;
}
