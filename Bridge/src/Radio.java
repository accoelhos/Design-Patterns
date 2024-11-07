public class Radio implements Dispositivo{
    @Override
    public void ligar() {
        System.out.println("Rádio ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Rádio desligado.");
    }
}
