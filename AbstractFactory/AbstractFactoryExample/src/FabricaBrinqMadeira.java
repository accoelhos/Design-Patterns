public class FabricaBrinqMadeira implements FabricaBrinquedo{
    @Override
    public Carro criaCarro(){
        return new CarroMadeira();
    }

    @Override
    public Boneca criaBoneca(){
        return new BonecaMadeira();
    }
}
