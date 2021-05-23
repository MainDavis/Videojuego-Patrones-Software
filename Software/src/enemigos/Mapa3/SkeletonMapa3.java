package enemigos.Mapa3;

import enemigos.Enemigo;

public class SkeletonMapa3 extends Enemigo{

    public SkeletonMapa3(int HP, int ATK, int MAG,int DEF, int SPD){
        super(HP+100, ATK+2, MAG, DEF+2, SPD);
    }
    
}