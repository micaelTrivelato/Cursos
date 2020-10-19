
package Aula1;

import static Aula1.Cargo.DBA;
import static Aula1.Cargo.DESENVOLVEDOR;
import static Aula1.Cargo.TESTER;

public class CalculadoraDeSalario {
    
    public double calcula(Funcionario funcionario){
        return funcionario.calculaSalario();
    }
   
}
