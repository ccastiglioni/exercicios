Estruturas de Dados - abstratas - lineares - lista - dicionário - pilha - fila - operações clássicas das ED lineares : -add(Add, append) | push, Push(pilha) | offer, Enqueue(fila) - remove(Remove, remove) pop, Pop(pilha) | poll, Dequeue(fila) - contains(Contains, in) - isEmpty(Empty, empty) - size(Count, len) - pilha / fila->peek - ED lineares em java, c #e python são baseadas na teoria da orientação a objetos - terceirização de serviços - há objetos e classes que atendem serviços solicitados

                                                                                                                                                                                                                                                                                                                                                                       - Contudo,
    há implementações dessas estruturas sem se basear na orientação a objetos
        - são implementações procedurais,
    geralmente em C para atender necessidades
        em dispositivos ou recursos computacionais com baixo recurso(processador, memória, ...)

        - possibilidade de trabalhar com estruturas de dados e suas operações via programação própria : -criar a estrutura de dados usando struct em C
                                                                                                        -
                                                                                                        criar todos os métodos : -inserir
                                                                                                                                 -
                                                                                                                                 remover
                                                                                                                                 -
                                                                                                                                 estaContido
                                                                                                                                 -
                                                                                                                                 estaVazio
                                                                                                                                 -
                                                                                                                                 tamanho

                                                                                                                                 -
                                                                                                                                 alocação dinâmica de memória
                                                                                                                                 -
                                                                                                                                 solicitar(SO) e usar memória em tempo de execução
                                                                                                                                 -
                                                                                                                                 malloc - solicitar
                                                                                                                                 -
                                                                                                                                 free - liberar

                                                                                                                                 https : // www.youtube.com/watch?v=5WAulVX_a0M

                                                                                                                                         -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -
#include <iostream>
                                                                                                                                         using namespace std;

int main()
{
    int numero;
    cout << "Digite um numero positivo: ";
    cin >> numero;

    for (int i = 0; i <= numero; i++)
    {
        cout << i << "\n";
    }
    return 1;
}

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -

// exibir números um numero informado e o zero

#include <iostream>
                                                            using namespace std;

int main()
{
    int numero;
    cout << "Digite um numero positivo: ";
    cin >> numero;

    for (int i = numero; i >= 0; i--)
    {
        cout << i << "\n";
    }
    return 1;
}

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -
// exibir números entre 0 e um numero informado de forma recursiva

#include <iostream>using namespace std;

                                                                  void
                                                                  exibirCrescente(int i)
{
    if (i >= 0)
    {
        // chamada recursiva com a transformação da variável de controle
        exibirCrescente(i - 1);
        // este código será executado na volta da recursão - desempilhamento
        cout << i << "\n";
    }
}

int main()
{
    int numero;
    numero = 900;

    exibirCrescente(numero);

    return 1;
}
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -

// exibir números entre o numero informado e o zero de forma recursiva

#include <iostream>using namespace std;

                                                                  void
                                                                  exibirCrescente(int i)
{
    if (i >= 0)
    {
        cout << i << "\n";
        exibirCrescente(i - 1);
    }
}

int main()
{
    int numero;
    numero = 5;
    exibirCrescente(numero);
    return 1;
}

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -https : // www.youtube.com/watch?v=5WAulVX_a0M
                                                                           -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -tirando o exercício 6,
    gostaria que vcs tentassem responde - los....pode ser ?

                                                          -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -se quiserem fazer os códigos em C ou Java ou C #fiquem a vontade
                                                                                                                                spondam para vcs mesmos não precisa colocar no chat vou dar uns 30 min para exercícios e intervalo depois,
    eu discuto as respostas aqui na aula virtual

    -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -

#include <iostream>
#include <ctime>

    using namespace std;

void popularVetor(int vetor[], int n)
{
    srand(time(NULL));

    for (int i = 0; i < n; i++)
    {
        vetor[i] = rand() % 20;
    }
}

void exibirVetor(int vetor[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << vetor[i] << "\t";
    }
    cout << "\n";
}

int main()
{
    int vetor[10];

    popularVetor(vetor, 10);
    exibirVetor(vetor, 10);

    return 1;
}

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -

#include <iostream>
#include <ctime>
                                                                  using namespace std;

void popularVetorR(int vetor[], int n)
{
    if (n > 0)
    {
        vetor[n - 1] = rand() % 20;
        popularVetorR(vetor, n - 1);
    }
}

void exibirVetorR(int vetor[], int n)
{
    if (n > 0)
    {
        // código executado antes do empilhamento
        exibirVetorR(vetor, n - 1);
        // código executado depois do empilhamento
        cout << vetor[n - 1] << "\t";
    }
}

int main()
{
    int vetor[10];
    srand(time(NULL));
    popularVetorR(vetor, 10);
    exibirVetorR(vetor, 10);
    cout << "\n";

    return 1;
}
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -

                                                                  import java.util.ArrayList;
import java.util.Random;

public
class Lista
{

public
    static void popular(ArrayList<Integer> lista, int tamanho)
    {
        Random gerador = new Random();
        for (int i = 0; i < tamanho; i++)
        {
            lista.add(gerador.nextInt(20));
        }
    }

public
    static void exibir(ArrayList<Integer> lista)
    {
        for (Integer numero : lista)
        {
            System.out.print(numero + "\t");
        }
        System.out.println();
    }

public
    static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<>();

        popular(lista, 10);
        exibir(lista);
    }
}

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -

    import java.util.ArrayList;
import java.util.Random;

public
class ListaRecursiva
{
    static Random gerador = new Random();
    static int numero;

public
    static void popularR(ArrayList<Integer> lista, int tamanho)
    {
        if (tamanho > 0)
        {
            numero = gerador.nextInt(20);
            if (!lista.contains(numero))
            {
                lista.add(numero);
            }
            popularR(lista, tamanho - 1);
        }
    }

public
    static void exibir(ArrayList<Integer> lista)
    {
        for (Integer numero : lista)
        {
            System.out.print(numero + "\t");
        }
        System.out.println();
    }

public
    static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<>();

        popularR(lista, 10);
        exibir(lista);
    }
}

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -
    /// exercício sobre o código de lista recursiva em Java
    import java.util.ArrayList;
import java.util.Random;

public
class ListaRecursiva
{
    static Random gerador = new Random();
    static int numero;

public
    static void popularR(ArrayList<Integer> lista, int tamanho)
    {
        if (tamanho > 0)
        {
            numero = gerador.nextInt(20);
            if (!lista.contains(numero))
            {
                lista.add(numero);
            }
            popularR(lista, tamanho - 1);
        }
    }

public
    static void exibir(ArrayList<Integer> lista)
    {
        for (Integer numero : lista)
        {
            System.out.print(numero + "\t");
        }
        System.out.println();
    }

public
    static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<>();

        popularR(lista, 10);
        exibir(lista);
    }
}

---------------------------------------------

criar um método recursivo que exibe somente os números pares,
criar um código java com lista recursiva
esta lista deve armazenar objetos do tipo aluno com matricula e nome..... 
contudo, o número de matrícula deve ser sorteado
uma vez que o aluno com matricula e nome for gerado, armazenar em uma lista..... 
esta rotina deve estar em um método recursivo
 
 
---------------------------------------------