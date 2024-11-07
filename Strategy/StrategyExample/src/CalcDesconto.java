public class CalcDesconto {
    private DescontoStrategy strategy;

    public CalcDesconto(DescontoStrategy strategy){
        this.strategy = strategy;
    }

    public double calcularPrecoDesc(double preco){
        return strategy.aplicarDesconto(preco);
    }

    public void setStrategy(DescontoStrategy strategy){
        this.strategy = strategy;
    }

}
