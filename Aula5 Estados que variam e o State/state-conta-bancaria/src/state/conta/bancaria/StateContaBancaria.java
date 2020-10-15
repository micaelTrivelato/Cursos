
package state.conta.bancaria;

public class StateContaBancaria {

    public static void main(String[] args) {
        Conta conta = new Conta(1000.0);
        
        System.out.println(conta.getSaldo());
        
        conta.realizaDeposito(1000);
        
        System.out.println(conta.getSaldo());
        
        conta.realizaSaque(981);
        
        System.out.println(conta.getSaldo());
        
        conta.realizaSaque(1000);
        
        System.out.println(conta.getSaldo());
        
        //conta.realizaSaque(1);
        conta.realizaDeposito(1000);
        
        System.out.println(conta.getSaldo());
    }
    
}
