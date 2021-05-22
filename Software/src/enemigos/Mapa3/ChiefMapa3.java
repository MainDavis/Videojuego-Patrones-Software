package enemigos.Mapa3;

import enemigos.Enemigo;

public class ChiefMapa3 extends Enemigo{

    public ChiefMapa3(int HP, int ATK, int MAG,int DEF, int SPD){
        super(HP+2, ATK, MAG+2, DEF+2, SPD);
    }
    
}