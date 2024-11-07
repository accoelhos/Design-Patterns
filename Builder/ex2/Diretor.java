//diretor 
public class Diretor {
    private VeiculoBuilder builder;

    public Diretor() {
        this.builder = new VeiculoBuilder();
    }

    public Veiculo construirCarro(String modelo, int numeroDePortas) {
        return builder.setTipo("Carro").setModelo(modelo).setNumeroDePortas(numeroDePortas).build();
    }

    public Veiculo construirMoto(String modelo) {
        return builder.setTipo("Moto").setModelo(modelo).setNumeroDePortas(null).build();
    }
}
