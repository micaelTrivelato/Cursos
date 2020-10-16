package cap4Cap5;

public class Visitor {
    public void visitaSoma(Soma soma){
        System.out.print("(");
        
        // esquerda
        soma.getEsquerda().aceita(this);
        
        System.out.print(" + ");
        
        // direita
        soma.getDireita().aceita(this);
        
        System.out.print(")");
    }
    
    public void visitaSubtracao(Subtracao subtracao){
        System.out.print("(");
        
        // esquerda
        subtracao.getEsquerda().aceita(this);
        
        System.out.print(" - ");
        
        // direita
        
        subtracao.getDireita().aceita(this);
        
        System.out.print(")");
    }
    
    public void visitaSomaPre(Soma soma){
        System.out.print("(");
        
        // esquerda
        
        
        System.out.print(" + ");
        soma.getEsquerda().aceita(this);
        System.out.print(" ");
        // direita
        soma.getDireita().aceita(this);
        
        System.out.print(")");
    }
    
    public void visitaSubtracaoPre(Subtracao subtracao){
        System.out.print("(");
        
        // esquerda
        
        
        System.out.print(" - ");
        subtracao.getEsquerda().aceita(this);
        System.out.print(" ");
        // direita
        
        subtracao.getDireita().aceita(this);
        
        System.out.print(")");
    }
    
    public void visitaNumero(Numero numero){
        System.out.print(numero.getNumero());

    }
}
