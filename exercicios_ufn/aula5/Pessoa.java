package exercicios_ufn.aula5;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Pessoa {

    public static void main(String[] args) {

        Scanner tecladoIn = new Scanner(System.in);
        Map<String,String> pessoas = new HashMap<>(); 

        System.out.println("quantas pessoas quer Adicionar?");
        int totalPessoas = tecladoIn.nextInt();
        tecladoIn.nextLine(); // Consumir a quebra de linha

        String strAviso = "";
        String email = "";

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Digite o nome " + strAviso + " da pessoa " + (i + 1) + ":"); // syso
            strAviso = "";
            String nome = tecladoIn.nextLine();
            if (nome.matches("^[a-zA-ZÀ-ú]+( [a-zA-ZÀ-ú]+){1,2}$")) {
                
                email = gerarEmail(nome,false);
                if(!pessoas.containsKey(email)){
                    pessoas.put(email, nome);
                }else{
                    email = gerarEmail(nome,true);
                    pessoas.put(email, nome);
                }
            } else {
                strAviso = "COMPLETO(no Mínimo 2 e no Máximo 3 palavras)";
                i--;
            }
        }

        System.out.println("\nLista de pessoas e emails adicionados:");
        for (Map.Entry<String, String> pessoaMap : pessoas.entrySet()) {
            System.out.println("Nome: " + pessoaMap.getValue());
            System.out.println("Email: " + pessoaMap.getKey());
            System.out.println("-----------------------------");
        }
        
    }

    static String gerarEmail(String nome, Boolean repetido) {
        String email;
        String [] arrNome = nome.split(" ");
        if (repetido) {
            Random numAl = new Random();
            int rand = numAl.nextInt(20); 
            email= arrNome[0]+'.'+arrNome[arrNome.length-1]+rand+"@ufn.edu.br";    
        }else{
             email = arrNome[0]+'.'+arrNome[arrNome.length-1] +"@ufn.edu.br";    
        }

        return email;

    }
}
