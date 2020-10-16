
package cap4Cap5;

public class Programa {

    public static void main(String[] args) {       
        //(10-5) + (2+10)
        //Expressao esquerda = new Multiplicacao(new Numero(3), new Numero(2));
        //Expressao direita = new Divisao(new Numero(60), new Numero(2));
        
        Expressao esquerda = new Soma(new Numero(5), new Numero(7));
        Expressao direita = new Subtracao(new Numero(2), new Numero(10));
        Expressao soma = new Soma(esquerda, direita);
        //Expressao raiz = new RaizQuadrada(soma);
        
        int resultadoSoma = soma.avalia();
        //int resultadoRaiz = raiz.avalia();
        
        System.out.println(resultadoSoma);
        //System.out.println(resultadoRaiz);
        
        Visitor impressora = new Visitor();
        soma.aceita(impressora);
        
        
        
        
    }
    
}
