package Decorator;

public class DecoratedMundo extends Decorator {

    public DecoratedMundo(Estadisticas estadistica){
        super(estadistica);
    }
    @Override

    public int getVida(){
        return getEstadisticas().getVida() + 1;
    }

    public int getAtaque(){
        return getEstadisticas().getAtaque() +1;
    }

    public int getMagia(){
        return getEstadisticas().getMagia() + 1;
    }

    public int getDefensa(){
        return getEstadisticas().getDefensa() + 1;
    }

    public int getVelocidad(){
        return getEstadisticas().getVelocidad() + 1;
    }

    
}
