
package investimento;

public class Arrojado implements Investimento{

    @Override
    public double calculaInvestimento(Conta conta) {
         double escolhido = new java.util.Random().nextDouble();
        if(escolhido <= 0.19){
            return (conta.getSaldo() * 0.05) * 0.75;
        }else if(escolhido <= 0.49){
           return (conta.getSaldo() * 0.03) * 0.75;
        }else{
            return (conta.getSaldo() * 0.006) * 0.75;
        }
    }
    
}
