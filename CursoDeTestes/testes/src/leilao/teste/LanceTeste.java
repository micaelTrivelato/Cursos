package leilao.teste;

import leilao.Lance;
import leilao.Leilao;
import leilao.Usuario;
import leilao.servico.Avaliador;
import org.junit.Before;
import org.junit.Test;

public class LanceTeste {
    

    private Usuario usuario;
    
    @Before
    public void criaUsuario(){
        this.usuario = new Usuario("usuario");

    }
    
    @Test(expected=IllegalArgumentException.class)
    public void deveRecusarLancesComValorZero(){
        Lance lance = new Lance(usuario, 0.0);
        
    }
    @Test(expected=IllegalArgumentException.class)
    public void deveRecusarLancesComValorNegativo(){
        Lance lance = new Lance(usuario, -5.0);
    }
}
