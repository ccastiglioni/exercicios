package exercicios_ufn.aula8;

import java.util.Scanner;
import java.util.Stack;

//Stack = último que entra é o primeiro a sair (LIFO — Last In, First Out).
/*
📚 Exercício: Pilha de Pratos
    Imagine que você trabalha em uma cozinha de restaurante, onde os pratos são empilhados conforme são lavados.

Crie um programa em Java que:
    Empilhe pratos com descrições (ex: "Prato Azul", "Prato Branco", etc.).

Após empilhar:
    Mostre o prato do topo (último a ser colocado).
    Mostre o prato do meio da pilha (posição central).
    Mostre o prato de baixo (o primeiro que foi colocado).

Regras:
    Use a estrutura Stack<String>.
    Utilize os métodos push(), peek() e qualquer outro que julgar necessário.
    Para pegar o do meio, percorra a pilha (sem desempilhar tudo).

Teoria :
    O Stack no Java gera índice igualzinho a um ArrayList ou Vector!
    Isso acontece porque a classe Stack herda (extends) da classe Vector, que é uma lista indexada.
*/

public class StackPratos {

    public static void main(String[] args) {

        Stack<String> pratos = new Stack<>();
        Scanner tecladoIn = new Scanner(System.in);
        String pratoNome;

        System.out.println("Digite o numero de pratos(Deve ser impar!) pra Empilhar");
        int totalPratos = tecladoIn.nextInt(); /// pega um interio sempre coloca: .nextLine() !!!!!!!!!!!!!!!!!!!!!!!!!
        tecladoIn.nextLine();

        for (int i = 0; i < totalPratos; i++) {

            System.out.println("Cor do prato :" + (1 + i));
            pratoNome = tecladoIn.nextLine();
            pratos.push(pratoNome);
        }
        // 3: verde
        // 2: rosa
        // 1: azul
        if (!pratos.empty()) {
            // System.out.println("Todos Elementos: " + pratos);
            System.out.println("Prato Do fundo da pilha: " + pratos.get(0));
            int meio = pratos.size() / 2; // 5/2 da 2 !
            System.out.println("Meio da pilha: " + pratos.get(meio));
            System.out.println("Prato do Topo da pilha: " + pratos.peek());
        } else {
            System.out.println("Pilha Vazia!");
        }

    }

}
