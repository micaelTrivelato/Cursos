package Aula1;

public class Funcionario {
    private Cargo cargo;
    private double SalarioBase;

    public Funcionario(double SalarioBase) {
        this.cargo = cargo;
        this.SalarioBase = SalarioBase;
    }    
    
    public Cargo getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    double calculaSalario() {
        return cargo.getRegra().calcula(this);
    }
}
