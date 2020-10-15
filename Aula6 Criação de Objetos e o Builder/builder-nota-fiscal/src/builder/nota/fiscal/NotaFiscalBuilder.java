package builder.nota.fiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class NotaFiscalBuilder {
    
    private String razacoSocial;
    private String cnpj;
    
    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
    private double valorBruto;
    private double imposto;
    private String observacoes;
    private Calendar data;
    
    public NotaFiscalBuilder paraEmpresa(String razaoSocial){
        this.razacoSocial = razaoSocial;
        return this;
    }
    
    public NotaFiscalBuilder comCNPJ(String cnpj){
        this.cnpj = cnpj;
        return this;
    }
    
    public NotaFiscalBuilder comItem(ItemDaNota item){
        todosItens.add(item);
        valorBruto += item.getValor();
        imposto += item.getValor() * 0.05;
        return this;
    
    }
    
    public NotaFiscalBuilder comObservacoes(String observacoes){
        this.observacoes = observacoes;
        return this;
                
    }
    
    public NotaFiscalBuilder naDataAtual(){
        this.data = Calendar.getInstance();
        return this;
    }
    
    public NotaFiscal constroi(){
        return new NotaFiscal(razacoSocial, cnpj, data, valorBruto, imposto, todosItens, observacoes);
    }
    
}
