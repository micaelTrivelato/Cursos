
package template.method.relatorios;

public class Conta {
    private String nome;
    private String numero;
    private String agencia;
    private double saldo;

    public Conta(String nome, String numero, String agencia, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

   
    
    
    
}
