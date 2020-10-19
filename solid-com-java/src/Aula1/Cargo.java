package Aula1;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new QuinzeOuVinteCincoPorCento()),
    TESTER(new QuinzeOuVinteCincoPorCento());
    
    private RegraDeCalculo regra;
    
    Cargo(RegraDeCalculo regra){
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}

