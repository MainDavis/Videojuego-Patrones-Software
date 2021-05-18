package Decorator;

public class Knight implements Estadisticas {
    
    @Override
    public int getVida(){
        return 5;
    }

    @Override
    public int getAtaque(){
        return 4;
    }

    @Override
    public int getMagia(){
        return 1;
    }

    @Override
    public int getDefensa(){
        return 4;
    }

    @Override
    public int getVelocidad(){
        return 1;
    }

    
}
