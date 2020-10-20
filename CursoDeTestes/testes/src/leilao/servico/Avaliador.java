package leilao.servico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import leilao.Lance;
import leilao.Leilao;

public class Avaliador {
    
    private double maiorDeTodos = Double.NEGATIVE_INFINITY;
    private double menorDeTodos = Double.POSITIVE_INFINITY;
    private double mediaLances;
    private List<Lance> maiores;
    
    public void avalia(Leilao leilao){
        
        if(leilao.getLances().size() == 0){
            throw new RuntimeException("Não é possível avaliar um sem lances!");
        }
        
        for(Lance lance : leilao.getLances()){
            if(lance.getValor() > maiorDeTodos) maiorDeTodos = lance.getValor();                          
            if(lance.getValor() < menorDeTodos) menorDeTodos = lance.getValor();                          
        }
        
        pegaOsMaioresNo(leilao);
        
    }
    
    private void pegaOsMaioresNo(Leilao leilao) {
        maiores = new ArrayList<Lance>(leilao.getLances());
        Collections.sort(maiores, new Comparator<Lance>(){
            @Override
            public int compare(Lance o1, Lance o2) {
                if(o1.getValor() < o2.getValor()) return 1;
                if(o1.getValor() > o2.getValor()) return -1;
                return 0;
            }
        });
        
        maiores = maiores.subList(0, maiores.size() > 3 ? 3 : maiores.size());
    }
    
    public void mediaLances(Leilao leilao){
        int cont = 0;
        for(Lance lance: leilao.getLances()){
            cont++;
            mediaLances += lance.getValor();
        }
        mediaLances = mediaLances /cont;
    }

    public List<Lance> getTresMaiores() {
        return maiores;
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
