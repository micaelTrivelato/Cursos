
package DesignPattern;

public interface Desconto {
    double desconto(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
