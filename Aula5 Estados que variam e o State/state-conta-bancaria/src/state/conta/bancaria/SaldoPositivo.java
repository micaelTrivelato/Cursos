package state.conta.bancaria;

public class SaldoPositivo implements EstadoDeUmaConta{

    @Override
    public void realizaDeposito(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + (valor * 0.98));
    }

    @Override
    public void realizaSaque(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() - valor);
        if(conta.getSaldo() < 0) conta.estadoAtual = new SaldoNegativo();
    }
    
}
