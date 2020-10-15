package DesignPattern;

public class TesteDeImpostosComplexos {

    public static void main(String[] args) {
        
        Imposto impostoMuitoAlto = new ImpostoMuitoAlto(new ICMS(new ISS()));
        Imposto ikcv = new IKCV(new ICPP(new ICMS()));
        
        Orcamento orcamento = new Orcamento(1000);
        Orcamento orcamento2 = new Orcamento(1000);
        
        double valor = impostoMuitoAlto.calcula(orcamento);
        
        System.out.println(valor);
        
        double valor2 = ikcv.calcula(orcamento2);
        
        System.out.println(valor2);
    }
    
}
