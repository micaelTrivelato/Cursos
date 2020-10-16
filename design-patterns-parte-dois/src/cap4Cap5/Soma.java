package cap4Cap5;

public class Soma implements Expressao {

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }

    private Expressao esquerda;
    private Expressao direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
       int valorDaEsquerda = getEsquerda().avalia();
       int valorDaDireita = getDireita().avalia();
       return valorDaEsquerda + valorDaDireita;
    }

    @Override
    public void aceita(Visitor impressora) {
        impressora.visitaSomaPre(this);
    }
    
}
