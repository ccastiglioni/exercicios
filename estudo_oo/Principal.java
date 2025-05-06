package estudo_oo;

import java.time.LocalDate;

/*
"Criando e Utilizando Objetos com a Classe Pessoa"
Como criar um objeto
Como acessar atributos e métodos
*/

//Uso: normalmente usada para classes auxiliares que não precisam ser acessadas de fora do pacote. (só visível dentro do mesmo pacote)
class ClassPessoa {

    int ano_nasc;
    String nome;

    void Saudacao() {
        System.out.println("Bem vindo  " + nome);
    }

    static int calcular(int ano_nasc) {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - ano_nasc;
    }

}

// O nome do arquivo .java deve ser igual ao nome dessa classe pública.
public class Principal {

    public static void main(String[] args) {

        ClassPessoa obj_p = new ClassPessoa();
        obj_p.nome = "Cleber";
        obj_p.Saudacao();
        System.out.println("Idade: " + ClassPessoa.calcular(1981));
    }
}