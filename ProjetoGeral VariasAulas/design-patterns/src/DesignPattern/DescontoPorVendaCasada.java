
package DesignPattern;

public class DescontoPorVendaCasada implements Desconto{

    private Desconto proximo;

    @Override
    public double desconto(Orcamento orcamento) {
        if(orcamento.contemItemDeNome("CANETA") && orcamento.contemItemDeNome("LAPIS")){
            return orcamento.getValor() * 0.05;
        }
        else{
            return proximo.desconto(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
    
}
