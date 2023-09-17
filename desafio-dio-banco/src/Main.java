public class Main {
    public static void main(String[] args) {
        Cliente mayk = new Cliente();
        mayk.setNome("Mayk");

        Conta contacorrente = new ContaCorrente(mayk);
        contacorrente.depositar(100);

        Conta contaPopanca = new ContaPoupanca(mayk);

        contacorrente.transferir(100,contaPopanca);

        contacorrente.imprimirExtrato();
        contaPopanca.imprimirExtrato();
    }
}
