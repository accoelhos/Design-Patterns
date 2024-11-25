public class App {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Cuidadora cuidadora = new Cuidadora();

        // Primeira edição
        editor.type("Olá, ");
        cuidadora.salvarEstado(editor.save());
        System.out.println("Estado 1: " + editor.getConteudo());

        // Segunda edição
        editor.type("mundo! ");
        cuidadora.salvarEstado(editor.save());
        System.out.println("Estado 2: " + editor.getConteudo());

        // Terceira edição
        editor.type("Bem-vindo ao padrão Memento.");
        cuidadora.salvarEstado(editor.save());
        System.out.println("Estado 3: " + editor.getConteudo());

        // Restaurando para o Estado 1
        editor.restaurar(cuidadora.getState(0));
        System.out.println("Desfeito para Estado 1: " + editor.getConteudo());

        // Restaurando para o Estado 2
        editor.restaurar(cuidadora.getState(1));
        System.out.println("Desfeito para Estado 2: " + editor.getConteudo());
    }
}
