package exercicios_ufn.aula5;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PessoaBucket {

    public static void main(String[] args) {
        Scanner tecladoIn = new Scanner(System.in);
        
        // O Java usa internamente um array de buckets para implementar HashMap
        Map<String, String> pessoas = new HashMap<>();
        
        System.out.println("Quantas pessoas deseja adicionar?");
        int totalPessoas = tecladoIn.nextInt();
        tecladoIn.nextLine(); // consumir quebra de linha

        String strAviso = "";

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Digite o nome " + strAviso + " da pessoa " + (i + 1) + ":");
            strAviso = "";
            String nome = tecladoIn.nextLine();

            if (nome.matches("^[a-zA-ZÀ-ú]+( [a-zA-ZÀ-ú]+){1,2}$")) {
                String email = gerarEmail(nome, false);

                if (!pessoas.containsKey(email)) {
                    pessoas.put(email, nome);
                } else {
                    // Demonstração prática de colisão em buckets do HashMap:
                    System.out.println("Colisão detectada! Email já existe no bucket do HashMap.");
                    email = gerarEmail(nome, true);
                    pessoas.put(email, nome);
                    System.out.println("Colisão resolvida com geração de email único: " + email);
                }
            } else {
                strAviso = "COMPLETO (no mínimo 2 e no máximo 3 palavras)";
                i--;
            }
        }

        // Explicação detalhada do acesso eficiente por bucket:
        System.out.println("\nAcessando dados armazenados rapidamente usando buckets do HashMap:\n");

        // Cada entrada do Map.Entry está alocada internamente em um bucket do HashMap.
        for (Map.Entry<String, String> entrada : pessoas.entrySet()) {
            int bucketIndex = (entrada.getKey().hashCode() & (16 - 1)); // Considerando a capacidade inicial padrão (16 buckets)
            System.out.println("Bucket [" + bucketIndex + "]: {Email: " + entrada.getKey() + ", Nome: " + entrada.getValue() + "}");
        }

        tecladoIn.close();
    }

    static String gerarEmail(String nome, boolean repetido) {
        String[] arrNome = nome.toLowerCase().split(" ");
        String email;

        if (repetido) {
            Random numAl = new Random();
            int rand = numAl.nextInt(1000);
            email = arrNome[0] + "." + arrNome[arrNome.length - 1] + rand + "@ufn.edu.br";
        } else {
            email = arrNome[0] + "." + arrNome[arrNome.length - 1] + "@ufn.edu.br";
        }

        return email;
    }
}
