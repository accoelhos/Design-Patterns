//cliente
public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        Veiculo carro = diretor.construirCarro("Fusca", 2);
        System.out.println("Veículo tipo: " + carro.getTipo() + ", Modelo: " + carro.getModelo() + ", Número de portas: " + carro.getNumeroDePortas());
        Veiculo moto = diretor.construirMoto("Honda PCX");
        System.out.println("Veículo tipo: " + moto.getTipo() + ", Modelo: " + moto.getModelo() + ", Sem número de portas");
    }
}
