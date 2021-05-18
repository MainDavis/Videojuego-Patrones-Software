package Decorator;

public class Gunwoman implements Estadisticas {

    @Override
    public int getVida(){
        return 3;
    }

    @Override
    public int getAtaque(){
        return 3;
    }

    @Override
    public int getMagia(){
        return 3;
    }

    @Override
    public int getDefensa(){
        return 1;
    }

    @Override
    public int getVelocidad(){
        return 5;
    }

    
    
}
