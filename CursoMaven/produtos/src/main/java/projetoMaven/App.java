package projetoMaven;

public class App {

    public static void main(String[] args) {
        
        Produto produto = new Produto("Bala juquinha sabor tangerina", 0.15);
        
        System.out.println("A bala que eu gosto �: " + produto.getNome() + ", e tem o pre�o de " + produto.getPreco());
    }
}
