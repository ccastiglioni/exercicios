package exercicios_ufn.aula4; 

import java.util.ArrayList;

public class ListaLista {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> lista3 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> principal = new ArrayList<>(); // Lista de listas

        // Adicionando elementos em lista1
        lista1.add(10);
        lista1.add(11);
        principal.add(lista1);

        lista2.add(13);
        lista2.add(5);
        principal.add(lista2);

        lista3.add(52);
        lista3.add(1);
        lista3.add(80);
        principal.add(lista3);

        // Exibir os números na lista principal
        System.out.println("Listas na estrutura principal:");
        for (ArrayList<Integer> listaSec : principal) {
            //System.out.println(lista);
            for ( Integer listafinal : listaSec) {
              //if(listafinal%2=0){
                System.out.println(listafinal);
              //}
            }
        }

    }
}
