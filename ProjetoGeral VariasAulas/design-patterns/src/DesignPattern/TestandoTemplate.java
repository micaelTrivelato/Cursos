
package DesignPattern;

public class TestandoTemplate {

    public static void main(String[] args) {
        Imposto icpp = new ICPP();
        Imposto ikcv = new IKCV();
        
        Item caneta = new Item("Caneta", 250.0);
        Item lapis = new Item("Lapis", 250.0);
        Item lapisBarato = new Item("Lapis", 1.0);
        
        Orcamento orcamento1 = new Orcamento(1000);
        Orcamento orcamento2 = new Orcamento(499);
        Orcamento orcamento3 = new Orcamento(1000);
        Orcamento orcamento4 = new Orcamento(1000);
        
        CalculadorDeImpostos calculador = new CalculadorDeImpostos();
        
        orcamento1.adicionaItem(lapis);
        orcamento1.adicionaItem(caneta);
        orcamento2.adicionaItem(lapis);
        orcamento2.adicionaItem(caneta);
        orcamento3.adicionaItem(lapis);
        orcamento4.adicionaItem(lapisBarato);
        
        calculador.realizaCalculo(orcamento1, icpp);
        calculador.realizaCalculo(orcamento2, icpp);
        calculador.realizaCalculo(orcamento3, ikcv);
        calculador.realizaCalculo(orcamento4, ikcv);
    }
    
}
