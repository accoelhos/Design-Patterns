//builder
public class VeiculoBuilder {
    private String tipo;
    private String modelo;
    private Integer numeroDePortas;

    public VeiculoBuilder setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public VeiculoBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public VeiculoBuilder setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
        return this;
    }

    public Veiculo build() {
        Veiculo veiculo = new Veiculo();
        veiculo.tipo = this.tipo;
        veiculo.modelo = this.modelo;
        veiculo.numeroDePortas = this.numeroDePortas;
        return veiculo;
    }
}
