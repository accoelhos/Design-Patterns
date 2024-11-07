public class FabricaBrinqPlastico implements FabricaBrinquedo{
    
    @Override
    public Carro criaCarro(){
        return new CarroPlastico();
    }

    @Override
    public Boneca criaBoneca(){
        return new BonecaPlastico();
    }
}
