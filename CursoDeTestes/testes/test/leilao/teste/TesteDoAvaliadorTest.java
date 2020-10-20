/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao.teste;

import java.util.List;
import leilao.Lance;
import leilao.Leilao;
import leilao.Usuario;
import leilao.servico.Avaliador;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
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
        System.out.println("before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("after class");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    private Avaliador leiloeiro;
    private Usuario joao;
    private Usuario maria;
    private Usuario jose;
    
    @Before
    public void criaAvaliador(){
        this.leiloeiro = new Avaliador();
        this.jose = new Usuario("José");
        this.maria = new Usuario("Maria");
        this.joao = new Usuario("João");
    }
    
    @Test
    public  void deveEntenderLancesEmOrdemCrescente() {
        //parte 1: criar cenários 
        Leilao leilao = new CriadorDeLeilao().para("Playstation 5 que finalmente tenho esperanças de comprar")
                .lance(joao, 250.0)
                .lance(jose, 300.0)
                .lance(maria, 400.0)
                .constroi();
        
        //parte 2: executar ação
        leiloeiro.avalia(leilao);
        leiloeiro.mediaLances(leilao);
        
        //parte 3: validação
        double mediaEsperada = 950.0 / 3;
        
        assertThat(leiloeiro.getMenorLance(), equalTo(250.0));
        assertThat(leiloeiro.getMaiorLance(), equalTo(400.0));        
        assertThat(leiloeiro.getMediaLances(), equalTo(mediaEsperada));   
    }

    @Test
    public void deveEntenderLeilaoComApenasUmLance(){
        Leilao leilao = new CriadorDeLeilao().para("Playstation 5 que finalmente tenho esperanças de comprar")
                .lance(joao, 1000.0)
                .constroi();
        
        leiloeiro.avalia(leilao);
        
        assertThat(leiloeiro.getMenorLance(), equalTo(1000.0));
        assertThat(leiloeiro.getMaiorLance(), equalTo(1000.0));
    }
    
    @Test
    public void deveEncontrarOsTresMaioresLances(){
        Leilao leilao = new CriadorDeLeilao().para("Playstation 5 que finalmente tenho esperanças de comprar")
                .lance(joao, 100.0)
                .lance(jose, 200.0)
                .lance(joao, 300.0)
                .lance(jose, 400.0)
                .constroi();
        
        leiloeiro.avalia(leilao);
        
        List<Lance> maiores = leiloeiro.getTresMaiores();
        assertEquals(3, maiores.size());

        assertThat(maiores, hasItems(
                new Lance(jose, 400),
                new Lance(joao, 300),
                new Lance(jose, 200)
        ));
        
    }
    
    @Test
    public void deveEntenderLeilaoComLancesEmOrdemRandomica(){
        Leilao leilao = new CriadorDeLeilao().para("Playstation 5 que finalmente tenho esperanças de comprar")
                .lance(joao, 200.0)
                .lance(jose, 450.0)
                .lance(joao, 120.0)
                .lance(jose, 700.0)
                .lance(jose, 630.0)
                .lance(jose, 230.0)
                .constroi();
    
        leiloeiro.avalia(leilao);

        assertThat(leiloeiro.getMenorLance(), equalTo(120.0));
        assertThat(leiloeiro.getMaiorLance(), equalTo(700.0));
    }
    
    @Test
    public  void deveEntenderLancesEmOrdemDecrescente() {
        //parte 1: criar cenários
        Leilao leilao = new CriadorDeLeilao().para("Playstation 5 que finalmente tenho esperanças de comprar")
                .lance(joao, 400.0)
                .lance(jose, 300.0)
                .lance(joao, 250.0)
                .constroi();
        
        //parte 2: executar ação
        leiloeiro.avalia(leilao);
        leiloeiro.mediaLances(leilao);
        
        //parte 3: validação        
        assertThat(leiloeiro.getMenorLance(), equalTo(250.0));
        assertThat(leiloeiro.getMaiorLance(), equalTo(400.0));
        
    }
    
    @Test(expected=RuntimeException.class)
    public void naoDeveAvaliarLeiloesSemNenhumLanceDado(){
             Leilao leilao = new CriadorDeLeilao().para("Playstation 5 que finalmente poderei comprar").constroi();
             leiloeiro.avalia(leilao);
    
    }
}
