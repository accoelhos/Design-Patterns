public class Refrigerante {
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void abrirRefri(){
        System.out.println("Voce abriu uma lata de "+getNome());
    }

}
