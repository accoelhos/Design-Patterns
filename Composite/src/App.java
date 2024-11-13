//cliente
public class App {
    public static void main(String[] args) {
        //produtos simples
        Produto produto1 = new Produto("Livro", 50);
        Produto produto2 = new Produto("Caneta", 5);
        Produto produto3 = new Produto("Caderno", 15);

        //caixa principal
        Caixa caixaPrincipal = new Caixa("Caixa Grande", 10);

        //caixa menor dentro da caixa principal
        Caixa caixaMenor = new Caixa("Caixa Pequena", 5);

        //adiciona itens na caixa menor
        caixaMenor.addItem(produto1);
        caixaMenor.addItem(produto2);

        //adiciona itens na caixa principal
        caixaPrincipal.addItem(caixaMenor);
        caixaPrincipal.addItem(produto3);
        //preco da caixa menor
        System.out.println("Conteúdo da "+caixaMenor);
        //exibe o preço total da caixa principal
        System.out.println("Conteúdo da " + caixaPrincipal);
        System.out.println("- " + produto1);
        System.out.println("- " + produto2);
        System.out.println("- " + produto3);
        System.out.println("Preço total do pedido: R$" + caixaPrincipal.getPreco());
    }
}
