package Aula3;

public class CalculadorDePrecos {
    
    private TabelaDePreco tabela;
    private ServicoDeEntrega entrega;
    
    public CalculadorDePrecos(TabelaDePreco tabela, ServicoDeEntrega entrega){
        this.tabela = tabela;
        this.entrega = entrega;
    }
    
    public double calcula(Compra produto) {

        double desconto = tabela.descontoPara(produto.getValor());
        double frete = entrega.para(produto.getCidade());

        return produto.getValor() * (1 - desconto) + frete;

    }

}
