public class Taxador implements IVisitante{
    //implementações da interface
    double imposto;
    @Override
    public void visitar(Livro l){
        imposto = l.getPreco()*0.3;
        System.out.println("O imposto para esse livro é de: R$"+imposto);
    }
    @Override
    public void visitar(Notebook n){
        imposto = n.getPreco()*0.4;
        System.out.println("O imposto para esse notebook é de: R$"+ imposto);
    }

}
