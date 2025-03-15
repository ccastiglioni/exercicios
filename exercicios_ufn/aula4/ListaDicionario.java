package exercicios_ufn.aula4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaDicionario {
    public static void main(String[] args) { // Corrigido o método main

        List<Map<String, String>> listaDeDicionario = new ArrayList<>(); // Corrigida a sintaxe

        // Criando primeiro dicionário
        Map<String, String> dicionario_1 = new HashMap<>();
        dicionario_1.put("nome", "Sandro");
        dicionario_1.put("idade", "10");

        // Criando segundo dicionário
        Map<String, String> dicionario_2 = new HashMap<>();
        dicionario_2.put("nome", "Carlos");
        dicionario_2.put("idade", "18");

        // Adicionando os dicionários à lista
        listaDeDicionario.add(dicionario_1);
        listaDeDicionario.add(dicionario_2);

        // Exibindo os valores armazenados na lista de dicionários
        System.out.println("Lista de Dicionários:");
        for (Map<String, String> dicionario : listaDeDicionario) {
            System.out.println("Nome: " + dicionario.get("nome") + ", Idade: " + dicionario.get("idade"));
        }
    }
}
