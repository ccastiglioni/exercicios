#include <iostream>

void somaum_sem_ref(int valor) {
    valor = valor + 1;
}

void somaum_com_ref(int  &valor) {
    valor = valor + 2;
}

void somaum_pont_ref(int *valor) {
    *valor = *valor + 1;
}


int main() {
    int x = 5;
    somaum_sem_ref(x); // NÂO consegue passar o valor! ele gera uma COPIA!
    std::cout << "Valor sem referencia (passa Copiando) : " << x << std::endl;
    
    somaum_com_ref(x); // Passa por referencia o valor atual  
    std::cout << "Valor com referencia(Atual) : " << x << std::endl;
    
    somaum_pont_ref(&x); // Alera DIRETAMENTO no local de memoria(Pointeiro) da var = X , (evita gargalo de memoria!)
    std::cout << "Valor da referencia da memoria da variavel (via Ponteiro) : " << x << std::endl;

    std::cout << " " << std::endl; 
    return 0;
}
