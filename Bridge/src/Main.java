//cliente
public class Main {
    public static void main(String[] args) throws Exception {
        Dispositivo tv = new Televisao();
        Dispositivo radio = new Radio();

        ControleRemoto controleTv = new ControleRemoto(tv);
        ControleRemoto controleRadio = new ControleRemoto(radio);

        System.out.println("=== Controle da TV ===");
        controleTv.ligar();
        controleTv.desligar();

        System.out.println("\n=== Controle do Rádio ===");
        controleRadio.ligar();
        controleRadio.desligar();
    }
}
