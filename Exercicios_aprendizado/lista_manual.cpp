#include <iostream>
using namespace std;

int main() {
    int x = 42;
    int* p = &x;
    
    cout << "1. O endereço de x: " << &x << endl;
    cout << "2. O valor de p: " << p << endl;
    cout << "3. O valor de x usando p: " << *p << endl;

    *p = 99; // Alterando o valor de x através do SEU ponteiro

    cout << "4. O novo valor de x: " << x << endl;
    cout << "5. O novo valor de *p: " << *p << endl;

    return 0;
}
