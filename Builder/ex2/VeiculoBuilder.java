//interface 
public interface VeiculoBuilder {
        VeiculoBuilder setTipo(String tipo);
        VeiculoBuilder setModelo(String modelo);
        VeiculoBuilder setNumeroDePortas(Integer numeroDePortas);
        Veiculo build();
    }
}
