
package state.conta.bancaria;

public interface EstadoDeUmaConta {
    
    void realizaDeposito(Conta conta, double valor);
    void realizaSaque(Conta conta, double valor);
}
