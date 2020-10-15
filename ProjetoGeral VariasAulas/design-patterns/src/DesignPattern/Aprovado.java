
package DesignPattern;

public class Aprovado implements EstadoDeUmOrcamento{
    
    private boolean descontoAplicado = false;
    
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento){
        if(!descontoAplicado){
            orcamento.valor -= orcamento.valor * 0.02;
            descontoAplicado = true;
        }
        else throw new RuntimeException("Desconto já aplicado!");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está aprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos aprovados não podem ser reprovados");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
}
