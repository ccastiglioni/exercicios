package exercicios_ufn.aula5;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PessoaBucket {

    public static void main(String[] args) {
        Scanner tecladoIn = new Scanner(System.in);
        
        Map<String, String> pessoas = new HashMap<>();
        
        System.out.println("Quantas pessoas deseja adicionar?");
        int totalPessoas = tecladoIn.nextInt();
        tecladoIn.nextLine(); 

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

        System.out.println("\nAcessando dados armazenados rapidamente usando buckets do HashMap:\n");

        for (Map.Entry<String, String> entrada : pessoas.entrySet()) {
           // Considerando a capacidade inicial padrão (16 buckets)
            int bucketIndex = (entrada.getKey().hashCode() & (16 - 1)); 
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
