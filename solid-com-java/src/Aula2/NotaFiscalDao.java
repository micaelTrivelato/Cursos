
package Aula2;

class NotaFiscalDao implements AcaoAposGerarNota{

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("NF salva no banco");
    }
    
}
