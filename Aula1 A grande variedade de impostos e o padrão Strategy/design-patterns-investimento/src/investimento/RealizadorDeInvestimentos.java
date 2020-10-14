
package investimento;


public class RealizadorDeInvestimentos {
    public void realizaInvestimento(Conta conta, Investimento investimento){
        double lucro = investimento.calculaInvestimento(conta);
        conta.setSaldo(conta.getSaldo() + lucro);
        System.out.println("Valor do Lucro: " + lucro);
    }
}
