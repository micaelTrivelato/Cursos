
package investimento;


public class Moderado implements Investimento{

    @Override
    public double calculaInvestimento(Conta conta) {
        boolean escolhido = new java.util.Random().nextDouble() > 0.50;
        if(escolhido){
            return (conta.getSaldo() * 0.007) * 0.75;
        }else{
           return (conta.getSaldo() * 0.025) * 0.75;
        }
 
    }
    
}
