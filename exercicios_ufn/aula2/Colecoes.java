package exercicios_ufn.aula2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Colecoes {
   public static void main(String[] args) {
        // Criando diferentes tipos de listas para armazenar objetos de Violao
        List<Violao> lv1 = new ArrayList<>();
        List<Violao> lv2 = new LinkedList<>();
        List<Violao> lv3 = new Vector<>();

        Violao v1, v2, v3;

        v1 = new Violao(6, "Clássico", 1500.0);
        v2 = new Violao(6, "OM", 5000.5);
        v3 = new Violao(7, "Choro", 9900.50);

        // Adicionando os objetos às listas
        lv1.add(v1);
        lv1.add(v2);
        lv1.add(v3);

        lv2.add(v1);
        lv2.add(v2);
        lv2.add(v3);

        lv3.add(v1);
        lv3.add(v2);
        lv3.add(v3);

        // Exibindo os elementos da lista lv1
        System.out.println("Violões armazenados na ArrayList:");
        for (Violao violao : lv1) {
            System.out.println(violao);
        }
    }
}
