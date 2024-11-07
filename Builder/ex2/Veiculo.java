public class Veiculo {
    private String tipo;  // Carro ou Moto
    private String modelo; // Modelo do veículo
    private Integer numeroDePortas; // Número de portas (apenas para carros)

    // Construtor vazio
    public Veiculo() {
    }
    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    // Getters
    public String getTipo() {
        return tipo;
    }
    public String getModelo() {
        return modelo;
    }
    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }
    // Classe Builder interna que implementa VeiculoBuilder
    public static class Builder implements VeiculoBuilder {
        private Veiculo veiculo;
        public Builder() {
            veiculo = new Veiculo(); // Cria o objeto Veiculo com o construtor vazio
        }
        @Override
        public VeiculoBuilder setTipo(String tipo) {
            veiculo.setTipo(tipo); 
            return this;
        }
        @Override
        public VeiculoBuilder setModelo(String modelo) {
            veiculo.setModelo(modelo); 
            return this;
        }
        @Override
        public VeiculoBuilder setNumeroDePortas(Integer numeroDePortas) {
            veiculo.setNumeroDePortas(numeroDePortas); 
            return this;
        }
        @Override
        public Veiculo build() {
            return veiculo; //Retorna o objeto Veiculo construído
        }
    }
}
