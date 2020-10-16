package cap3;

import static java.time.temporal.TemporalQueries.zone;
import java.util.Calendar;

public class Programa {

    public static void main(String[] args) {
        Historico historico = new Historico();
        Contrato c1 = new Contrato(Calendar.getInstance(), "Micael", TipoContrato.NOVO);
        historico.adiciona(c1.salvaEstado());
        
        System.out.println(c1.getTipo());
        
        c1.avanca();
        
        historico.adiciona(c1.salvaEstado());
        
        System.out.println(c1.getTipo());
        
        Estado estadoAnterior = historico.pega(0);
        System.out.println(estadoAnterior.getEstado().getTipo());
        
        c1.restaura(historico.pega(0));
        
        System.out.println(c1.getTipo());
        
        

    }
    
}
