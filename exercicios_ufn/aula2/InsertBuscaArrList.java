package exercicios_ufn.aula2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class InsertBuscaArrList {
    public static void main(String[] args) {
        List<Violao> ObjvetVl = new Vector<>();
        List<Violao> ObjarrVl = new ArrayList<>();
        List<Violao> ObjlinkVl = new LinkedList<>();
        Scanner ObjScanner = new Scanner(System.in);

        System.out.println("Digite o número de elementos para inserir:");
        int numInsert = Integer.parseInt(ObjScanner.nextLine());

        System.out.println("Escolha a estrutura de dados: \n1: Vector \n2: ArrayList \n3: LinkedList");
        int useMetodo = Integer.parseInt(ObjScanner.nextLine());

        if (useMetodo == 1) {
            medirTempoExecucao(ObjvetVl, numInsert, "Vector");
        } else if (useMetodo == 2) {
            medirTempoExecucao(ObjarrVl, numInsert, "ArrayList");
        } else {
            medirTempoExecucao(ObjlinkVl, numInsert, "LinkedList");
        }

        ObjScanner.close();
    }

 
    public static void medirTempoExecucao(List<Violao> lista_generic, int numInsert, String nomeLista) {
        long startTime = System.nanoTime(); 

        for (int i = 0; i <= numInsert; i++) {
            Violao Objv = new Violao(i, "Clássico", 100 + i);
            lista_generic.add(Objv);
            System.out.println("Insert " + nomeLista + ": " + i);
        }

        long endTime = System.nanoTime(); 
        long elapsedTime = (endTime - startTime) / 1_000_000; 
        System.out.println("Tempo de execução para " + nomeLista + ": " + elapsedTime + " ms" + "Para:"+ numInsert+ " Elementos");
    }
}
