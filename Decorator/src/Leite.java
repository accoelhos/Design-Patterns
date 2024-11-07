//decorador concreto
public class Leite extends CafeDecorator{
    public Leite(Cafe cafe) {
        super(cafe);
    }
    @Override
    public String getDescricao(){
        return cafe.getDescricao()+ ", Leite";
    }
    @Override
    public double custo(){
        return cafe.custo() + 0.50;
    }

}
