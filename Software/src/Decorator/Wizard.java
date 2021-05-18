package Decorator;

public class Wizard implements Estadisticas {

    
    @Override
    public int getVida(){
        return 3;
    }

    @Override
    public int getAtaque(){
        return 1;
    }

    @Override
    public int getMagia(){
        return 5;
    }

    @Override
    public int getDefensa(){
        return 3;
    }

    @Override
    public int getVelocidad(){
        return 3;
    }

    
    
}
