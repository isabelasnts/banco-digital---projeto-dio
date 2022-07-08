public abstract class Conta implements IConta{

    private static final int agPadrao = 1;
    private static int Sequencial = 1;

    protected int agencia;
    protected int numero;
    protected int saldo;
    protected Cliente cliente;

    public Conta (Cliente cliente){
        this.agencia = Conta.agPadrao;
        this.numero = Sequencial++;
        this.cliente = cliente;
    }

    @Override   
    public void sacar (double valor){
        saldo -= valor;
    }

    @Override
    public void depositar (double valor){
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

    protected void imprimirInfoComum(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %s", this.agencia));
        System.out.println(String.format("Numero: %s", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}