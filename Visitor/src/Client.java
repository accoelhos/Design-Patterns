public class Client {
    public static void main(String[] args) throws Exception {
        Livro l = new Livro(26.8);
        Notebook n = new Notebook(1950.90);
        
        Taxador t = new Taxador();

        System.out.println("Calculando imposto sobre os produtos...");
        l.accept(t);
        n.accept(t);
    }
}
