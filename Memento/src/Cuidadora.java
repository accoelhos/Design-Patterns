//caretaker -> gerencia os estados salvos
import java.util.ArrayList;
import java.util.List;

public class Cuidadora {
    private final List<Memento> estadosSalvos = new ArrayList<>();

    public void salvarEstado(Memento m){
        estadosSalvos.add(m);
    }
    public Memento getState(int i){
        if(i<0 || i>=estadosSalvos.size()){
            throw new IndexOutOfBoundsException("Estado invalido");
        }
        return estadosSalvos.get(i);
    }
    public int getEstadosSalvosCount(){
        return estadosSalvos.size();
    }

}
