
package DesignPattern;

public abstract class TemplateDeImpostoCondicional implements Imposto{

    @Override
    public double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)){
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento); 
            
    public abstract double minimaTaxacao(Orcamento orcamento); 
    
}
