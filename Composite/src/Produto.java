//folha -> implementa item
public class Produto implements Item{
    private String nome;
    private double preco;

    //construtor 
    public Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public double getPreco() {
        return preco;
    }
    @Override
    public String toString(){
        return nome + " - R$ "+preco;
    }

}
