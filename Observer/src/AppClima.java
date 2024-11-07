//assinante
public class AppClima implements Observador{
    private String nome;
    public AppClima(String nome){
        this.nome = nome;
    }
    @Override
    public void atualizar(float temperatura){
        System.out.println(nome+ " recebeu a nova temperatura "+temperatura);
    }
}
