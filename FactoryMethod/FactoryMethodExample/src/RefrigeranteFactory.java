public class RefrigeranteFactory {
    public Refrigerante fazRefrigerante(String tipo){
        Refrigerante refri = null;
        return switch (tipo) {
            case "c" -> new CocaCola();
            case "f" -> new FantaLaranja();
            default -> null;
        };
    }
}
