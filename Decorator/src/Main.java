public class Main {
    public static void main(String[] args) {
        Cafe cafe = new CafeSimples();
        System.out.println(cafe.getDescricao() + " custa: R$" + cafe.custo());

        // Adicionando leite ao café
        cafe = new Leite(cafe);
        System.out.println(cafe.getDescricao() + " custa: R$" + cafe.custo());

        // Adicionando chocolate ao café com leite
        cafe = new Chocolate(cafe);
        System.out.println(cafe.getDescricao() + " custa: R$" + cafe.custo());
    }
}

