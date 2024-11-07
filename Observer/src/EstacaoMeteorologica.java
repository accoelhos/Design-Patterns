import java.util.ArrayList;
import java.util.List;
//mantem uma lista de apps que estao observando a temperatura
//publicadora
public class EstacaoMeteorologica {
    private List<Observador> apps = new ArrayList<>();
    private float temperatura;

    public void addApp(Observador app){
        apps.add(app);
    }
    public void removerApp(Observador app){
        apps.remove(app);
    }
    public void setTemperatura(float novaTemp){
        this.temperatura = novaTemp;
        notificarApps();
    }
    private void notificarApps(){
        for(Observador app : apps){
            app.atualizar(temperatura);
        }
    }
}
