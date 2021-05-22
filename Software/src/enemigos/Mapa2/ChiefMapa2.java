package enemigos.Mapa2;

import enemigos.Enemigo;

public class ChiefMapa2 extends Enemigo{

    public ChiefMapa2(int HP, int ATK, int MAG,int DEF, int SPD){
        super(HP, ATK, MAG+1, DEF, SPD);
    }
    
}
