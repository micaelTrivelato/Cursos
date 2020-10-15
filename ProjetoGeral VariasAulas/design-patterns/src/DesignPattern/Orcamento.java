package DesignPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Orcamento {
    
    protected  double valor;
    private final List<Item> itens;
    
    protected EstadoDeUmOrcamento estadoAtual;
    
    public Orcamento(double valor){
        this.valor = valor;
        itens = new ArrayList<Item>();
        estadoAtual = new EmAprovacao();
    }

    public double getValor() {
        return valor;
    }

    public void adicionaItem(Item item){
        itens.add(item);
    }
    
    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }
    
    public boolean contemItemDeNome(String nomeDoItem) {
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nomeDoItem)) return true;
        }
        return false;
    }

    void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }
    
    public void aprova(){
        estadoAtual.aprova(this);
    }
    
    public void reprova(){
        estadoAtual.reprova(this);
    }
    
    public void finaliza(){
        estadoAtual.finaliza(this);
    }
    
}
