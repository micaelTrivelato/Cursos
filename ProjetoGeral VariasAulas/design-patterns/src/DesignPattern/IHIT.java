
package DesignPattern;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional{
   
    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        List<String> itemOrcamento = new ArrayList<String>();
        for(Item item : orcamento.getItens()){
            if(itemOrcamento.contains(item.getNome()))return true;
            else itemOrcamento.add(item.getNome());
        }
        
        return false;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100.0;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * (0.01 * orcamento.getItens().size());
    }
}
