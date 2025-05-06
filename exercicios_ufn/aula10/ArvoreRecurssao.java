package exercicios_ufn.aula10;

public class ArvoreRecurssao {
    static class No {
        int valor;
        No esquerda;
        No direita;

        public No(int valor) {
            this.valor = valor;
        }
    }

    public static void emOrdem(No raiz) {
        if (raiz != null) {
            System.out.println("Empilha: " + raiz.valor);
            emOrdem(raiz.esquerda);
            System.out.print("VISITA: " + raiz.valor + "\n");
            emOrdem(raiz.direita);
            System.out.println("Desempilha: " + raiz.valor);
        }
    }

    public static void emOrdem2(No raiz) {
        if (raiz != null) {
            emOrdem(raiz.esquerda);
            System.out.print(raiz.valor + " ");
            emOrdem(raiz.direita);
        }
    }

    // Método principal
    public static void main(String[] args) {
        /*
         * 10
         * / \
         * 8 9
         * / \ / \
         * 4 2 1 5
         */

        No raiz = new No(10);
        raiz.esquerda = new No(8);
        raiz.direita = new No(9);

        raiz.esquerda.esquerda = new No(4);
        raiz.esquerda.direita = new No(2);

        raiz.direita.direita = new No(5);
        raiz.direita.esquerda = new No(1);

        System.out.print("Percurso em ordem: ");
        emOrdem(raiz); // Saída esperada: 4 8 2 10 1 9 5

    }
}