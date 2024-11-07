//decorador base
public abstract class CafeDecorator implements Cafe{
    protected Cafe cafe;
    public CafeDecorator(Cafe cafe){
        this.cafe = cafe;
    }
    @Override
    public String getDescricao(){
        return cafe.getDescricao();
    }
    @Override
    public double custo(){
        return cafe.custo();
    }
}
