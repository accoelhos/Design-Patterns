//elemento concreto
public class Livro implements IProduto{
    private double preco;
    public Livro(double preco){
        this.preco = preco;
    }
    @Override
    public void accept(IVisitante v) {
        v.visitar(this);
    }
    public double getPreco() {
        return preco;
    }

}
