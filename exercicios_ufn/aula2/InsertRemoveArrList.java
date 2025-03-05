package exercicios_ufn.aula2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class InsertRemoveArrList {
    public static void main(String[] args) {
        Scanner ObjScanner = new Scanner(System.in);

        System.out.println("Digite o número de elementos para inserir:");
        int numInsert = Integer.parseInt(ObjScanner.nextLine());

        System.out.println("Escolha a estrutura de dados: \n1: Vector \n2: ArrayList \n3: LinkedList");
        int useMetodo = Integer.parseInt(ObjScanner.nextLine());

        List<Violao> lista;

        switch (useMetodo) {
            case 1:
                lista = new Vector<>();
                break;
            case 2:
                lista = new ArrayList<>(numInsert);
                break;
            case 3:
                lista = new LinkedList<>();
                break;
            default:
                System.out.println("Opção inválida.");
                ObjScanner.close();
                return;
        }

        medirTempoExecucao(lista, numInsert, lista.getClass().getSimpleName());
        ObjScanner.close();
    }

    public static void medirTempoExecucao(List<Violao> lista_generic, int numInsert, String nomeLista) {
        // Medir tempo de inserção
        long startTime = System.nanoTime();

        for (int i = 0; i < numInsert; i++) {
            lista_generic.add(new Violao(i, i, "Clássico", 100 + i));
        }

        long endTime = System.nanoTime();
        long elapsedTime = (endTime - startTime) / 1_000_000;
        System.out.println("Tempo de inserção para " + nomeLista + ": " + elapsedTime + " ms para " + numInsert + " elementos");
        
        //aqui estou removendo o ultimo!
        //lista_generic.remove(lista_generic.size() - 1);

        //aqui estou pegando o elemento do meio
        int removeIndex = numInsert / 2;
        startTime = System.nanoTime();
        lista_generic.remove(removeIndex);

        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1_000_000;
        System.out.println("Tempo de remoção no meio da lista (" + nomeLista + "): " + elapsedTime + " ms");
    }
}
