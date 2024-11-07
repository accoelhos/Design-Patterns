import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        RefrigeranteFactory rf = new RefrigeranteFactory();
        Refrigerante refrigerante = null;

        System.out.println("Cola-cola -> c");
        System.out.println("\nFanta laranja -> f");
        System.out.println("\nSelecione um refrigerante:");

        String tipo = scan.nextLine();
        refrigerante = rf.fazRefrigerante(tipo);

        if(refrigerante != null){
            executar(refrigerante);
        }else System.out.println("Digite c ou f...");
        scan.close();
    }
    public static void executar(Refrigerante refri){
        refri.abrirRefri();
    }
}
