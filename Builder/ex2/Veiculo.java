public class Veiculo {
    private String tipo;  // Carro ou Moto
    private String modelo; // Modelo do veículo
    private Integer numeroDePortas; // Número de portas (apenas para carros)

    // Construtor privado, usado apenas pelo Builder
    private Veiculo(String tipo, String modelo, Integer numeroDePortas) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.numeroDePortas = numeroDePortas;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }
     public static class Builder implements VeiculoBuilder {
        private String tipo;
        private String modelo;
        private Integer numeroDePortas;

        public Builder setTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Builder setNumeroDePortas(Integer numeroDePortas) {
            this.numeroDePortas = numeroDePortas;
            return this;
        }

        public Veiculo build() {
            return new Veiculo(tipo, modelo, numeroDePortas);
        }
    }
}
