public class Main {
    public static void main(String[] args) {
        BebidaQuente cha = new Cha();
        System.out.println("Preparando cha: ");
        cha.prepararBebida();

        System.out.println("\nPreparando cafe: ");
        BebidaQuente cafe = new Cafe();
        cafe.prepararBebida();
    }
}
