
package DesignPattern;

public abstract class TemplateDeImpostoCondicional extends Imposto{

    public TemplateDeImpostoCondicional(Imposto outroImposto){
        super(outroImposto);
    }
    
    public TemplateDeImpostoCondicional(){}
    
    @Override
    public final double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)){
            return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
        } else {
            return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
        }
    }

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento); 
            
    public abstract double minimaTaxacao(Orcamento orcamento); 
    
}
