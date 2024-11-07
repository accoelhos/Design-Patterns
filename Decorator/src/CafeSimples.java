//componente concreto
public class CafeSimples implements Cafe{

    @Override
    public String getDescricao(){
        return "Cafe";
    }
    @Override
    public double custo(){
        return 2.00;
    }
}   
