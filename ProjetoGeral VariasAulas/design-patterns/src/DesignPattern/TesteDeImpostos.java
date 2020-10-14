
package DesignPattern;


public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto iccc = new ICCC();
        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        
        Orcamento orcamento1 = new Orcamento(1000);
        Orcamento orcamento2 = new Orcamento(1000);
        Orcamento orcamento3 = new Orcamento(1000);
        
        CalculadorDeImpostos calculador = new CalculadorDeImpostos();
        
        calculador.realizaCalculo(orcamento1, iccc);
        calculador.realizaCalculo(orcamento2, icms);
        calculador.realizaCalculo(orcamento3, iss);
    }
    
}
