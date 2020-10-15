package state.conta.bancaria;


public class SaldoNegativo implements EstadoDeUmaConta{

    @Override
    public void realizaDeposito(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + (valor * 0.95));
        if(conta.getSaldo() > 0) conta.estadoAtual = new SaldoPositivo();
    }

    @Override
    public void realizaSaque(Conta conta, double valor) {
        throw new RuntimeException("Não é possível realizar o saque em conta negativa");
    }
    
    
}
