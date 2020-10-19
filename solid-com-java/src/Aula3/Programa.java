
package Aula3;

public class Programa {

    public static void main(String[] args) {
        TabelaDePreco tabela = new TabelaDePrecoPadrao();
        TabelaDePreco tabela2 = new TabelaDePrecoDiferenciada();
        ServicoDeEntrega entrega = new Frete();
        
        CalculadorDePrecos calculadora = new CalculadorDePrecos(tabela, entrega);
        CalculadorDePrecos calculadora2 = new CalculadorDePrecos(tabela2, entrega);
        
        Compra compra = new Compra(1854.59, "Sao Paulo");
        
        System.out.println(compra.getValor());
        System.out.println(calculadora2.calcula(compra));
        
        
    }
    
}
