//cliente
public class Main {
    public static void main(String[] args) {
        // Usando o builder para construir uma casa com 4 janelas, 2 portas e garagem
        Casa casa1 = new Casa.CasaBuilder()
                .setJanelas(4)
                .setPortas(2)
                .setGaragem(true)
                .build();
        
        System.out.println(casa1);

        // Construindo outra casa com 2 janelas, 1 porta, sem garagem
        Casa casa2 = new Casa.CasaBuilder()
                .setJanelas(2)
                .setPortas(1)
                .setGaragem(false)
                .build();
        
        System.out.println(casa2);
    }
}
