//diretor 
public class Diretor {
    public Veiculo construirCarro(String modelo, int numeroDePortas) {
        return new Veiculo.Builder()
                .setTipo("Carro")
                .setModelo(modelo)
                .setNumeroDePortas(numeroDePortas)
                .build();
    }
    public Veiculo construirMoto(String modelo) {
        return new Veiculo.Builder()
                .setTipo("Moto")
                .setModelo(modelo)
                .setNumeroDePortas(null) 
                .build();
    }
}
