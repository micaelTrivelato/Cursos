package chain.of.responsibility.conta;

public class RespostaXml implements Resposta{
    private Resposta outraResposta;

    //public RespostaXml(Resposta outraResposta) {
    //   this.outraResposta = outraResposta;
    //} colocnado o proximo pelo construtor invés de pelo setter, foi apenas um exercicio
    
    
    
    @Override
    public void responde(Requisicao req, Conta conta) {
        if(req.getFormato() == Formato.XML) {
            System.out.println("<conta><titular>" + conta.getNomeTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
        }
        else {
          outraResposta.responde(req, conta);
        }
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.outraResposta = resposta;
    }
    
}
