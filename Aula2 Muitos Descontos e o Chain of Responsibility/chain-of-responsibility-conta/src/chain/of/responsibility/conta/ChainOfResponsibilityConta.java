
package chain.of.responsibility.conta;

public class ChainOfResponsibilityConta {


    public static void main(String[] args) {
        
        VerificaFormato verifica = new VerificaFormato();
        Requisicao req1 = new Requisicao(Formato.XML);
        Requisicao req2 = new Requisicao(Formato.CSV);
        Requisicao req3 = new Requisicao(Formato.PORCENTO);
        
        Conta conta = new Conta(1000, "José");
        
        verifica.Verifica(req1, conta);
        verifica.Verifica(req2, conta);
        verifica.Verifica(req3, conta);
        
        
    }
    
}
