#include <iostream>
#include <string>
using namespace std;


int main() {
    int total_nomes;
    string val_nome ,nome_tem;

    cout << "Digite o numero de pessoas que ira cadastrar : " << endl;
    cin >> total_nomes;
    cin.ignore();  


    string *arr_nomes = new string[total_nomes];
    
    for (int i = 0; i < total_nomes; i++)
    {
      cout << "Digite valor : "<<  i  << endl;
      getline(cin,nome_tem);
      val_nome += "  " + nome_tem;
      arr_nomes[i] = nome_tem;
       
    }
    

    cout << "Total : " << total_nomes << endl;
    for (int i = 0; i < total_nomes; i++)
    {
      cout << "\n Lista de nomes arr: " << arr_nomes[i] << endl;
       
    }
    cout << "\nLista de nomes concatenados: " << val_nome << endl;
    

    


    cout << endl;
    return 0;
}