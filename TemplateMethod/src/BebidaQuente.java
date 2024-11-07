public abstract class BebidaQuente {
    //metodo template -> define a sequencia de passos
    public final void prepararBebida(){
        ferverAgua();
        addIngredientePrincipal();
        addCondimnentos();
        servir();
    }
    //passos comuns para todas as bebidas quentes
    private void ferverAgua(){
        System.out.println("Fervendo a água...");
    }
    private void servir(){
        System.out.println("Servindo a bebida...");
    }
    //passos que serão implementados nas subclasses
    protected abstract void addIngredientePrincipal();
    protected abstract void addCondimnentos();

}
