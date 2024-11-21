public interface ReembolsoHandler {
    void setProximo(ReembolsoHandler handler); //proximo da cadeia
    void processarPedido(double valor); //metodo para processar
}
