package enemigos.Mapa3;

import enemigos.Enemigo;

public class WolfMapa3 extends Enemigo{

    public WolfMapa3(int HP, int ATK, int MAG,int DEF, int SPD){
        super(HP+2, ATK+2, MAG, DEF, SPD+2);
    }
    
}