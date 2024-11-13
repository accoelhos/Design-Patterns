//conteiner (composite) -> também implementa Item
import java.util.ArrayList;
import java.util.List;

public class Caixa implements Item{
    private String nome;
    private List<Item> itens = new ArrayList<>();
    private double custoExtra;

    public Caixa(String nome, double custoExtra){
        this.nome = nome;
        this.custoExtra = custoExtra;
    }
    public void addItem(Item item){
        itens.add(item);
    }
    @Override
    public double getPreco() {
        double precoTotal = custoExtra;
        for(Item item : itens){
            precoTotal += item.getPreco();
        }
        return precoTotal;
    }
    @Override
    public String toString(){
        return nome + " - R$ "+getPreco();
    }
}

