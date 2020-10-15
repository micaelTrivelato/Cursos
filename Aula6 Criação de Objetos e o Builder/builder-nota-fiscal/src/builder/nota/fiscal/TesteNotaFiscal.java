
package builder.nota.fiscal;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class TesteNotaFiscal {

    public static void main(String[] args) {
        
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.paraEmpresa("Lello Condomínios")
        .comCNPJ("44.166.627/0001-92")
        .comItem(new ItemDaNota("Prédio enorme e barato", 21.99))
        .comItem(new ItemDaNota("Prédio pequeno caro", 9000000.0))
        .comItem(new ItemDaNota("Prédio médio e com preço justo", 350000.0))
        .comObservacoes("Observação")
        .naDataAtual();
        
        NotaFiscal nf = builder.constroi();
        
        System.out.println(nf.getValorBruto());
        System.out.println(nf.getImpostos());
        
        ItemDaNotaBuilder builderItem = new ItemDaNotaBuilder();
        builderItem.insereNome("Item sofisticado")
        .insereValor(500);
        
        ItemDaNota item = builderItem.ItemDaNotaconstroi();
        
        System.out.println(item.getNome());
        System.out.println(item.getValor());
    
    }
    
}
