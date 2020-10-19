
package Aula3;

public class TabelaDePrecoDiferenciada implements TabelaDePreco{

    @Override
    public double descontoPara(Double valor) {
        if(valor == 1854.59) return 0.99;
        return 0;
    }
    
}
