
package Aula2;

import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        
        List<AcaoAposGerarNota> acoes = new ArrayList<AcaoAposGerarNota>();
        
        acoes.add(new EnviadorDeEmail());
        acoes.add(new NotaFiscalDao());
        
        Fatura fatura = new Fatura(100);
        NotaFiscal nf = new NotaFiscal(500, 5);
        GeradorDeNotaFiscal gera = new GeradorDeNotaFiscal(acoes);
        
        gera.gera(fatura);
        
        
    }
    
}
