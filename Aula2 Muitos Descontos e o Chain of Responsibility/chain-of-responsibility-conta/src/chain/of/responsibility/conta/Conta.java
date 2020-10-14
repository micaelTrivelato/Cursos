
package chain.of.responsibility.conta;


public class Conta {
    
    private final double saldo;
    private final String nomeTitular;

    public Conta(double saldo, String nomeTitular) {
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
 
    
}
