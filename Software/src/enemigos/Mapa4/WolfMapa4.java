package enemigos.Mapa4;

import enemigos.Enemigo;

public class WolfMapa4 extends Enemigo{

    public WolfMapa4(int HP, int ATK, int MAG,int DEF, int SPD){
        super(HP+150, ATK+3, MAG+3, DEF, SPD+3);
    }
    
}