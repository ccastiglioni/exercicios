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

        long startTime, endTime, elapsedTime;  

        if (useMetodo == 1) {
            startTime = System.nanoTime(); //  cronômetro
            
            for (int i = 0; i <= numInsert; i++) {
                Violao Objv = new Violao(i, "Clássico", 100 + i);
                ObjvetVl.add(Objv);
                System.out.println("Insert Vector: " + i);
            }
            
            endTime = System.nanoTime(); 
            elapsedTime = (endTime - startTime) / 1_000_000; 
            System.out.println("Tempo de execução para Vector: " + elapsedTime + " ms");

        } else if (useMetodo == 2) {
            startTime = System.nanoTime(); // Inicia o cronômetro
            
            for (int i = 0; i <= numInsert; i++) {
                Violao Objv = new Violao(i, "Clássico", 100 + i);
                ObjarrVl.add(Objv);
                System.out.println("Insert ArrayList: " + i);
            }
            
            endTime = System.nanoTime(); // Finaliza o cronômetro
            elapsedTime = (endTime - startTime) / 1_000_000; // Convertendo para milissegundos
            System.out.println("Tempo de execução para ArrayList: " + elapsedTime + " ms");

        } else {
            startTime = System.nanoTime(); // Inicia o cronômetro
            
            for (int i = 0; i <= numInsert; i++) {
                Violao Objv = new Violao(i, "Clássico", 100 + i);
                ObjlinkVl.add(Objv);
                System.out.println("Insert LinkedList: " + i);
            }
            
            endTime = System.nanoTime(); // Finaliza o cronômetro
            elapsedTime = (endTime - startTime) / 1_000_000; // Convertendo para milissegundos
            System.out.println("Tempo de execução para LinkedList: " + elapsedTime + " ms");
        }

        ObjScanner.close();
    }
}
