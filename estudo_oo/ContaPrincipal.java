package estudo_oo;

public class ContaPrincipal {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Cleber");
        conta.setNumeroConta(12345);
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.exibirInformacoes();
    }

}
