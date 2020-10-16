package cap6;

import java.util.Calendar;

public class Programa {

    public static void main(String[] args) throws Exception {
        EscolheMapa mapaEscolhido = new EscolheMapa();
        Mapa mapa = mapaEscolhido.getMapa();
        mapa.devolveMapa("rua vergueiro"); 
        
        RelogioDoSistema relogio = new RelogioDoSistema();
        Calendar dataAtual = relogio.hoje();
        
    }
    
}
