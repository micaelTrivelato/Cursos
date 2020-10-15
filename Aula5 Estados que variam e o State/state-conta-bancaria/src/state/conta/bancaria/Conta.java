package state.conta.bancaria;

public class Conta {
    private double saldo;
    protected EstadoDeUmaConta estadoAtual;

    public Conta(double saldo) {
        this.saldo = saldo;
        estadoAtual = new SaldoPositivo();
    }
       
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void realizaDeposito(double valor) {
        estadoAtual.realizaDeposito(this, valor);
    }

    public void realizaSaque(double valor) {
       estadoAtual.realizaSaque(this, valor);
    }
    

    
}
