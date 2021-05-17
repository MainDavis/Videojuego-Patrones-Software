package Decorator;

public abstract class Decorator implements Estadisticas{

    private Estadisticas estadistica;

    public Decorator(Estadisticas estadistica){
        setEstadisticas(estadistica);
        
    }

    protected Estadisticas getEstadisticas(){
        return estadistica;
    }
     


    private void setEstadisticas(Estadisticas estadistica2) {
        this.estadistica = estadistica;
    }





    
}