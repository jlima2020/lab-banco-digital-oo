public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente("Venilton", "123.456.789-00");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
