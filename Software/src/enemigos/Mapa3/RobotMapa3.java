package enemigos.Mapa3;

import enemigos.Enemigo;

public class RobotMapa3 extends Enemigo{

    public RobotMapa3(int HP, int ATK, int MAG,int DEF, int SPD){
        super(HP+100, ATK+2, MAG, DEF+2, SPD);
    }
    
}