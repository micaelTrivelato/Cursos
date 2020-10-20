/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao.teste;

import leilao.Lance;
import leilao.Leilao;
import leilao.Usuario;
import static leilao.teste.LeilaoMatcher.temUmLance;
import static org.hamcrest.Matchers.equalTo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Micael Trivelato
 */
public class LeilaoTesteTest {
    
    public LeilaoTesteTest() {
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
     * Test of deveReceberUmLance method, of class LeilaoTeste.
     */
    @Test
    public void deveReceberUmLance() {
        Leilao leilao = new CriadorDeLeilao().para("Macbook Pro 15").constroi();
        assertEquals(0, leilao.getLances().size());

        Lance lance = new Lance(new Usuario("Steve Jobs"), 2000);
        leilao.propoe(lance);

        assertThat(leilao.getLances().size(), equalTo(1));
        assertThat(leilao, temUmLance(lance));
    }
    
    @Test
    public void deveReceverVariosLances(){
        Leilao leilao = new Leilao("Um PC muito caro e Diferenciado");
        assertEquals(0, leilao.getLances().size());

        leilao.propoe(new Lance(new Usuario("Micael"), 2000.0));
        leilao.propoe(new Lance(new Usuario("Trivelato"), 3000.0));
        
        assertEquals(2, leilao.getLances().size());
        assertEquals(2000.0, leilao.getLances().get(0).getValor(), 0.00001);
        assertEquals(3000.0, leilao.getLances().get(1).getValor(), 0.00001);
    }
    
    @Test
    public void naoDeveAceitarDoisLancesSeguidosDoMesmoUsuario(){
        Leilao leilao = new Leilao("Um PC muito caro e Diferenciado");
        assertEquals(0, leilao.getLances().size());
        
        Usuario micael = new Usuario("Micael");
        
        leilao.propoe(new Lance(micael, 2000.0));
        leilao.propoe(new Lance(micael, 3000.0));
        
        assertEquals(1, leilao.getLances().size());
        assertEquals(2000.0, leilao.getLances().get(0).getValor(), 0.00001);
    }
    
    @Test
    public void naoDeveAceitarMaisDoQue5LancesDeUmMesmoUsuario(){
        Leilao leilao = new Leilao("Um PC muito caro e Diferenciado");
        assertEquals(0, leilao.getLances().size());
        
        Usuario micael = new Usuario("Micael");
        Usuario trivelato = new Usuario("Trivelato");
        
        leilao.propoe(new Lance(micael, 2000.0));
        leilao.propoe(new Lance(trivelato, 3000.0));
        
        leilao.propoe(new Lance(micael, 4000.0));
        leilao.propoe(new Lance(trivelato, 5000.0));
        
        leilao.propoe(new Lance(micael, 6000.0));
        leilao.propoe(new Lance(trivelato, 7000.0));
        
        leilao.propoe(new Lance(micael, 8000.0));
        leilao.propoe(new Lance(trivelato, 9000.0));
        
        leilao.propoe(new Lance(micael, 1000.0));
        leilao.propoe(new Lance(trivelato, 11000.0));
        
        //deve ser ignorado
        leilao.propoe(new Lance(micael, 1200.0));
        
        assertEquals(10, leilao.getLances().size());
        assertEquals(11000.0, leilao.getLances().get(leilao.getLances().size()-1).getValor(), 0.00001);
    }
    
    @Test
    public void deveDobrarUltimoLanceDoUsuario(){
        Leilao leilao = new Leilao("Macbook Pro 15");
        Usuario steveJobs = new Usuario("Steve Jobs");
        Usuario billGates = new Usuario("Bill Gates");

        leilao.propoe(new Lance(steveJobs, 2000));
        leilao.propoe(new Lance(billGates, 3000));
        leilao.dobraLance(steveJobs);

        assertEquals(4000, leilao.getLances().get(2).getValor(), 0.00001);
    }
}
