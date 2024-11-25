public class Notebook implements IProduto{
    private double preco;
    public Notebook(double preco){
        this.preco = preco;
    }
    @Override
    public void accept(IVisitante visitante) {
        visitante.visitar(this);
    }
    public double getPreco() {
        return preco;
    }
}
