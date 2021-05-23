package enemigos.Mapa4;

import enemigos.Enemigo;

public class ChiefMapa4 extends Enemigo{

    public ChiefMapa4(int HP, int ATK, int MAG,int DEF, int SPD){
        super(HP+150, ATK, MAG+3, DEF+3, SPD+3);
    }
    
}