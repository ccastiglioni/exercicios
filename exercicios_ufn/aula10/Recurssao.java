package exercicios_ufn.aula10;

public class Recurssao {

    static void metodoExemplo(int varControle) {
        if (varControle >= -1) { // teste de parada
            // algum código antes do empilhamento
            System.out.println("Antes: " + varControle);

            metodoExemplo(varControle - 1); // ponto de recursão

            // algum código depois do desempilhamento
            System.out.println("Depois: " + varControle);
        }
    }

    public static void main(String[] args) {
        int i = 3;
        metodoExemplo(i);
    }
}
