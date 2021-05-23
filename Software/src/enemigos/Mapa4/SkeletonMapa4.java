package enemigos.Mapa4;

import enemigos.Enemigo;

public class SkeletonMapa4 extends Enemigo{

    public SkeletonMapa4(int HP, int ATK, int MAG,int DEF, int SPD){
        super(HP+150, ATK+3, MAG, DEF+3, SPD+3);
    }
    
}