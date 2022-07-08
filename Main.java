public class Main{ 

    public static void main (String[] args) {
        Cliente isa = new Cliente();
        isa.setNome("isa");

        Conta cc = new ContaCorrente(isa);
        Conta poupanca = new ContaPoupanca (isa);

        cc.depositar(500);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    
    }
}
