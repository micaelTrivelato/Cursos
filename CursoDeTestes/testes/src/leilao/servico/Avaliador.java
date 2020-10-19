package leilao.servico;

import leilao.Lance;
import leilao.Leilao;

public class Avaliador {
    
    private double maiorDeTodos = Double.NEGATIVE_INFINITY;
    private double menorDeTodos = Double.POSITIVE_INFINITY;
    private double mediaLances;
    
    public void avalia(Leilao leilao){
        for(Lance lance : leilao.getLances()){
            if(lance.getValor() > maiorDeTodos) maiorDeTodos = lance.getValor();                          
            if(lance.getValor() < menorDeTodos) menorDeTodos = lance.getValor();                          
        }
    }
    public void mediaLances(Leilao leilao){
        int cont = 0;
        for(Lance lance: leilao.getLances()){
            cont++;
            mediaLances += lance.getValor();
        }
        mediaLances = mediaLances /cont;
    }
    
    public double getMediaLances(){
        return mediaLances;
    }

    public double getMaiorLance() {
        return maiorDeTodos;
    }
    
    public double getMenorLance() {
        return menorDeTodos;
    }
    
}
