package cap4Cap5;

public class Divisao implements Expressao{
    
    private Expressao esquerda;
    private Expressao direita;
    
    public Divisao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
       int valorDaEsquerda = esquerda.avalia();
       int valorDaDireita = direita.avalia();
       return valorDaEsquerda / valorDaDireita;
    }

    @Override
    public void aceita(Visitor impressora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
