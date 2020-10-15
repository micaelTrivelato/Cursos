
package DesignPattern;

public class IKCV extends TemplateDeImpostoCondicional{
    
    public IKCV(Imposto outroImposto){
        super(outroImposto);
    }
    
    public IKCV(){}
    
    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for (Item item : orcamento.getItens()){
            if(item.getValor() > 100.0){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
    
}
