/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao.teste;

import leilao.Lance;
import leilao.Leilao;
import leilao.Usuario;
import leilao.servico.Avaliador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author Micael Trivelato
 */
public class TesteDoAvaliadorTest {
    
    public TesteDoAvaliadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TesteDoAvaliador.
     */
    @Test
    public void deveEntenderLancesEmOrdemCrescente() {
        //parte 1: criar cenários
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");
        
        Leilao leilao = new Leilao("Playstation 5 que finalmente tenho esperanças de comprar");
        
        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(jose, 300.0));
        leilao.propoe(new Lance(maria, 400.0));
        
        //parte 2: executar ação
        Avaliador leiloeira = new Avaliador();
        leiloeira.avalia(leilao);
        leiloeira.mediaLances(leilao);
        
        //parte 3: validação
        double maiorEsperado = 400;
        double menorEsperado = 250;
        double mediaEsperada = 950.0 / 3;
        
        assertEquals(maiorEsperado, leiloeira.getMaiorLance(), 0.00001);
        
        assertEquals(menorEsperado, leiloeira.getMenorLance(), 0.00001);
        
        assertEquals(mediaEsperada, leiloeira.getMediaLances(), 0.00001);
    }
    
    @Test
    public void deveEntenderLeilaoComApenasUmLance(){
        Usuario joao = new Usuario("João");
        Leilao leilao = new Leilao("Playstation 5 que finalmente tenho esperanças de comprar");
        
        leilao.propoe(new Lance(joao, 1000.0));
        
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        assertEquals(1000, leiloeiro.getMaiorLance(), 0.00001);
        assertEquals(1000, leiloeiro.getMenorLance(), 0.00001);
    }
    
}
