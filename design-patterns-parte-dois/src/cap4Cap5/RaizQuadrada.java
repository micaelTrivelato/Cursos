package cap4Cap5;

public class RaizQuadrada implements Expressao{
    private Expressao numero;
    
    public RaizQuadrada(Expressao numero) {
        this.numero = numero;
    }

    @Override
    public int avalia() {
       int valorDaEsquerda = numero.avalia();
       return (int) Math.sqrt(valorDaEsquerda);
    }

    @Override
    public void aceita(Visitor impressora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
