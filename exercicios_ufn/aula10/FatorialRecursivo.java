package exercicios_ufn.aula10;

public class FatorialRecursivo {

    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // caso base
        }
        return n * fatorial(n - 1); // chamada recursiva : 5 * 4 * 3 * 2 * 1
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = fatorial(numero);
        System.out.println(numero + "! = " + resultado); // Saída: 5! = 120
    }
}
