
package cap8;

public class SingletonServico {
    private Servico servico;
    
    
    public Servico getInstanciaServico(){
        if(servico == null){
            servico = new Servico();
        }
        return servico;
        
    }
    
    
}
