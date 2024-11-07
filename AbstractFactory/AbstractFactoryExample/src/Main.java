public class Main {
    public static void criaBrinquedos(FabricaBrinquedo fabricaPlastico){
        Carro carro = fabricaPlastico.criaCarro();
        Boneca boneca = fabricaPlastico.criaBoneca();
        System.out.println(carro.cria());
        System.out.println(boneca.cria());
    }

    public static void main(String[] args) {
        FabricaBrinquedo fabricaPlastico = new FabricaBrinqPlastico();
        FabricaBrinquedo fabricaMadeira = new FabricaBrinqMadeira();
        System.out.println("Brinquedos de plastico: ");
        criaBrinquedos(fabricaPlastico);
        System.out.println("\nBrinquedos de madeira: ");
        criaBrinquedos(fabricaMadeira);
    }

}


