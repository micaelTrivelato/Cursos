/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao.teste;

import leilao.Lance;
import leilao.Usuario;
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
public class LanceTesteTest {
    
    private Usuario usuario;
    
    public LanceTesteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.usuario = new Usuario("usuario");
    }
    
    @After
    public void tearDown() {
    }


    @Test(expected=IllegalArgumentException.class)
    public void deveRecusarLancesComValorZero(){
        new Lance(usuario, 0.0);
        
    }
    @Test(expected=IllegalArgumentException.class)
    public void deveRecusarLancesComValorNegativo(){
        new Lance(usuario, -5.0);
    }
    
}
