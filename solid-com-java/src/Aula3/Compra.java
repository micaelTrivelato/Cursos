
package Aula3;

class Compra {
    private double valor;
    private String cidade;

    public Compra(double valor, String cidade) {
        this.valor = valor;
        this.cidade = cidade;
    }

    public double getValor() {
        return valor;
    }

    public String getCidade() {
        return cidade;
    }
}
