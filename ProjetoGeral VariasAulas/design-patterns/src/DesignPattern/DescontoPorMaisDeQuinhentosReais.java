
package DesignPattern;


public class DescontoPorMaisDeQuinhentosReais implements Desconto{
    
    private Desconto proximo;
    
    @Override
    public double desconto(Orcamento orcamento){
        if(orcamento.getValor() > 500.0){
            return orcamento.getValor() * 0.07;
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
