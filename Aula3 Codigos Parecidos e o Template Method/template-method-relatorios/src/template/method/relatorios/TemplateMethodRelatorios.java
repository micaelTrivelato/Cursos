
package template.method.relatorios;

import java.util.ArrayList;
import java.util.List;


public class TemplateMethodRelatorios {


    public static void main(String[] args) {
        List<Conta> listaConta = new ArrayList();
        
        Conta conta = new Conta("José", "0123456789", "1234", 500.0);
        Conta conta2 = new Conta("Maria", "9876543210", "4321", 600.0);
        
        listaConta.add(conta);
        listaConta.add(conta2);
        RelatorioSimples relatorio1 = new RelatorioSimples();
        RelatorioComplexo relatorio2 = new RelatorioComplexo();
        
        relatorio1.cabecalho();
        relatorio1.corpo(listaConta);
        relatorio1.rodape();
        System.out.println("");
        relatorio2.cabecalho();
        relatorio2.corpo(listaConta);
        relatorio2.rodape();
        
    }
    
}
