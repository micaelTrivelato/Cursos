
package investimento;

public class TesteInvestimento {


    public static void main(String[] args) {
        Investimento conservador = new Conservador();
        Investimento moderado = new Moderado();
        Investimento arrojado = new Arrojado();
        
        Conta conta = new Conta(1000);
        Conta conta2 = new Conta(1000);
        Conta conta3 = new Conta(1000);
        
        RealizadorDeInvestimentos calculador1 = new RealizadorDeInvestimentos();
        RealizadorDeInvestimentos calculador2 = new RealizadorDeInvestimentos();
        RealizadorDeInvestimentos calculador3 = new RealizadorDeInvestimentos();
        
        System.out.println("Conta conservador antes do investimento " + conta.getSaldo());
        calculador1.realizaInvestimento(conta, conservador);
        System.out.println("Conta conservador após o investimento " + conta.getSaldo());
        
        System.out.println("");
        System.out.println("Conta moderado antes do investimento " + conta2.getSaldo());
        calculador2.realizaInvestimento(conta2, moderado);
        System.out.println("Conta moderado antes do investimento " + conta2.getSaldo());
        
        System.out.println("");
        System.out.println("Conta arrojado antes do investimento " + conta3.getSaldo());
        calculador3.realizaInvestimento(conta3, arrojado);
        System.out.println("Conta arrojado antes do investimento " + conta3.getSaldo());
        
        
    }
    
}
