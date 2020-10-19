
package Aula3;

class TabelaDePrecoPadrao implements TabelaDePreco{
    
    @Override
    public double descontoPara(Double valor) {
        if(valor > 1000) return 0.05;
        return 0;
    }
    
}
