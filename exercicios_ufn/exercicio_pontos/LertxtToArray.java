// Ler um txt com numeros separados por virgula e colocando num arrayList!
package exercicios_ufn.exercicio_pontos;

import java.util.ArrayList;

public class LertxtToArray {

	public static void main(String[] args) {
    
		String str_num = "1;7;3;8;5;6;11;23;100;98;4;74;35;300;";

		ArrayList<Integer> numero = new ArrayList<>();

		String[] partes = str_num.split(";"); // System.out .println( partes[1] );
		for (String p : partes) {
			numero.add(Integer.parseInt(p));
		}

		for (Integer num : numero) {
			System.out.println(" numeros extraidos : " + num);
		}
		for (int i = 0; i < numero.size(); i++) {
			System.out.println("elemento : " + i + " Extraido: " + numero.get(i));
		}

	}

}
