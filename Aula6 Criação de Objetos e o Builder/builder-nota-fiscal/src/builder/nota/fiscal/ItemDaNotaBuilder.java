package builder.nota.fiscal;

public class ItemDaNotaBuilder {
    private String nome;
    private double valor;
    
    public ItemDaNotaBuilder insereNome(String nome){
        this.nome = nome;
        return this;
    }
    
    public ItemDaNotaBuilder insereValor(double valor){
        this.valor = valor;
        return this;
    }
    
    public ItemDaNota ItemDaNotaconstroi(){
        
        return new ItemDaNota(nome, valor);
        
    }
}
