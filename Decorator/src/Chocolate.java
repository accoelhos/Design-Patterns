//decorador concreto
public class Chocolate extends CafeDecorator{

    public Chocolate(Cafe cafe) {
        super(cafe); 
    }
    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", Chocolate";
    }
    @Override
    public double custo() {
        return cafe.custo() + 1;
    }
}
