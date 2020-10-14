
package DesignPattern;


public class TesteDeDescontos {


    public static void main(String[] args) {
        
        CalculadorDeDesconto descontos = new CalculadorDeDesconto();
        
        Item caneta = new Item("Caneta", 250.0);
        Item lapis = new Item("Lapis", 250.0);
        
        Orcamento orcamento = new Orcamento(600.0);
        orcamento.adicionaItem(caneta);
        orcamento.adicionaItem(lapis);
        
        double descontoFinal = descontos.calcula(orcamento);
        
        System.out.println(descontoFinal);
        
        Orcamento orcamento2 = new Orcamento(400);
        
        orcamento2.adicionaItem(lapis);
        orcamento2.adicionaItem(lapis);
        orcamento2.adicionaItem(lapis);
        orcamento2.adicionaItem(caneta);
        orcamento2.adicionaItem(caneta);
        orcamento2.adicionaItem(caneta);
        
        descontoFinal = descontos.calcula(orcamento2);
        
        System.out.println(descontoFinal);
        
        Orcamento orcamento3 = new Orcamento(100.0);
        orcamento3.adicionaItem(caneta);
        orcamento3.adicionaItem(lapis);
        
        descontoFinal = descontos.calcula(orcamento3);
        
        System.out.println(descontoFinal);
        
        
    }
    
}
