//main
public class Aeroporto {
    public static void main(String[] args) throws Exception {
        //criando o mediador
        TorreDeControle torre = new TorreDeControle();
        //avioes
        Aviao aviao1 = new Aviao("Aviao 1", torre);
        Aviao aviao2 = new Aviao("Aviao 2", torre);
        //registrando avioes na torre
        torre.registrarAvioes(aviao1, aviao2);
        //enviando mensagens pelo mediador
        aviao1.enviarMsg("oiii aviao2");
        aviao2.enviarMsg("oie aviao1 tudo bem?");
    }
}
