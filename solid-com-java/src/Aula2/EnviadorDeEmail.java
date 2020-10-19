
package Aula2;

class EnviadorDeEmail implements AcaoAposGerarNota{

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Email enviado");
    }
    
}
