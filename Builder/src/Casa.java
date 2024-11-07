public class Casa {
    private int janelas;
    private int portas;
    private boolean garagem;

    // Construtor privado para impedir a criação direta
    private Casa(int janelas, int portas, boolean garagem) {
        this.janelas = janelas;
        this.portas = portas;
        this.garagem = garagem;
    }

    @Override
    public String toString() {
        return "Casa [Janelas: " + janelas + ", Portas: " + portas + ", Garagem: " + (garagem ? "Sim" : "Não") + "]";
    }

    // Classe interna (encapsulada para facilitar o acesso) CasaBuilder implementando a interface Builder
    public static class CasaBuilder implements Builder {
        private int janelas;
        private int portas;
        private boolean garagem;

        @Override
        public CasaBuilder setJanelas(int janelas) {
            this.janelas = janelas;
            return this;
        }

        @Override
        public CasaBuilder setPortas(int portas) {
            this.portas = portas;
            return this;
        }

        @Override
        public CasaBuilder setGaragem(boolean garagem) {
            this.garagem = garagem;
            return this;
        }

        @Override
        public Casa build() {
            return new Casa(janelas, portas, garagem);
        }
    }
}

