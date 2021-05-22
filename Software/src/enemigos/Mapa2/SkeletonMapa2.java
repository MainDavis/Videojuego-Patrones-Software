package enemigos.Mapa2;

import enemigos.Enemigo;

public class SkeletonMapa2 extends Enemigo{

    public SkeletonMapa2(int HP, int ATK, int MAG,int DEF, int SPD){
        super(HP, ATK+1, MAG, DEF, SPD);
    }
    
}
