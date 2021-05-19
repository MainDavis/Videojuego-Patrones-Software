package Decorator;

public abstract class Decorator implements Estadisticas{

    private Estadisticas estadistica;

    public Decorator(Estadisticas estadistica){
        setEstadisticas(estadistica);
        
    }

    protected Estadisticas getComponent(){
        return estadistica;
    }
     


    private void setEstadisticas(Estadisticas estadistica) {
        this.estadistica = estadistica;
    }

}