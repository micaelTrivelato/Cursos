
package chain.of.responsibility.conta;


public class VerificaFormato {
    public void Verifica(Requisicao req, Conta conta){
        
        Resposta r1 = new RespostaXml();
        Resposta r2 = new RespostaCSV();
        Resposta r3 = new RespostaPorcentagem();
        
        r1.setProxima(r2);
        r2.setProxima(r3);
        r1.responde(req, conta);
     
    }
 
}
